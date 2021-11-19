package com.pb.dudar.hw8;

import java.util.Scanner;

public class Auth {
    String login;
    String password;
    String confirmPassword;
    Scanner in = new Scanner(System.in);

    public Auth() {
    }

    public String getLogin() {
        return login;}
    public void setLogin(String login) {
        this.login = login;}

    public String getPassword() {
        return password;}
    public void setPassword(String password) {
        this.password = password;}

    public String getConfirmPassword() {
        return confirmPassword;}


    public void signUp (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        System.out.println("Введите логин (длина от 5 до 20 символов, содержит только латинские буквы и цифры)");
        login = in.nextLine();
        if (login.length() >= 5 && login.length()<= 20) {
            if (login.matches("[a-zA-Z0-9]*")) {
                System.out.println("Логин соответствует требованиям :) ");
            } else {
                WrongLoginException wl1 = new WrongLoginException("Логин НЕ должен содержать символы или русские буквы!");
                throw wl1;
            }
        } else {
            WrongLoginException wl2 = new WrongLoginException("Ваш Логин НЕ соответствует длине от 5 до 20 символов!");
            throw wl2;
        }
        System.out.println("Придумайте пароль (от 5 символов, содержит только латинские буквы и цифры и знак подчеркивания)");
        password = in.nextLine();
        if (password.length() >=5 & password.matches("\\w+")) {
            System.out.println("Пароль соответствует требованиям :) ");
        } else {
            WrongPasswordException wp1 = new WrongPasswordException("Пароль не соответствует требованиям!");
            throw wp1;
        }
        System.out.println("Подтвердите пароль (пароли должны совпадать):");
        confirmPassword = in.nextLine();
        if (confirmPassword.equals(password)){
            setLogin(login);
            setPassword(password);
            System.out.println("Регистрация пройдена успешно! :)");
        } else {
            WrongPasswordException wp2 = new WrongPasswordException("Пароли не совпадают!");
            throw wp2;
        }
    }

    public void signIn (String login, String password) throws WrongLoginException {
        System.out.println("Вход на сайт:" + "\n" + "Введите логин:");
        login = in.nextLine();
        System.out.println("Введите пароль:");
        password = in.nextLine();
        if (!login.equals(this.login) || !password.equals(this.password)) {
            WrongLoginException wl3 = new WrongLoginException("Такого пользователя не существует!");
            throw wl3;
        }
         System.out.println("Авторизация успешна! :)");
    }
}


