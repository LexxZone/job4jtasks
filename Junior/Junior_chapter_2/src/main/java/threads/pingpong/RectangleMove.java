package threads.pingpong;

/**
 * 23.09.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */

import javafx.scene.shape.Rectangle;

public class RectangleMove implements Runnable {

    private final Rectangle rect;
    /**
     * ограничние по x.
     */
    private final int xlim;
    /**
     * ограничние по y.
     * В этой версии программы пока не используется
     */
    private final int ylim;

    public RectangleMove(Rectangle rect, int fieldSizeX, int fieldSizeY) {
        this.rect = rect;
        this.xlim = fieldSizeX;
        this.ylim = fieldSizeY;
    }

    /**
     * Метод запускает движение (изменение значений координаты квадрата).
     * Цикл While отслеживает флаг Interrupted у текущего потока.
     * Вложенный оператор ветвления проверяет на границы области перемещения квадрата.
     * Как только она достигнута шаг меняется на противоположный через *= -1
     * В программе учитываются размеры квадрата.
     *
     */
    @Override
    public void run() {
        int step = 1;
        Thread current = Thread.currentThread();
        while (!current.isInterrupted()) {
            if(this.rect.getX() == 0 || this.rect.getX() == this.xlim - this.rect.getWidth()) {
                step *= -1;
            }
            this.rect.setX(this.rect.getX() + step);

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}