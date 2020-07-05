package oop;

import oop.controller.UserController;
import oop.controller.UserControllerTempl;
import oop.model.User;
import oop.model.enums.Gender;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        UserController uc = new UserController();
        Scanner scanner = new Scanner(System.in);
        List<User> users = UserControllerTempl.users;
        while (true) {
            System.out.println("Co chcesz zrobic? \n1) Rejestracja \n2) Lista uzytkownikow \nQ. Wyjscie");
            String choice = scanner.nextLine().toUpperCase();
            if (choice.equals("1")) {
                System.out.println("Podaj imie: ");
                String name = scanner.nextLine();
                System.out.println("Podaj nazwisko: ");
                String lastName = scanner.nextLine();
                System.out.println("Podaj email: ");
                String mail = scanner.nextLine();
                String emailPattern = "^\\S{1,}[@]\\S{1,}$";
                if (!Pattern.matches(emailPattern,mail)) {
                    System.out.println("Wprowadzono bledne email!");
                    continue;
                }
                System.out.println("Podaj haslo: ");
                String password = scanner.nextLine();
                System.out.println("Podaj telefon: ");
                String phone = scanner.nextLine();
                String phonePattern = "^[0-9]{3}-[0-9]{3}-[0-9]{3}$";
                if (!Pattern.matches(phonePattern, phone)) {
                    System.out.println("Bledny numer telefonu!");
                    continue;
                }
                System.out.println("Podaj plec (M/K): ");
                String genderInput = scanner.nextLine().toUpperCase(); //toUpperCase значит все буквы будут заглавные
                Gender gender = genderInput.equals("M") ? Gender.MAN : Gender.WOMAN;
                String genderPattern = "^[MK]{1}$";
                if (!Pattern.matches(genderPattern, genderInput)) {
                    System.out.println("Blednie wprowadzona plec!");
                    continue;
                }
                uc.registerUser(new User(name, lastName, mail, password, phone, gender));

            } else if (choice.equals("2")) {
                uc.findAllUsers().forEach(user -> System.out.println(user));
            } else if (choice.equals("Q")) {
                System.out.println("Wyjscie");
                break;
            } else {
                System.out.println("Bledny wybor");
            }
        }
    }
}
