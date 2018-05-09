package ru.job4j.lite.search;

/**
 * Created by Alex Dvoryaninov on 22.04.18
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {

        List<Person> result = new ArrayList<>();

        Iterator<Person> it = persons.iterator();

        while (it.hasNext()) {
            Person check = it.next();
            String personInfo = check.getName() + check.getSurname() + check.getAddress() + check.getPhone();
            if (personInfo.toLowerCase().contains(key.toLowerCase())) {
                result.add(check);
            }

        }

        return result;
    }


}

