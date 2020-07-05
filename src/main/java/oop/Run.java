package oop;

import oop.controller.UserController;
import oop.model.User;
import oop.model.enums.Gender;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        UserController uc = new UserController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Co chcesz zrobic? \n1) Rejestracja \n2) Logowanie \nQ. Wyjscie");
            String choice = scanner.nextLine().toUpperCase();
            if (choice.equals("1")) {
                System.out.println("Podaj imie: ");
                String name = scanner.nextLine();
                System.out.println("Podaj nazwisko: ");
                String lastName = scanner.nextLine();
                System.out.println("Podaj email: ");
                String mail = scanner.nextLine();
                System.out.println("Podaj haslo: ");
                String password = scanner.nextLine();
                System.out.println("Podaj plec (M/K): ");
                String genderInput = scanner.nextLine();
                Gender gender = genderInput.equals("M") ? Gender.MAN : Gender.WOMAN;
                System.out.println("Podaj telefon: ");
                String phone = scanner.nextLine();
                uc.registerUser(new User (name, lastName, mail, password, phone, gender));

            }else if (choice.equals("2")){

            }else if (choice.equals("Q")) {
                System.out.println("Wyjscie");
            } break;
        }
    }
}
