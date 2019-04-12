package ru.job4j;

/**
 * 2019-02-03
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
package ru.job4j.tracker;

public class TrackerSQL implements ITracker, AutoCloseable {
    @Override
    public Item add(Item item) {
        return null;
    }

    @Override
    public void replace(String id, Item item) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Item[] findAll() {
        return new Item[0];
    }

    @Override
    public Item[] findByName(String key) {
        return new Item[0];
    }

    @Override
    public Item findById(String id) {
        return null;
    }
}