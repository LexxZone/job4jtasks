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
     * Первый цикл While обеспечивает возобновление движения квадрата после прохождения цикла туда-обратно
     * Вложенные циклы отвечают за соответственно движение вправо/влево
     * Учитываются размеры квадрата
     */
    @Override
    public void run() {
        boolean action = true;
        while (action) {
            while (this.rect.getX() < this.xlim - this.rect.getWidth()) {
                this.rect.setX(this.rect.getX() + 1);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            while (this.rect.getX() >= 1) {
                this.rect.setX(this.rect.getX() - 1);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}