package ru.job4j.polymorphism;

/**
 * Класс Paint.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Paint {

    /**
     * Визуальное представление в консоли.
     * @param   args
     *          параметры по-умолчанию.
     */
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Square());
        paint.draw(new Triangle());
    }

    /**
     * Метод - Рисовать.
     * @param   shape
     *          Форма для отрисовки.
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}