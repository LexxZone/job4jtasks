package ru.job4j.questions;

/**
 * Проверка слова на префикс.
 * Created by Alex Dvoryaninov on 12.03.18
 */
public class WordInside {

    /**
     * Проверяет, что слово начинается с префикса.
     *
     * @param   origin
     *          Исходное слово.
     * @param   sub
     *          Проверочное слово.
     * @return  если слово начинаеться с префикса
     */
    public boolean contains(String origin, String sub) {
        char[] originArray = origin.toCharArray();
        StringBuilder originString = new StringBuilder();
        char[] subArray = sub.toCharArray();
        for (int index = 0; index < originArray.length; index++) {
            if (originArray[index] == subArray[0]) {
                for (int i = 0; i < subArray.length; i++) {
                    String item = String.valueOf(originArray[i + index]);
                    originString.append(item);
                }
            }
        }
        StringBuilder subString = new StringBuilder();
        for (int i = 0; i < subArray.length; i++) {
            String item = String.valueOf(subArray[i]);
            subString.append(item);
        }
        return originString.toString().equals(subString.toString());
    }

}
