package ru.parsentev.models;

/**
 * Класс комментария.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Comment {

    /**
     * Поле класса - id.
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
     * Поле класса - дата.
     */
    public long create;

    /**
     * Конструктор по-умолчанию.
     */
    public Comment() {
    }

    /**
     * Метод возвращает имя.
     * @return  имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Метод возвращает описание.
     * @return  Описание.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Метод возвращает дату заявки.
     * @return  Дата заявки.
     */
    public long getCreate() {
        return this.create;
    }

    /**
     * Метод возвращает id заявки.
     * @return  id заявки.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Метод устанавливает значение id заявки.
     * @param   id
     *          id.
     */
    public void setId(String id) {
        this.id = id;
    }

}
