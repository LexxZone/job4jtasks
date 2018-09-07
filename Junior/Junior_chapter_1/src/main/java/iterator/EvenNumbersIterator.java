package iterator;

/**
 * 06.09.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator {

    /**
     * Входящий массив.
     */
    private int[] array;

    /**
     * Индекс в массиве (каретка).
     */
    private int index = 0;

    /**
     * Конструктор.
     *
     * @param array - входящий массив.
     */
    public EvenNumbersIterator(int[] array) {
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
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int number = array[index++];
        while (number % 2 != 0 && array.length > index) {
            number = array[index++];
        }
        return number;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }


}