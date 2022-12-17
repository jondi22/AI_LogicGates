package com.example.demo1;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Rectangle card;
    @FXML
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image x;
        x = new Image((getClass().getResource("img/and.png")));
        img1.setImage(x);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(2, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(4, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(8, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(10, Color.GRAY));
                })
        );
        timeline.setCycleCount(1);

        card.setOnMouseEntered(event -> {
            timeline.play();
        });
        card.setOnMouseExited(event -> {
            timeline.stop();
            card.setEffect(null);

    });
}
}