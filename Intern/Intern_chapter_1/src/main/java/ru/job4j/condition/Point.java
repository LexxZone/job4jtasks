package ru.job4j.condition;

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
     * @param   x
     *          Точка x
     * @param   y
     *          Точка y
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
