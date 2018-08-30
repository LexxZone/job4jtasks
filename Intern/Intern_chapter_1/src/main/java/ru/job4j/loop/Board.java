package ru.job4j.loop;

/**
 * Вычисление факториала.
 * Created by Alex Dvoryaninov on 11.03.18
 */
public class Board {

    /**
     * Точка входа в программу.
     * Визуальное тестирование.
     * @param   args
     *          аргументы по-умолчанию
     */
    public static void main(String[] args) {
        String g = paint(7, 7);
        System.out.println(g);
    }

    /**
     * Метод рисует шахматную доску в псевдографике.
     * @param   width
     *          ширина доски
     * @param   height
     *          высота доски
     * @return  псевдоизображение доски
     */
    public static String paint(int width, int height) {
        StringBuilder fullString = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    fullString.append("x");
                } else {
                    fullString.append(" ");
                }
            }
            fullString.append(System.getProperty("line.separator"));
        }
        return fullString.toString();
    }
}
