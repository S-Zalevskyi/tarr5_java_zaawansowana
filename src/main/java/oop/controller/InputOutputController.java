package oop.controller;

import oop.model.User;
import oop.model.enums.Gender;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class InputOutputController {

    private String userFilePath = "C:\\Users\\Rent\\Documents\\kurs_java\\tarr5_java_zaawansowana\\src\\main\\resources\\file\\users.csv";

            public void saveUsersToFile () {
                try {
                    PrintWriter pw = new PrintWriter(new File(userFilePath));
                    for (User user : UserControllerTempl.users){
                        pw.println(String.format("%d;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s",
                                user.getUserId(), user.getName(), user.getLastName(), user.getEmail(), user.getPassword(),
                                user.getPhone(), user.getGender(), user.getRoles(), user.getRegistrationDateTime(), user.isStatus(),
                                user.isRemoved()
                        ));
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }

            public void readUsersFromFile () {
                try {
                    Scanner scanner = new Scanner(new File(userFilePath));
                    while (scanner.hasNextLine()) {
                        String [] userLine = scanner.nextLine().split(";");
                        UserControllerTempl.users.add(new User(userLine[1], userLine[2], userLine[3], userLine[4],
                                userLine[5], userLine[6].equals("MAN") ? Gender.MAN : Gender.WOMAN));
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
}
