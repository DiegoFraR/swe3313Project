package com.example.swe3313implementation.Controller;

import com.example.swe3313implementation.myJDBC;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private Button button_signup;

    @FXML
    private Button button_login;

    @FXML
    private TextField tf_email;

    @FXML
    private TextField tf_name;

    @FXML
    private TextField tf_password;

    @Override
    public void initialize (URL location, ResourceBundle resourceBundle){
        button_signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!tf_email.getText().trim().isEmpty() && !tf_password.getText().trim().isEmpty() && !tf_name.getText().trim().isEmpty()) {
                    myJDBC.signUpUser(actionEvent, tf_name.getText(), tf_password.getText(), tf_email.getText());
                }
                else {
                    System.out.println("Please fill out all information.");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill in all information to sign up.");
                    alert.show();
                }
            }
        });
        button_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                myJDBC.changeScene(actionEvent, "login.fxml", "Log in.", null);
            }
        });
    }
}
