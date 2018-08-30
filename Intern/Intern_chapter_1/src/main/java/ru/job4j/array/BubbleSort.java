package ru.job4j.array;

/**
 * Обертка над строкой.
 * <p>
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class BubbleSort {

    /**
     * Метод осущестляет пузырьковую сортировку.
     * @param   array
     *          входящий массив целых чисел
     * @return  отсортированный массив
     */
    public int[] sort(int[] array) {
        boolean checkpoint = true;
        int replaces = 0;
        while (checkpoint) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                    replaces++;
                }
            }
            if (replaces > 0) {
                checkpoint = false;
            }
        }
        return array;
    }

}
