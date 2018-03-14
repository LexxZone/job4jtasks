package ru.job4j.array;

/**
 * Created by Alex Dvoryaninov on 11.03.18
 */
public class Square {

    public int[] calculate(int bound) {

        int[] rsl = new int[bound];

        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат

        for (int index = 0; index < rsl.length; index++) {
            rsl[index] = (int) Math.pow(index, 2);
        }
        return rsl;

    }

}
