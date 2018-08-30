package ru.job4j.max;

/**
 * Вывод максимального числа из сравниваемых.
 * <p>
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Max {

    /**
     * Выводит максимальное число из двух.
     * В параметрах метода передаются два числа. В Return
     * сравниваются числа и выводится максимальное
     *
     * @param   first
     *          Первое число
     * @param   second
     *          Второе число
     * @return максимальное из двух чисел
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Выводит максимальное число из трех.
     *      * В параметрах метода передаются три числа. В Return
     *      * сравниваются числа и выводится максимальное
     * @param   first
     *          первое число
     * @param   second
     *          второе число
     * @param   third
     *          третье число
     * @return  максимальное из двух чисел
     */
    public int max(int first, int second, int third) {
        return Math.max(first, Math.max(second, third));
    }

}
