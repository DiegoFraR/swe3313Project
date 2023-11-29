package com.example.swe3313implementation;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
        Parent root = FXMLLoader.load(getClass().getResource("logged-in.fxml"));
        stage.setTitle("Hello");
        stage.setScene(new Scene(root));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}