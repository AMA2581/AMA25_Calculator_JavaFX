package com.calculator.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("AMA25.png")));
        stage.getIcons().add(icon);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}