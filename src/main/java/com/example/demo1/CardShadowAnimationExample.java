package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

import java.io.IOException;

public class CardShadowAnimationExample extends Application {

    @FXML
    Rectangle card;
    @Override
    public void start(Stage primaryStage) throws IOException {

        // Create a shadow animation for the card when the mouse is hovering over it


        // Show the stage
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.setFill(Color.rgb(244, 244, 244)); // Set the background color to the light blue/gray color used in Chat
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
