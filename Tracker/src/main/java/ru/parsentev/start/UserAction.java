package ru.parsentev.start;

public interface UserAction {

	int key(); // Ключ, по кот. запрашиваем у пользователя действие, кот. он хочет выполнить
    
    void execute (Input input, Tracker tracker); // Выполняет основное действие. В параметрах передаем интерфейс ввода и трекер
    
    String info (); // Сообщает пользователю, что данный метод делает

}