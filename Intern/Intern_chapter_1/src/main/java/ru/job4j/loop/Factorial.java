package ru.job4j.loop;

/**
 * Вычисление факториала.
 * Created by Alex Dvoryaninov on 11.03.18
 */
public class Factorial {

    /**
     * Рассчет и вывод факториала заданного числа.
     * Факториал вычисляется перемножением чисел от 1 до самого числа
     *
     * @param   n
     *          Число, факториал которого нужно вычислить
     * @return  факториал
     */
    public int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
