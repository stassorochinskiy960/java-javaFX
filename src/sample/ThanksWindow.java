package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ThanksWindow {
    @FXML
    private ResourceBundle resource;

    @FXML
    private URL location;

    @FXML
    private Button closeButton;

    @FXML
    void f5f5f5(ActionEvent event){}

    @FXML
    void initialize(){
    }

    @FXML
    public void handleCloseButtonAction(ActionEvent event){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
