package ru.job4j.lite.bank;

import java.util.Objects;

/**
 * User class.
 * Created by Alexey Dvoryaninov on 22.07.2018 - (lexxzone@gmail.com)
 */
public class User {
    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    /**
     * Имя пользователя.
     */
    private String name;

    /**
     * Паспорт пользователя.
     */
    private  String passport;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, passport);
    }

    public String getName() {
        return this.name;
    }

    public String getPassport() {
        return this.passport;
    }
}
