package ru.job4j.array;

/**
 * Обертка над строкой.
 * <p>
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class ArrayChar {

    /**
     * Инициализируем массив символов.
     */
    private char[] data;

    /**
     * Конструктор класса.
     * @param   line
     *          входящая строковая переменная
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param   prefix
     *          префикс
     * @return  истина / ложь
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        StringBuilder dataString = new StringBuilder();
        for (int i = 0; i < this.data.length; i++) {
            String item = String.valueOf(this.getData()[i]);
            dataString.append(item);
        }
        char[] value = prefix.toCharArray();
        StringBuilder valueString = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            String item = String.valueOf(value[i]);
            valueString.append(item);
        }
        result = dataString.toString().startsWith(valueString.toString());
        return result;
    }

    /**
     * Getter for data.
     * @return  data
     */
    public char[] getData() {
        return data;
    }

    /**
     * Setter for data.
     * @param   data - set value for data
     */
    public void setData(char[] data) {
        this.data = data;
    }
}
