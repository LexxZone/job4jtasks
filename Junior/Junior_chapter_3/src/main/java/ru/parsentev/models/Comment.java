package ru.parsentev.models;

import java.util.List;

public class Comment {
    private User author;
    private List<Item> items;

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
}
