package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class GraphExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("X-Y Graph");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Draw x and y axes
        gc.strokeLine(50, 250, 350, 250);
        gc.strokeLine(50, 250, 50, 50);

        // Draw data points
        gc.fillOval(75, 225, 10, 10);
        gc.fillOval(100, 200, 10, 10);
        gc.fillOval(125, 175, 10, 10);
        gc.fillOval(150, 150, 10, 10);
        gc.fillOval(175, 125, 10, 10);
        gc.fillOval(200, 100, 10, 10);

        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
