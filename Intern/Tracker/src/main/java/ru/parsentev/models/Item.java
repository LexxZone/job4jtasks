package ru.parsentev.models;

/**
 * Класс заявки.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Item {
    /**
     * Приватное поле класса - id.
     */
    private String id;

    /**
     * Поле класса - имя.
     */
    public String name;

    /**
     * Поле класса - описание.
     */
    public String description;

    /**
     * Поле класса - комментарий.
     */
    public String comment;

    /**
     * Поле класса - дата.
     */
    public long create;

    /**
     * Конструктор класса по-умолчанию.
     */
    public Item() {
    }

    /**
     * Конструктор класса.
     * @param   name
     *          Имя заявки.
     * @param   description
     *          Описание заявки.
     * @param   create
     *          Дата создания заявки.
     */
    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    /**
     * Конструктор класса.
     * @param   name
     *          Имя заявки.
     * @param   description
     *          Описание заявки.
     */
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Получение имени заявки.
     * @return  имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Получение описания.
     * @return  описание.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Получение даты создания.
     * @return  дата.
     */
    public long getCreate() {
        return this.create;
    }

    /**
     * Получение id заявки.
     * @return  id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Установка id заявки.
     * @param   id
     *          id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Установка имени заявки.
     * @param   name
     *          Имя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Установка описания.
     * @param   description
     *          Описание.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
