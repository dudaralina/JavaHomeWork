package com.pb.dudar.hw8;

public class OnlineShop {
    public static void main(String[] args) {
        Auth user = new Auth();
        try {
            user.signUp(user.getLogin(), user.getPassword(), user.getConfirmPassword());
            System.out.println("______________________________");
            user.signIn(user.login, user.password);
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println("Ошибка! " + ex.getMessage());
        }
    }
}
