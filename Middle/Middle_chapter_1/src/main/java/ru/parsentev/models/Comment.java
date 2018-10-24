package ru.parsentev.models;

import java.sql.Timestamp;
import java.util.List;

/**
 * 21.10.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class Comment {

    private int id;
    private User author;
    private List<Item> items;
    private String description;
    private int item_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }
}
