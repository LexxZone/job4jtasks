package threads.pingpong;

/**
 * 23.09.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PingPong extends Application {
    private static final String JOB4J = "Пинг-понг www.job4j.ru";

    private Thread pingPongThread;

    @Override
    public void start(Stage stage) {
        int limitX = 300;
        int limitY = 300;
        Group group = new Group();
        Rectangle rect = new Rectangle(50, 100, 10, 10);
        group.getChildren().add(rect);
        pingPongThread = new Thread((new RectangleMove(rect, limitX, limitY)));
        pingPongThread.start();
        stage.setScene(new Scene(group, limitX, limitY));
        stage.setTitle(JOB4J);
        stage.setResizable(false);
        stage.show();
        stage.setOnCloseRequest(event -> {
                    pingPongThread.interrupt();
                    System.exit(0);
                }
        );
    }
}