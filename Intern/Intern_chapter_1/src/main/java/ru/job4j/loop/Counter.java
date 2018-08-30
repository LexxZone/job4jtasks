package ru.job4j.loop;

/**
 * Подсчет суммы четных чисел в диапазоне.
 * Created by Alex Dvoryaninov on 11.03.18
 */
public class Counter {

    /**
     * Суммирует четные числа в заданном диапазоне.
     * @param   start
     *          Начало диапазона
     * @param   finish
     *          Конец диапазона
     * @return  Сумма четных чисел в диапазоне
     */
    public int add(int start, int finish) {
        int i, sum = 0;
        for (i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
