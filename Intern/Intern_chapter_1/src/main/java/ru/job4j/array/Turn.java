package ru.job4j.array;

/**
 * Класс реализует метод переворота массива наоборот.
 * <p>
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Turn {

    /**
     * @param   array
     *          входящий массив целых значений
     * @return  массив перевернутый
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int z = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = z;
        }
        return array;
    }
}
