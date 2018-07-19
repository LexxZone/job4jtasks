package ru.job4j.condition;

/**
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */

public class Point {
    // Координаты точки
    private int x;
    private int y;

    /**
     *
     * @param   x
     *          Точка x
     * @param   y
     *          Точка y
     */
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

    /**
     *
     * @param   that
     *          Точка, до которой метод измеряет расстояние
     *
     * @return  Расстояние между точками
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
}