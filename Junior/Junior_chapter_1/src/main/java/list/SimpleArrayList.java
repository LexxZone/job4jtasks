package list;

/**
 * 20.09.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 *
 * Класс SimpleArrayList.
 */
public class SimpleArrayList<E> {

    /*private int size;
    private Node<E> first;

    *//**
     * Метод вставляет в начало списка данные.
     *//*
    public void add(E date) {
        Node<e> newLink = new Node<>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }

    *//**
     * Реализовать метод удаления первого элемент в списке.
     *//*
    public E delete() {
        return null;
    }

    *//**
     * Метод получения элемента по индексу.
     *//*
    public E get(int index) {
        Node<e> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.date;
    }

    *//**
     * Метод получения размера коллекции.
     *//*
    public int getSize() {
        return this.size;
    }

    *//**
     * Класс предназначен для хранения данных.
     *//*
    private static class Node<e> {

        E date;
        Node<e> next;

        Node(E date) {
            this.date = date;
        }
    }*/

    private int size;
    private Node<E> first;

    public void add(E data) {
        Node<E> newLink = new Node<>(data);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }

    public E delete() {
        Node<E> deleting = this.first;
        this.first = deleting.next;
        this.size--;
        return deleting.data;
    }

    public E delete(int index) {
        if (index >= size) {
            throw new UnsupportedOperationException();
        }
        Node<E> prev = this.first;
        Node<E> result = this.first;
        for (int i = 0;; i++) {
            if (i == index) {
                if (i == 0) {
                    this.first = result.next;
                } else {
                    prev.next = result.next;
                }
                this.size--;
                break;
            }
            prev = result;
            result = result.next;
        }
        return result.data;
    }

    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.data;
    }

    public int getSize() {
        return this.size;
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }
}
