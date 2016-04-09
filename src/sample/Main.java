package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;

public class Main extends Application {
    private final static int CANVAS_X = 1000;
    private final static int CANVAS_Y = 1000;
    private Scene scene;
    private GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello world");
        BorderPane group = new BorderPane();
        Canvas canvas = new Canvas(CANVAS_X, CANVAS_Y);
        scene = new Scene(group);
        gc = canvas.getGraphicsContext2D();
        primaryStage.setScene(scene);
        group.setCenter(canvas);
        primaryStage.show();

        int wide = 40;
        int high = 40;
        int topMargin = 300;
        int leftMargin = 290;
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(2);
        gc.fillOval(leftMargin, topMargin, wide, wide);
        gc.strokeOval(leftMargin + 2 * wide, topMargin, wide, wide);
        gc.fillRect(leftMargin + 4 * wide, topMargin, wide, high);
        gc.strokeRect(leftMargin + 6 * wide, topMargin, wide, wide);
        gc.fillPolygon(new double[]{leftMargin + 8 * wide, leftMargin + 9 * wide, leftMargin + 8.5 * wide},
                new double[]{topMargin + high, topMargin + high, topMargin}, 3);
        gc.strokePolygon(new double[]{leftMargin + 10 * wide, leftMargin + 11 * wide, leftMargin + 10.5 * wide},
                new double[]{topMargin + high, topMargin + high, topMargin}, 3);
        gc.strokePolyline(new double[]{leftMargin, leftMargin + wide, leftMargin, leftMargin + wide},
                new double[]{topMargin + 2 * high, topMargin + 2 * high, topMargin + 3 * high, topMargin + 3 * high}, 4);
        gc.strokePolygon(new double[]{leftMargin + 2 * wide, leftMargin + 3 * wide, leftMargin + 2 * wide, leftMargin + 3 * wide},
                new double[]{topMargin + 2 * high, topMargin + 2 * high, topMargin + 3 * high, topMargin + 3 * high}, 4);
        gc.fillPolygon(new double[]{leftMargin + 4 * wide, leftMargin + 5 * wide, leftMargin + 4 * wide, leftMargin + 5 * wide},
                new double[]{topMargin + 2 * high, topMargin + 2 * high, topMargin + 3 * high, topMargin + 3 * high}, 4);
        gc.strokeLine(leftMargin + 6 * wide, topMargin + 2 * high, leftMargin + 7 * wide, topMargin + 3 * high);
        gc.strokeArc(leftMargin + 8 * wide, topMargin + 2 * high, wide, high, 30, 270, ArcType.ROUND);
        gc.fillArc(leftMargin + 10 * wide, topMargin + 2 * high, wide, high, 30, 270, ArcType.ROUND);
        gc.strokeOval(leftMargin + 10.5 * wide, topMargin + 2.15 * high, 8, 5);
    }


    public static void main(String[] args) {
        launch(args);
    }
}