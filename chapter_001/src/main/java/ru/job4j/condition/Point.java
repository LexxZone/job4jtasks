package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean is(int a, int b) {
        return y == a * x + b;

    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double distanceTo(Point that) {
        return -1;
    }






    //2. Задано уравнение функции y(x) = a * x + b;

    //3. Добавьте метод в класс Point определяющий находится ли точка на этой фукнции.


}