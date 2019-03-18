package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Класс описывающий точку.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Point {
    /**
     * Координата x.
     */
    private int x;
    /**
     * Координата y.
     */
    private int y;

    /**
     * Конструктор класса.
     */
    public Point() {
    }

    /**
     * Конструктор класса.
     * @param   x
     *          Начальная x-координата точки
     * @param   y
     *          Начальная y-координата точки
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Проверка ...
     *
     * @param   a параметер а
     * @param   b параметр б
     * @return  Истина / ложь
     */
    public boolean is(int a, int b) {
        return y == a * x + b;
    }

    /**
     * Возвращает координату x.
     * @return  x
     */
    public int getX() {
        return this.x;
    }

    /**
     * Возвращает координату y.
     * @return  y
     */
    public int getY() {
        return this.y;
    }

    /**
     * Измеряет расстояние между точками.
     * @param   x1 - координата x1,
     * @param   x2 - координата x2,
     * @param   y1 - координата y1,
     * @param   y2 - координата y2
     *
     * @return  Расстояние между точками
     */
    public double distanceTo(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    /**
     * Измеряет расстояние между точками.
     * @param   that - Точка, до которой измеряется расстояние от исходной
     *
     * @return  Расстояние между точками
     */
    public double distanceTo(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
