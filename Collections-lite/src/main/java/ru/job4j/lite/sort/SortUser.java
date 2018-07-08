package ru.job4j.lite.sort;

import java.util.*;

/**
 * Created by Alexey Dvoryaninov on 23.06.2018 - (lexxzone@gmail.com)
 */
public class SortUser {
    /**
     * Sorting with Comparable
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

    /**
     * Sorting by the Name length
     * @param userList2 incoming list
     * @return users - sorted list
     */
    public List<User> sortNameLength (List<User> userList2) {
        Comparator<User> userComparator = new Comparator<User>() {
            public int compare(User one, User two) {
                return (one.getName().length() - two.getName().length());
            }
        };
        Collections.sort(userList2, userComparator);
        return userList2;
    }

    public List<User> sortByAllFields (List<User> userList3) {

        Comparator<User> userComparator = new Comparator<User>() {
            public int compare(User one, User two) {

                return (one.getName().compareTo(two.getName())) == 0 ? one.getAge() - two.getAge():one.getName().compareTo(two.getName());

            }
        };

        Collections.sort(userList3, userComparator);

        return userList3;
    }

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        User chris = new User("Chris", 27);
        User bella = new User("Bella", 22);
        User bella2 = new User("Bella", 17);
        User john = new User("John", 37);
        User sven = new User("Sven", 29);
        User chris2 = new User("Chris", 22);
        User alex = new User("Alex", 30);
        User jess = new User("Jess", 29);
        list.add(chris);
        list.add(bella);
        list.add(bella2);
        list.add(john);
        list.add(sven);
        list.add(chris2);
        list.add(alex);
        list.add(jess);

        for (User usr: list
             ) {
            System.out.println(usr.getName() + " " + usr.getAge());

        }

        System.out.println("\n\n\n==========\n\n\n");

        User [] result = new SortUser().sortByAllFields(list).toArray(new User[0]);

        //User [] result = new SortUser().sortNameLength(list).toArray(new User[0]);
        //User [] result = new SortUser().sort(list).toArray(new User[0]);


        for (User usr: result
             ) {
            System.out.println(usr.getName() + " " + usr.getAge());

        }


    }
}