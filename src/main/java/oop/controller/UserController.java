package oop.controller;

import oop.controller.enums.UserField;
import oop.model.User;
import oop.model.enums.Role;

import java.util.List;
import java.util.Set;

public class UserController implements UserControllerTempl {
    @Override
    public void registerUser(User user) {
        users.add(user);
        System.out.println("Dodano nowego uzytkownika: " + user.getEmail());
    }

    @Override
    public boolean login(String email, String password) {
        return false;
    }

    @Override
    public User findUser(int userId) {
        return null;
    }

    @Override
    public void updateUserPassword(int userId, String newPassword) {

    }

    @Override
    public void deleteUserById(int usrId) {

    }

    @Override
    public void updateRole(int userId, Set<Role> roles) {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public List<User> findAllUsersOrderByArg(UserField userField, boolean asc) {
        return null;
    }
}
