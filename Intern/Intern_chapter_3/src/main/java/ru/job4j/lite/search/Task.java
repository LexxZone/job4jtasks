package ru.job4j.lite.search;

/**
 * Created by Alexey Dvoryaninov on 15.07.2018 - (lexxzone@gmail.com)
 * <p>
 * Single Task class
 */

public class Task {
    private String desc;
    private int priority;

    /**
     * @param   desc
     *          description of Task
     * @param   priority
     *          priority of Task
     */
    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    /**
     *
     * @return  description
     */
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @return  priority
     */
    public int getPriority() {
        return priority;
    }
}
