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


    public static void main(String[] args) {
        PhoneDictionary pd = new PhoneDictionary();
        pd.add(new Person("Петр", "Арсентьев", "89273795050", "Алтай, 2644"));
        pd.add(new Person("Дэйви", "Джонс", "89993456789", "Юта, 111 34"));
        pd.add(new Person("Александр", "Движнов", "467709", "Кастрома"));
        pd.add(new Person("Сергей", "Зверев", "6004534", "Москва, Спасская, 1"));
        pd.add(new Person("Алексей", "Иванов", "89067789034", "Псков, Московская, 19"));

        System.out.println(pd.find("Алекс").toString());




    }


}

