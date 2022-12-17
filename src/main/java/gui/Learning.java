package gui;

import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Learning implements Initializable {
    @FXML
    Slider slide;
    @FXML
    TextField slidertext;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        slide.setOnMouseClicked(event -> {
            slidertext.setText(""+slide.getValue());

        });
        slidertext.setOnAction(event -> {
            slide.adjustValue(Double.parseDouble(slidertext.getText()));
        });
    }
}
