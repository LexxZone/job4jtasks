package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 31.08.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class IteratorForArray implements Iterator<Integer> {

    /**
     * @param externalArray - Исходный многомерный массив.
     */
    private int[][] externalArray;
    /**
     * @param innerArray - Внутренний одномерный массив.
     */
    private int[] innerArray;
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
        try {
            this.externalArray = values;
            this.innerArray = externalArray[externalIndex++];
        } catch (NoSuchElementException | ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public boolean hasNext() {
        try {
            if (innerArray.length <= innerIndex) {
                if (externalArray.length > externalIndex) {
                    innerArray = externalArray[externalIndex++];
                    innerIndex = 0;
                }
            }
        } catch (NullPointerException e) {
            return false;
        }
        return innerArray.length > innerIndex;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            if (externalArray.length > externalIndex) {
                innerArray = externalArray[externalIndex++];
                innerIndex = 0;
            }
            throw new NoSuchElementException();
        }
        return innerArray[innerIndex++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
