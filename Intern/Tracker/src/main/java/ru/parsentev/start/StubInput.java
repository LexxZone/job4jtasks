package ru.parsentev.start;

/**
 * Класс ввода информации.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class StubInput implements Input {

	/**
	 * Поле класса - массив ответов.
	 */
	private String[] answers;

	/**
	 * Поле класса - позиция.
	 * Инициализирована нулем.
	 */
	private int position = 0;

	/**
	 * Конструктор класса с параметром - массива ответов.
	 * @param 	answers
	 * 			массив ответов.
	 */
	public StubInput(String[] answers) {
		this.answers = answers;
	}

	/**
	 * Метод возвращает определенный ответ на введенный запрос.
	 * @param 	question
	 * 			вопрос (запрос) в метод.
	 * @return	ответ на запрос.
	 */
	public String ask(String question) {
		return answers[position++];
	}

}
