package ru.job4j.array;

/**
 * Заполнить массив квадратами чисел, взятых по индексу.
 * <p>
 * * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Square {

    /**
     * Метод создает массив элементов. В качестве значения
     * элемента задается квадратная степень индекса элемента
     *
     * @param   bound
     *          верхняя граница по индексу
     * @return  массив элементов
     */
    public int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int index = 0; index < rsl.length; index++) {
            rsl[index] = (int) Math.pow(index, 2);
        }
        return rsl;
    }
}
