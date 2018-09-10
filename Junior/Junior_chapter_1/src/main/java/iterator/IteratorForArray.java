package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 31.08.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class IteratorForArray implements Iterator<Integer> {

    private int[][] arr;

    /**
     * @param innerIndex - индекс для внутреннего массива.
     */
    private int innerIndex = 0;
    /**
     * @param exernalIndex - индекс для внешнего массива.
     */
    private int externalIndex = 0;

    /**
     * Конструктор.
     *
     * @param values - исходный двумерный массив.
     */
    IteratorForArray(int[][] values) {
        this.arr = values;
    }

    @Override
    public boolean hasNext() {
        boolean result = false;
        if (arr.length > externalIndex) {
            if (arr[externalIndex].length > innerIndex) {
                result = true;
            } else {
                result = false;
            }
        }
        System.out.println(result);
        return result;
    }

    @Override
    public Integer next() {
        int resultNext;
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else {
            resultNext = arr[externalIndex][innerIndex];
            innerIndex++;
            if (innerIndex == arr[externalIndex].length) {
                externalIndex++;
                innerIndex = 0;
            }
        }
        return resultNext;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
