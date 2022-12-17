package gui;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Rectangle card;
    @FXML
    private Rectangle card1;
    @FXML
    private Rectangle card2,card3,card4,card5,card6;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card.setEffect(new javafx.scene.effect.DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline1 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card1.setEffect(new javafx.scene.effect.DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card1.setEffect(new javafx.scene.effect.DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card1.setEffect(new javafx.scene.effect.DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card1.setEffect(new javafx.scene.effect.DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card1.setEffect(new javafx.scene.effect.DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card1.setEffect(new javafx.scene.effect.DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline2 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card2.setEffect(new javafx.scene.effect.DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card2.setEffect(new javafx.scene.effect.DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card2.setEffect(new javafx.scene.effect.DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card2.setEffect(new javafx.scene.effect.DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card2.setEffect(new javafx.scene.effect.DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card2.setEffect(new javafx.scene.effect.DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline3 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card3.setEffect(new javafx.scene.effect.DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card3.setEffect(new javafx.scene.effect.DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card3.setEffect(new javafx.scene.effect.DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card3.setEffect(new javafx.scene.effect.DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card3.setEffect(new javafx.scene.effect.DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card3.setEffect(new javafx.scene.effect.DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline4 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card4.setEffect(new javafx.scene.effect.DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card4.setEffect(new javafx.scene.effect.DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card4.setEffect(new javafx.scene.effect.DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card4.setEffect(new javafx.scene.effect.DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card4.setEffect(new javafx.scene.effect.DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card4.setEffect(new javafx.scene.effect.DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline5 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card5.setEffect(new javafx.scene.effect.DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card5.setEffect(new javafx.scene.effect.DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card5.setEffect(new javafx.scene.effect.DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card5.setEffect(new javafx.scene.effect.DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card5.setEffect(new javafx.scene.effect.DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card5.setEffect(new javafx.scene.effect.DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline6 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card6.setEffect(new javafx.scene.effect.DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card6.setEffect(new javafx.scene.effect.DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card6.setEffect(new javafx.scene.effect.DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card6.setEffect(new javafx.scene.effect.DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card6.setEffect(new javafx.scene.effect.DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card6.setEffect(new javafx.scene.effect.DropShadow(18, Color.GRAY));
                })
        );

        timeline.setCycleCount(1);
        timeline1.setCycleCount(1);
        timeline2.setCycleCount(1);
        timeline3.setCycleCount(1);
        timeline4.setCycleCount(1);
        timeline5.setCycleCount(1);
        timeline6.setCycleCount(1);

        card.setOnMouseEntered(event -> {
            timeline.play();
        });
        card.setOnMouseExited(event -> {
            timeline.stop();
            card.setEffect(null);});
        card1.setOnMouseEntered(event -> {
            timeline1.play();
        });
        card1.setOnMouseExited(event -> {
            timeline1.stop();
            card1.setEffect(null);});
        card2.setOnMouseEntered(event -> {
            timeline2.play();
        });
        card2.setOnMouseExited(event -> {
            timeline2.stop();
            card2.setEffect(null);});
        card3.setOnMouseEntered(event -> {
            timeline3.play();
        });
        card3.setOnMouseExited(event -> {
            timeline3.stop();
            card3.setEffect(null);});
        card4.setOnMouseEntered(event -> {
            timeline4.play();
        });
        card4.setOnMouseExited(event -> {
            timeline4.stop();
            card4.setEffect(null);});
        card5.setOnMouseEntered(event -> {
            timeline5.play();
        });
        card5.setOnMouseExited(event -> {
            timeline5.stop();
            card5.setEffect(null);});
        card6.setOnMouseEntered(event -> {
            timeline6.play();
        });
        card6.setOnMouseExited(event -> {
            timeline6.stop();
            card6.setEffect(null);});

        List<Rectangle> cards = Arrays.asList(card, card1, card2, card3, card4, card5, card6);

        for (Rectangle card : cards) {
            card.setOnMouseClicked(event -> {
                Parent root = null;
                try {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("learning.fxml")));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root);
                Stage stage = (Stage) card.getScene().getWindow();
                stage.setScene(scene);
            });
        }
    }
}