package gui;

import ai_control.DataSets;
import ai_control.Network2Input1Hidden;
import ai_control.Neuron;
import ai_control.Perceptron;
import ai_control.activation_functions.SigmoidFunction;
import ai_control.activation_functions.StepFunction;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.ResourceBundle;



public class HelloController implements Initializable {
    @FXML
    private Rectangle card7;
    @FXML
    private Rectangle card1;
    @FXML
    private Rectangle card2,card3,card4,card5,card6;
    @FXML
    Slider slide;
    @FXML
    TextField slidertext,text;
    @FXML
    Label nameofthis;
    @FXML
    private LineChart<Number, Number> chart;
    @FXML
    Button start;
    @FXML
    ImageView imge,img1,img2,img3,img4,img5,img6,img7, img8;
    @FXML
    public Button restart;
    @FXML
    Label Red;
    @FXML
    Label Blue;
    XYChart.Series<Number, Number> series24= new XYChart.Series<>();
    XYChart.Series<Number, Number> line= new XYChart.Series<>();
    XYChart.Series<Number, Number> line2= new XYChart.Series<>();
    int Typeoflogicgate;
    int[]flag=new int[4];
    public void restartMethod(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage=(Stage)(((Node)(e.getSource())).getScene().getWindow());
        stage.setScene(scene);
        stage.show();

    }

