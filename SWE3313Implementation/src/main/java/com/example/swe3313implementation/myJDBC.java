package com.example.swe3313implementation;

import com.example.swe3313implementation.Controller.LoggedInController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class myJDBC {


    public static void changeScene(ActionEvent event, String fxmlFile, String title, String name){
        Parent root = null;

        if (name != null) {
            try {
                FXMLLoader loader = new FXMLLoader(myJDBC.class.getResource(fxmlFile));
                root = loader.load();
                LoggedInController loggedInController = loader.getController();
                loggedInController.setUserInformation(name);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                root = FXMLLoader.load(myJDBC.class.getResource(fxmlFile));
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root, 600,400));
        stage.show();
    }

    public static void signUpUser(ActionEvent actionEvent, String name, String password, String email){
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExists = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx-swe3313", "root", "VUf!7+te");
            psCheckUserExists = connection.prepareStatement("SELECT * FROM users WHERE email = ?");
            psCheckUserExists.setString(1, email);
            resultSet = psCheckUserExists.executeQuery();

            if (resultSet.isBeforeFirst()) {
                System.out.println("User already exists");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("This email is already in use! Please enter another email.");
                alert.show();
            }
            else {
                psInsert = connection.prepareStatement("INSERT INTO users (email, password, isAdmin, name) VALUES (?, ?, 0, ?)");
                psInsert.setString(1, email);
                psInsert.setString(2, password);
                psInsert.setString(3, name);
                psInsert.executeUpdate();

                changeScene(actionEvent, "logged-in.fxml", "Welcome.", name);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if (psCheckUserExists != null){
            try {
                psCheckUserExists.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (psInsert != null){
            try {
                psInsert.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void logInUser (ActionEvent actionEvent, String email, String password){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx-swe3313", "root", "VUf!7+te");
            preparedStatement = connection.prepareStatement("SELECT password, FROM users WHERE email =?");
            preparedStatement.setString(1,email);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.isBeforeFirst()) {
                System.out.println("User not found in database.");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Provided Credentials are incorrect.");
                alert.show();
            }
            else {
                while (resultSet.next()) {
                    String retrievedPassword = resultSet.getString("password");
                    String retrievedEmail = resultSet.getString("email");
                    if (retrievedPassword.equals(password)) {
                        changeScene(actionEvent, "logged-in.fxml", "Welcome.", retrievedEmail);
                    }
                    else {
                        System.out.println("Password did not match.");
                    }
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Provided Credentials are incorrect.");
                    alert.show();
                }
            }
        }
        catch  (Exception e){
            e.printStackTrace();
        }
        finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if (preparedStatement != null){
            try {
                preparedStatement.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
