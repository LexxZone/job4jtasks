package ru.parsentev.start;

/**
 * Интерфей UserAction.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public interface UserAction {

    /**
     * Ключ.
     * Ключ, по которому запрашиваем у пользователя действие,
     * которое он хочет выполнить
     * @return  реализация разработчика.
     */
    int key();

    /**
     * Выполнение.
     * Выполняет основное действие. В параметрах передаем
     * интерфейс ввода и трекер
     * @param input
     * @param tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     * Вывод информации о методе.
     * Сообщает пользователю, что данный метод делает
     * @return  реализация разработчика.
     */
    String info();

}
