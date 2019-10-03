package generic;

import java.util.Objects;

/**
 * SimpleArray<T> class.
 *
 * 04.10.2019
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class SimpleArrayList<T> {

    private Object[] storage;
    private int storageSize;
    private int position = 0;

    /**
     * Constructor.
     *
     * @param size size of storage
     */
    public SimpleArrayList(Integer size) {
        Objects.requireNonNull(size, "size");
        this.storageSize = size;
        this.storage = new Object[size];
    }

    /**
     * Add new item into storage.
     *
     * @param item item
     */
    public void add(T item) throws ArrayIndexOutOfBoundsException {
        checkFreeSlotsInStorage(position + 1);
        this.storage[position] = item;
    }

    /**
     * Checks current position for array out of bound restriction.
     *
     * @param position current position.
     * @throws ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException exception
     */
    private void checkFreeSlotsInStorage(int position) throws ArrayIndexOutOfBoundsException {
        if (position > storageSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * Delete item from the storage.
     *
     * @param position item position
     */
    @SuppressWarnings("unchecked")
    public T delete(int position) {
        if (position > this.position) {
            return null;
        } else {
            Object[] tempStorage = new Object[this.storage.length - 1];
            System.arraycopy(tempStorage, 0, this.storage, 0, position - 1);
            System.arraycopy(
                    this.storage,
                    position + 1,
                    this.storage,
                    position,
                    this.storage.length - position);
            return (T) this.storage[position];
        }
    }

    /**
     * Get item by index.
     *
     * @param index item index
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index > this.position) {
            return null;
        } else {
            return (T) this.storage[index];
        }
    }

    /**
     * Set item in storage.
     *
     * @param index item position
     * @param model item
     * @return true if item is set, false if not
     */
    public boolean set(int index, T model) {
        if (index < this.storageSize) {
            if (index <= this.position) {
                this.storage[index] = model;
                return true;
            } else {
                this.storage[this.position++] = model;
                return true;
            }
        } else {
            return false;
        }
    }
}
