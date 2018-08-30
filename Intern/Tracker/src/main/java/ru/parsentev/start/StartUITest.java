package ru.parsentev.start;

/**
 * Тест класса StartUI.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class StartUITest {

	/**
	 * Тестирование.
	 * @param args
	 * 			параметры по-умолчанию.
	 */
	public static void main(String[] args) {
		Input input = new StubInput(new String[] {"create stub task"});
		new StartUI(input).init();
        //new StartUI(input, new Tracker()).init();
	}

}
