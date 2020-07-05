package oop.controller;

import oop.controller.enums.UserField;
import oop.model.User;
import oop.model.enums.Gender;
import oop.model.enums.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public interface UserControllerTempl {

    List<User> users = new ArrayList<>(
            Arrays.asList(
                    new User("Adam", "Kowalski", "ak@ak.pl", "ak", "123123123", Gender.MAN),
                    new User("Jan", "Nowak", "jn@jn.pl", "jn", "333123123", Gender.MAN),
                    new User("Anna", "Lis", "al@al.pl", "al", "444123123", Gender.WOMAN)
            )
    );

    void registerUser(User user);

    boolean login(String email, String password);

    User findUser(int userId);

    void updateUserPassword(int userId, String newPassword);

    void deleteUserById(int usrId);

    void updateRole(int userId, Set<Role> roles);

    List<User> findAllUsers();

    List<User> findAllUsersOrderByArg(UserField userField, boolean asc);
}
