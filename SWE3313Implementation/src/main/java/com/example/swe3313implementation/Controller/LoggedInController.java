package com.example.swe3313implementation.Controller;

import com.example.swe3313implementation.myJDBC;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInController implements Initializable {

    @FXML
    private Button logOutButton;
    @FXML
    private Label label_welcome;
    @FXML
    private Label label_OK;

    @Override
    public void initialize (URL location, ResourceBundle resources){

        logOutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                myJDBC.changeScene(actionEvent, "login.fxml", "Log in", null);
            }
        });

    }
    //https://www.youtube.com/watch?v=ltX5AtW9v30&t=894s
    public void setUserInformation(String name){
        label_welcome.setText("Welcome " + name +"!");

    }
}
