package ru.job4j.inheritance;

/**
 * Инженер class.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Engineer extends Profession {

    /**
     * Поле класса - имя.
     */
    public String name;

    /**
     * Поле класса - подразделение.
     */
    String division = "Protection shells development";

    /**
     * Конструктор класса по-умолчанию.
     */
    public Engineer() {
        this.name = "Alex Wyler";
    }

    /**
     * Конструктор класса с параметром имени.
     * @param   name
     *          Имя инженера.
     */
    public Engineer(String name) {
        this.name = name;
    }

    /**
     * Получение подразделения инженера.
     * @return  подразделение.
     */
    public String getDivision() {
        return this.division;
    }

    /**
     * Вывод информации о разрабатываемом чертеже.
     * @param   scheme
     *          Чертеж.
     */
    public void construct(String scheme) {
        System.out.println("Engineer " + this.name + " is constructing " + scheme);
    }

    /**
     * Вывод информации о разрабатываемом устройстве.
     * @param   device
     *          Название устройства.
     */
    public void create(String device) {
        System.out.println("Engineer " + this.name + " is creating " + device);
    }

    /**
     * Вывод информации об изучаемом компоненте.
     * @param   component
     *          Название компонента.
     */
    public void research(String component) {
        System.out.println("Engineer " + this.name + " is researching for " + component);
    }

    /**
     * Консольное представление специальности человека.
     */
    public void say() {
        System.out.println("I'm an engineer");
    }

}
