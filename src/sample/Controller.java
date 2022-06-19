package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private ResourceBundle resource;

    @FXML
    private URL location;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField login_field;

    @FXML
    private Button authSingInButton;

    @FXML
    void a54f57( ActionEvent event) {
    }

    @FXML
    private Button closeButton;

    @FXML
    void f5f5f5( ActionEvent event) {
    }

    @FXML

    void initialize(){
        authSingInButton.setOnAction(event ->{
            String login = "Stas";
            String password ="5";
            if (login.equals(login_field.getText()) && password.equals(password_field.getText())){
                authSingInButton.getScene().getWindow().hide();
                FXMLLoader loader= new FXMLLoader();
                loader.setLocation(getClass().getResource("work-window.fxml"));
                try {
                    loader.load();
                } catch (IOException e){
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            }
            else {
                authSingInButton.getScene().getWindow().hide();
                FXMLLoader loader= new FXMLLoader();
                loader.setLocation(getClass().getResource("Wrong-login-password.fxml"));
                try {
                    loader.load();
                } catch (IOException e){
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            }
        });
    }

    @FXML
    public void handleCloseButtonAction(ActionEvent event){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
