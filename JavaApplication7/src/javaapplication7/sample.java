/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author laboradagr_sd2082
 */
    public class sample extends Application {

    Image image = new Image("C:\\Users\\laboradagr_sd2082\\Downloads\\flower.jpg");

    @Override
    public void start(Stage primaryStage) {
        ImageView colorView = new ImageView(image);
        ImageView bhView = new ImageView(image);

        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(-1);
        bhView.setEffect(colorAdjust);

        primaryStage.setScene(new Scene(new VBox(colorView, bhView)));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    

}
