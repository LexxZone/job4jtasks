package ru.job4j.lite.list;

/**
 * Created by Alexey Dvoryaninov on 25.05.18 - (lexxzone@gmail.com)
 */
public class User {

    private int id;
    private String name;
    private String city;

    /**
     * This is constructor for User class
     *
     * @param   id
     *          id of User
     * @param   name
     *          name of User
     * @param   city
     *          city of User
     */
    public User (int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    /**
     * Get User id
     *
     * @return  id of User
     */
    public int getId() {
        return id;
    }

    /**
     * Set User id
     *
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get User name
     *
     * @return  name of User
     */
    public String getName() {
        return name;
    }

    /**
     * Set User name
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get User city
     *
     * @return  city of User
     */
    public String getCity() {
        return city;
    }

    /**
     * Set User city
     *
     */
    public void setCity(String city) {
        this.city = city;
    }
}
