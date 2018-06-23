package ru.job4j.lite.sort;

/**
 * Created by Alexey Dvoryaninov on 23.06.2018 - (lexxzone@gmail.com)
 */
public class User implements Comparable<User> {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    /**
     *
     *  Overrided method.
     *  @param user
     *  @return negative number, positive number or zero
     *  Comparing users. If there are two or more users with the same
     *      * age they are sorted by the name
     *
     */
    @Override
    public int compareTo(User user) {
        final int res = this.age - user.age;
        return res == 0 ? this.name.compareTo(user.name) : res;
    }
}