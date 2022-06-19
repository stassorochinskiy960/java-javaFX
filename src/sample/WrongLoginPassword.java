package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class
WrongLoginPassword {
    @FXML
    private ResourceBundle resource;

    @FXML
    private URL location;

    @FXML
    private Button btr;

    @FXML
    void f5f5f5(ActionEvent event){
    }

    @FXML
    void initialize(){
    }

    @FXML
    public void handleCloseButtonAction(ActionEvent event){
        Stage stage = (Stage) btr.getScene().getWindow();
        stage.close();
    }
}
