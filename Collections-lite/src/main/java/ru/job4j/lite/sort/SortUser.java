package ru.job4j.lite.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Alexey Dvoryaninov on 23.06.2018 - (lexxzone@gmail.com)
 */
public class SortUser {
    /**
     * Method returns TreeSet of users, sorted by the age (min to max). If there are two or more users with the same
     * age they are sorted by the name
     *
     * @param userList - List of Users
     * @return users  - TreeSet of users
     */
    public Set<User> sort(List<User> userList) {
        Set users = new TreeSet();
        for (int i = 0; i < userList.size(); i++) {
            users.add(userList.get(i));
        }
        return users;
    }
}
