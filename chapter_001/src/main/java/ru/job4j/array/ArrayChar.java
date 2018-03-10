package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;
    
     public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
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

        // проверить. что массив data имеет первые элементы одинаковые с value
        result = dataString.toString().startsWith(valueString.toString());
        return result;
    }
    public char[] getData() {
        return data;
    }

    public void setData(char[] data) {
        this.data = data;
    }
}