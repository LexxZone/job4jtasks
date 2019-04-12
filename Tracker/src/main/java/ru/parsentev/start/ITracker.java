package ru.parsentev.start;
import ru.parsentev.models.*;

/**
 * 21.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public interface ITracker {
    Item add(Item item);
    void replace(String id, Item item);
    void delete(String id);
    Item[] findAll();
    Item[] findByName(String key);
    Item findById(String id);
}
