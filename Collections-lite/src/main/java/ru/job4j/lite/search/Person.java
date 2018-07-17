package ru.job4j.lite.search;

/**
 * Created by Alex Dvoryaninov on 22.04.18
 *
 * Class Person
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    /**
     * This is constructor for Person class
     *
     * @param name - name of person
     * @param surname - second name of person
     * @param phone - phone of person
     * @param address - address of person
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Get Person name
     *
     * @return name - name of person
     */
    public String getName() {
        return name;
    }

    /**
     * Get Person surname
     *
     * @return surname - surname of person
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Get Person phone
     *
     * @return phone - phone of person
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Get Person address
     *
     * @return address - address of person
     */
    public String getAddress() {
        return address;
    }
}

