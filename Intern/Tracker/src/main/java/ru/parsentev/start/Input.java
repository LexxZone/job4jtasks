package ru.parsentev.start;

/**
 * Интерфейc Input.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public interface Input {

    /**
     * Метод запроса вопроса пользователя.
     * @param   question
     *          Вопрос (запрос).
     * @return  реализация разработчика.
     */
    String ask(String question);

}
