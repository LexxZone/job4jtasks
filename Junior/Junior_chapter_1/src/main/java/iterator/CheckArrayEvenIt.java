package iterator;

/**
 * 30.08.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */

import java.util.Iterator;

public class CheckArrayEvenIt implements Iterator {

    /**
     * Входящий массив.
     */
    private int[] array;

    /**
     * Индекс в массиве.
     */
    private int index = 0;

    /**
     * Конструктор.
     * @param array - входящий массив.
     */
    public CheckArrayEvenIt(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        boolean isEvenNumber = false;
        if (array.length > index) {
            int chekIndex = index;
            while (chekIndex < array.length) {
                int number = array[chekIndex++];
                if (number % 2 == 0) {
                    isEvenNumber = true;
                    break;
                }
            }
        }
        return isEvenNumber;
    }

    @Override
    public Integer next() {
        int number = array[index++];
        while (number % 2 != 0 && array.length > index) {
            number = array[index++];
        }
        return number;
    }

    @Override
    public void remove() {

    }

}