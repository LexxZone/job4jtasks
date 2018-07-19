package ru.job4j.lite.search;

/**
 * Created by Alexey Dvoryaninov on 15.07.2018 - (lexxzone@gmail.com)
 */

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * This method add element into specified position
     * Position is defined by priority field
     * Для вставик использовать add(int index, E value)
     *
     * @param   task
     *          single Task
     */
    public void put(Task task) {
        //TODO добавить вставку в связанный список.




    }

    public Task take() {
        return this.tasks.poll();
    }
}