    public void Start(){


        if (Typeoflogicgate==0) {


            Perceptron perceptron = new Perceptron(new StepFunction(), 2, -1);
            perceptron.train(DataSets.NAND_DATA, slide.getValue());
            double w1 = perceptron.getWeights().get(0);
            double w2 = perceptron.getWeights().get(1);
            double w0 = perceptron.getThresholdWeight();
            chart.getData().remove(series24);
            series24.getData().clear();
            series24=new XYChart.Series<>();
            series24.setName("RED for 0 ");
            for (double y = -3; y <= 3.5; y += 0.05) {
                double v = (-y * w1 - w0) / w2;
//                System.out.print(v);
                series24.getData().add(new XYChart.Data<>(y, v));
            }
//        series.(false);
            chart.getData().add(series24);
        }
        if (Typeoflogicgate==1) {


            Perceptron perceptron = new Perceptron(new StepFunction(), 2, -1);
            perceptron.train(DataSets.NAND_DATA, slide.getValue());
            double w1 = perceptron.getWeights().get(0);
            double w2 = perceptron.getWeights().get(1);
            double w0 = perceptron.getThresholdWeight();
            chart.getData().remove(series24);
            series24.getData().clear();
            series24=new XYChart.Series<>();
            series24.setName("RED for 0 ");
            for (double y = -3; y <= 3.5; y += 0.05) {
                double v = (-y * w1 - w0) / w2;
//                System.out.print(v);
                series24.getData().add(new XYChart.Data<>(y, v));
            }
//        series.(false);
            chart.getData().add(series24);
        }
        if (Typeoflogicgate==2||Typeoflogicgate==3) {

            chart.getData().remove(line);
            chart.getData().remove(line2);
            line=new XYChart.Series<>();
            line2=new XYChart.Series<>();


            {
            Perceptron perceptron = new Perceptron(new StepFunction(), 2, -1);
            perceptron.train(DataSets.OR_DATA, slide.getValue());
            double w1 = perceptron.getWeights().get(0);
            double w2 = perceptron.getWeights().get(1);
            double w0 = perceptron.getThresholdWeight();

            line=new XYChart.Series<>();
            line.setName("RED for 0 ");
            for (double y = -3; y <= 3.5; y += 0.05) {
                double v = (-y * w1 - w0) / w2;
//                System.out.print(v);
                line.getData().add(new XYChart.Data<>(y, v));
            }
//        series.(false);
            chart.getData().add(line);}

            {  Perceptron perceptron = new Perceptron(new StepFunction(), 2, -1);
                perceptron.train(DataSets.AND_DATA, slide.getValue());
                double w1 = perceptron.getWeights().get(0);
                double w2 = perceptron.getWeights().get(1);
                double w0 = perceptron.getThresholdWeight();

                line2=new XYChart.Series<>();
                line2.setName("RED for 0 ");
                for (double y = -3; y <= 3.5; y += 0.05) {
                    double v = (-y * w1 - w0) / w2;
//                System.out.print(v);
                    line2.getData().add(new XYChart.Data<>(y, v));
                }
//        series.(false);
                chart.getData().add(line2);}


        }
        if (Typeoflogicgate==4) {


            Perceptron perceptron = new Perceptron(new StepFunction(), 2, -1);
            perceptron.train(DataSets.OR_DATA, slide.getValue());
            double w1 = perceptron.getWeights().get(0);
            double w2 = perceptron.getWeights().get(1);
            double w0 = perceptron.getThresholdWeight();
            chart.getData().remove(series24);
            series24.getData().clear();
            series24=new XYChart.Series<>();
            series24.setName("RED for 0 ");
            for (double y = -3; y <= 3.5; y += 0.05) {
                double v = (-y * w1 - w0) / w2;
//                System.out.print(v);
                series24.getData().add(new XYChart.Data<>(y, v));
            }
//        series.(false);
            chart.getData().add(series24);
        }
        if (Typeoflogicgate==5) {


            Perceptron perceptron = new Perceptron(new StepFunction(), 2, -1);
            perceptron.train(DataSets.NOR_DATA, slide.getValue());
            double w1 = perceptron.getWeights().get(0);
            double w2 = perceptron.getWeights().get(1);
            double w0 = perceptron.getThresholdWeight();
            chart.getData().remove(series24);
            series24.getData().clear();
            series24=new XYChart.Series<>();
            series24.setName("RED for 0 ");
            for (double y = -3; y <= 3.5; y += 0.05) {
                double v = (-y * w1 - w0) / w2;
//                System.out.print(v);
                series24.getData().add(new XYChart.Data<>(y, v));
            }
//        series.(false);
            chart.getData().add(series24);
        }
        if (Typeoflogicgate==6) {


            Perceptron perceptron = new Perceptron(new StepFunction(), 1, -1);
            perceptron.train(DataSets.NOT_DATA, slide.getValue());
            double w1 = perceptron.getWeights().get(0);
            double w2 =w1;
            double w0 = perceptron.getThresholdWeight();
            chart.getData().remove(series24);
            series24.getData().clear();
            series24=new XYChart.Series<>();
            series24.setName("RED for 0 ");
            for (double y = -3; y <= 3.5; y += 0.05) {
                double v = (-y * w1 - w0) / w2;
//                System.out.print(v);
                series24.getData().add(new XYChart.Data<>(y, v));
            }
//        series.(false);
            chart.getData().add(series24);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        NumberAxis xAxis = (NumberAxis) chart.getXAxis();
        xAxis.setLowerBound(-0.25);
        NumberAxis yAxis = (NumberAxis) chart.getYAxis();
        yAxis.setLowerBound(-0.25);
        xAxis.setUpperBound(1.5);
        yAxis.setUpperBound(1.5);
        xAxis.setTickUnit(1);
        yAxis.setTickUnit(1);





//        XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
//
//
//        // Add the data points with different colors
//        XYChart.Data<Number, Number> point1 = new XYChart.Data<>(0, 0);
//        series2.setName("blue for 1");
//        point1.setNode(new Circle(5, Color.RED));
//        series2.getData().add(point1);
//        chart.getData().add(series2);
//
//        XYChart.Series<Number, Number> series = new XYChart.Series<>();
//
//
//        // Add the data points with different colors
//        XYChart.Data<Number, Number> point2 = new XYChart.Data<>(0, 1);
//        point2.setNode(new Circle(5, Color.RED));
//        series.getData().add(point2);
//        chart.getData().add(series);
//
//
//        XYChart.Series<Number, Number> series3 = new XYChart.Series<>();
//
//
//        // Add the data points with different colors
//        XYChart.Data<Number, Number> point3 = new XYChart.Data<>(1, 0);
//        point3.setNode(new Circle(5, Color.RED));
//        series3.getData().add(point3);
//        chart.getData().add(series3);








//        XYChart.Series<Number, Number> series4 = new XYChart.Series<>();
//
//
//        // Add the data points with different colors
//        XYChart.Data<Number, Number> point4 = new XYChart.Data<>(1, 1);
//        point4.setNode(new Circle(5, Color.BLUE));
//        series4.getData().add(point4);
//        chart.getData().add(series4);

         xAxis = (NumberAxis) chart.getXAxis();
        xAxis.setLowerBound(-.5);
         yAxis = (NumberAxis) chart.getYAxis();
        yAxis.setLowerBound(-.5);
        xAxis.setUpperBound(1.5);
        yAxis.setUpperBound(1.5);
        xAxis.setAutoRanging(false);
        yAxis.setAutoRanging(false);



        for (double y = -3; y <= 3.5; y += 0.1) {
            series24=new XYChart.Series<>();
            series24.getData().add(new XYChart.Data<>(-55,-55));
            chart.getData().add(series24);
        }




//        series.(false);



        slide.setOnMouseClicked(event -> {
            slidertext.setText(""+slide.getValue());
        });
        slidertext.setOnAction(event -> {
            slide.adjustValue(Double.parseDouble(slidertext.getText()));
        });
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card7.setEffect(new DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card7.setEffect(new DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card7.setEffect(new DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card7.setEffect(new DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card7.setEffect(new DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card7.setEffect(new DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline1 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card1.setEffect(new DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card1.setEffect(new DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card1.setEffect(new DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card1.setEffect(new DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card1.setEffect(new DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card1.setEffect(new DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline2 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card2.setEffect(new DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card2.setEffect(new DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card2.setEffect(new DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card2.setEffect(new DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card2.setEffect(new DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card2.setEffect(new DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline3 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card3.setEffect(new DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card3.setEffect(new DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card3.setEffect(new DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card3.setEffect(new DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card3.setEffect(new DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card3.setEffect(new DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline4 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card4.setEffect(new DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card4.setEffect(new DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card4.setEffect(new DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card4.setEffect(new DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card4.setEffect(new DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card4.setEffect(new DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline5 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card5.setEffect(new DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card5.setEffect(new DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card5.setEffect(new DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card5.setEffect(new DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card5.setEffect(new DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card5.setEffect(new DropShadow(18, Color.GRAY));
                })
        );
        Timeline timeline6 = new Timeline(
                new KeyFrame(Duration.millis(0), event -> {
                    card6.setEffect(new DropShadow(3, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(100), event -> {
                    card6.setEffect(new DropShadow(6, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(200), event -> {
                    card6.setEffect(new DropShadow(9, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(300), event -> {
                    card6.setEffect(new DropShadow(12, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card6.setEffect(new DropShadow(15, Color.GRAY));
                }),
                new KeyFrame(Duration.millis(400), event -> {
                    card6.setEffect(new DropShadow(18, Color.GRAY));
                })
        );

        timeline.setCycleCount(1);
        timeline1.setCycleCount(1);
        timeline2.setCycleCount(1);
        timeline3.setCycleCount(1);
        timeline4.setCycleCount(1);
        timeline5.setCycleCount(1);
        timeline6.setCycleCount(1);

        card7.setOnMouseEntered(event -> {
            timeline.play();
        });
        card7.setOnMouseExited(event -> {
            timeline.stop();
            card7.setEffect(null);});
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

        List<Rectangle> cards = Arrays.asList( card1, card2, card3, card4, card5, card6,card7);
        List<ImageView> imges = Arrays.asList(img2,img3,img4,img5,img6,img7,img8);

        for (Rectangle card : cards) {
            card.setOnMouseClicked(event -> {
                int i=0;
                int j=0;
              for (Rectangle cardds:cards){
                  if (cardds==card){j=i;}
                   cardds.setVisible(false);
                  i++;
              }
              i=0;
              for (ImageView rec:imges){
                  if (i==j){
                      imge.setVisible(true);
                      imge.setImage(rec.getImage());
                  }
                  rec.setVisible(false);
                    i++;
              }
                Typeoflogicgate=j;
              if (j==0){
                  nameofthis.setText("AND gate");

              }
              if (j==1){
                  nameofthis.setText("NAND gate");
              }
              if (j==2){
                  nameofthis.setText("XOR gate");
              }
                if (j==3){
                    nameofthis.setText("XNOR gate");
                }
                if (j==4){
                    nameofthis.setText("OR gate");
                }
                if (j==5){
                    nameofthis.setText("NOR gate");
                }
                if (j==6){
                    nameofthis.setText("NOT gate");
                }
                

                slide.setVisible(true);
                chart.setVisible(true);
                slidertext.setVisible(true);
                restart.setVisible(true);
                Red.setVisible(true);
                Blue.setVisible(true);


                start.setVisible(true);



                if (Typeoflogicgate==0){
                    flag[0]=0;
                    flag[1]=0;
                    flag[2]=0;
                    flag[3]=1;
                }
                if (Typeoflogicgate==1){
                    flag[0]=1;
                    flag[1]=1;
                    flag[2]=1;
                    flag[3]=0;
                }
                if (Typeoflogicgate==2){
                    flag[0]=0;
                    flag[1]=1;
                    flag[2]=1;
                    flag[3]=0;
                }
                if (Typeoflogicgate==3){
                    flag[0]=1;
                    flag[1]=0;
                    flag[2]=0;
                    flag[3]=1;
                }
                if (Typeoflogicgate==4){
                    flag[0]=0;
                    flag[1]=1;
                    flag[2]=1;
                    flag[3]=1;
                }
                if (Typeoflogicgate==5){
                    flag[0]=1;
                    flag[1]=0;
                    flag[2]=0;
                    flag[3]=0;
                }
                if (Typeoflogicgate==6){
                    flag[0]=1;
                    flag[1]=0;
                    flag[2]=99;
                    flag[3]=0;
                }

                XYChart.Series<Number, Number> series2;
                XYChart.Data<Number, Number> point1;

                series2 = new XYChart.Series<>();
                point1 = new XYChart.Data<>(0, 0);
                if (flag[0]==0) point1.setNode(new Circle(5, Color.RED));
                if (flag[0]==1) point1.setNode(new Circle(5, Color.BLUE));
                series2.getData().add(point1);
                chart.getData().add(series2);
                series2 = new XYChart.Series<>();
                if (flag[2]!=99) {
                    point1 = new XYChart.Data<>(0, 1);
                    if (flag[1] == 0) point1.setNode(new Circle(5, Color.RED));
                    if (flag[1] == 1) point1.setNode(new Circle(5, Color.BLUE));
                    series2.getData().add(point1);
                    chart.getData().add(series2);
                }

                series2 = new XYChart.Series<>();
                point1 = new XYChart.Data<>(1, 0);
                if (flag[2]==0) {
                    point1.setNode(new Circle(5, Color.RED));
                    series2.getData().add(point1);
                    chart.getData().add(series2);
                }
                if (flag[2]==1) {
                    point1.setNode(new Circle(5, Color.BLUE));
                    series2.getData().add(point1);
                    chart.getData().add(series2);
                }

                series2 = new XYChart.Series<>();
                point1 = new XYChart.Data<>(1, 1);
                if (flag[3]==0) {
                    point1.setNode(new Circle(5, Color.RED));
                    series2.getData().add(point1);
                    chart.getData().add(series2);
                }
                if (flag[3]==1) {
                    point1.setNode(new Circle(5, Color.BLUE));
                    series2.getData().add(point1);
                    chart.getData().add(series2);
                }


            });
        }

    }
}