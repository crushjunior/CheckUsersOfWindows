package ru.charushnikov.checkusersofwindows.service;

import com.sun.jna.platform.win32.Netapi32Util;

public class CheckUserService {

    public static String checkUser(String name) {
        Netapi32Util.User[] users = Netapi32Util.getUsers();
        for (Netapi32Util.User user : users) {
            if (user.name.equals(name)) {
                return "Пользователь " + name + " есть";
            }
        }
        return "Пользователя " + name + " нет";
    }
}
