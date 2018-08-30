package ru.parsentev.start;

/**
 * Класса ConsoleInput.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
import java.util.*;

public class ConsoleInput implements Input {

	/**
	 * Поле класса - объект Сканнер.
	 */
	private Scanner scanner = new Scanner(System.in);

	/**
	 * Метод запрашивает у пользователя ответ на вопрос.
	 * @param   question
	 *          Вопрос (запрос).
	 * @return	Запрос ввода в консоли.
	 */
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}

}
