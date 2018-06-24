package ru.job4j.lite.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Alexey Dvoryaninov on 23.06.2018 - (lexxzone@gmail.com)
 */
public class SortUser {
    /**
     *
     * Method returns TreeSet of users, sorted by the age (min to max). If there are two or more users with the same
     * age they are sorted by the name
     *
     * @param userList - List of Users
     * @return users  - TreeSet of users
     */
    public Set<User> sort(List<User> userList) {
        TreeSet<User> users = new TreeSet<>();
        for (User user: userList) {
            users.add(user);
        }
        return users;
    }

    /*public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        User chris = new User("Chris", 27);
        User bella = new User("Bella", 22);
        User john = new User("John", 37);
        User sven = new User("Sven", 29);
        User alex = new User("Alex", 30);
        User jess = new User("Jess", 29);
        list.add(chris);
        list.add(bella);
        list.add(john);
        list.add(sven);
        list.add(alex);
        list.add(jess);

        for (User usr: list
             ) {
            System.out.println(usr.getName() + " " + usr.getAge());

        }

        System.out.println("\n\n\n==========\n\n\n");

        User [] result = new SortUser().sort(list).toArray(new User[0]);

        for (User usr: result
             ) {
            System.out.println(usr.getName() + " " + usr.getAge());

        }


    }*/
}