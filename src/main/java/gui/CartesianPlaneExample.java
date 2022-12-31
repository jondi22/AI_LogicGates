package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CartesianPlaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the root pane
        Pane root = new Pane();

        // Set the size of the pane
        root.setPrefSize(600, 600);

        // Draw the x-axis
        Line xAxis = new Line(50, 300, 550, 300);
        xAxis.setStrokeWidth(2);
        root.getChildren().add(xAxis);

        // Draw the y-axis
        Line yAxis = new Line(300, 50, 300, 550);
        yAxis.setStrokeWidth(2);
        root.getChildren().add(yAxis);

        // Draw the tick marks on the x-axis
        for (int i = 1; i < 11; i++) {
            Line tickMark = new Line(50 + i * 50, 298, 50 + i * 50, 302);
            tickMark.setStrokeWidth(2);
            root.getChildren().add(tickMark);

            Text tickLabel = new Text(50 + i * 50 - 5, 315, Integer.toString(i - 1));
            root.getChildren().add(tickLabel);
        }

        // Draw the tick marks on the y-axis
        for (int i = 1; i < 11; i++) {
            Line tickMark = new Line(298, 50 + i * 50, 302, 50 + i * 50);
            tickMark.setStrokeWidth(2);
            root.getChildren().add(tickMark);

            Text tickLabel = new Text(315, 50 + i * 50 + 5, Integer.toString(i - 1));
            root.getChildren().add(tickLabel);
        }

        // Draw the points on the plane
        Circle point1 = new Circle(200, 200, 5, Color.BLUE);
        root.getChildren().add(point1);

        Circle point2 = new Circle(400, 400, 5, Color.RED);
        root.getChildren().add(point2);

        // Draw the line between the points
        Line line = new Line(200, 200, 400, 400);
        line.setStrokeWidth(2);
        root.getChildren().add(line);

        // Create the scene and show the stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}