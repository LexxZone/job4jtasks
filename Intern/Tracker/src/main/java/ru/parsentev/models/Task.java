package ru.parsentev.models;

/**
 * Класс задачи.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Task extends Item {

    /**
     * Конструктор класса.
     * @param   name
     *          Имя задачи.
     * @param   desc
     *          Описание задачи.
     */
    public Task(String name, String desc) {
        this.name = name;
        this.description = desc;
    }

    /**
     * Подсчет цены.
     * @return  Значение.
     */
    public String calculatePrice() {
        return "100%";
    }
}
