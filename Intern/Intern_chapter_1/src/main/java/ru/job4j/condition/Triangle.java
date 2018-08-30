package ru.job4j.condition;

/**
 * Класс описывающий треугольник.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */

public class Triangle {
    /**
     * Точка а.
     */
    private Point a;
    /**
     * Точка b.
     */
    private Point b;
    /**
     * Точка c.
     */
    private Point c;

    /**
     * Конструктор класса.
     * @param   a
     *          - координаты первой точки треугольника
     * @param   b
     *          - координаты второй точки треугольника
     * @param   c
     *          - координаты третьей точки треугольника
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * <p>
     * Формула:
     * (ab + ac + bc) / 2
     *
     * @param   ab
     *          расстояние между точками a b
     * @param   ac
     *          расстояние между точками a c
     * @param   bc
     *          расстояние между точками b c
     * @return  Полупериметр
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула расчета площади треугольника:
     * Math.sqrt(p * (p - ab) * (p - ac) * (p - bc))
     *
     * @return  Вернуть прощадь, если треугольник существует или -1,
     *          если треугольника нет.
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }


    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param   ab
     *          Длина от точки a b.
     * @param   ac
     *          Длина от точки a c.
     * @param   bc
     *          Длина от точки b c.
     * @return  true or false
     */
    private boolean exist(double ab, double ac, double bc) {
        return ab < (ac + bc) && ac < (ab + bc) && bc < (ab + ac);
    }
}
