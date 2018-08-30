package ru.job4j.inheritance;

/**
 * Класс профессия.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Profession {

    /**
     * Поле класса - имя.
     */
    private String name;

    /**
     * Конструктор класса.
     */
    public Profession() {
        this.name = "John Doe";
    }

    /**
     * Конструктор класса.
     * @param   name
     *          имя человека.
     */
    public Profession(String name) {
        this.name = name;
    }

    /**
     * Получение имени человека.
     * @return  имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Консольное представление человеком своей профессии.
     * Метод может быть переопределен в клссах-наследниках.
     * По-умолчанию выводится - я-человек.
     */
    public void say() {
        System.out.println("I'm a man");
    }

}
