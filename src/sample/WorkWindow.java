package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WorkWindow {
    String znach="";

    @FXML
    private ResourceBundle resource;

    @FXML
    private URL location;

    @FXML
    private Label sale_label;

    @FXML
    private Button payButton;

    @FXML
    private Button sale8PrecentButton;

    @FXML
    private Label name_product_label;

    @FXML
    private Button sale3PrecentButton;

    @FXML
    private Button sale15PrecentButton;

    @FXML
    private Label cost_without_sale_label;

    @FXML
    private Button addButton;

    @FXML
    private TextField kilkist_field;

    @FXML
    private ComboBox<String> product_combo_box;

    @FXML
    private Label finish_payment_label;

    @FXML
    private Label od_vym_field;

    @FXML
    private Label cost_product_label;

    @FXML
    private Button closeButton;

    @FXML
    private TextArea bill_area;

    @FXML
    void c9c4c4(ActionEvent event){
    }

    @FXML
    void f5f5f5(ActionEvent event){
    }

    @FXML
    void initialize(){
        ObservableList<String> arr = FXCollections.observableArrayList("Яблука","Банани","Томати","Огірки");
        product_combo_box.setItems(arr);
        product_combo_box.setOnAction(event -> {
            if (product_combo_box.getValue().equals("Яблука")){
                cost_product_label.setText("19.90");
                name_product_label.setText("Яблука");
                od_vym_field.setText(" кг");
            }
            if (product_combo_box.getValue().equals("Банани")){
                cost_product_label.setText("28.80");
                name_product_label.setText("Банани");
                od_vym_field.setText(" кг");
            }
            if (product_combo_box.getValue().equals("Томати")){
                cost_product_label.setText("56.60");
                name_product_label.setText("Томати");
                od_vym_field.setText(" кг");
            }
            if (product_combo_box.getValue().equals("Огірки")){
                cost_product_label.setText("25.32");
                name_product_label.setText("Огірки");
                od_vym_field.setText(" кг");
            }
        });
        addButton.setOnAction(event -> {
            float x = Float.parseFloat(cost_product_label.getText());
            float y = Float.parseFloat(kilkist_field.getText());
            float z = Float.parseFloat(cost_without_sale_label.getText());
            cost_without_sale_label.setText(String.valueOf(z+x*y));
            znach = znach + name_product_label.getText()+" "+kilkist_field.getText()+od_vym_field.getText()+"\n";
            bill_area.setText(znach);
        });
        sale3PrecentButton.setOnAction(event -> {
            float a = Float.parseFloat(cost_without_sale_label.getText());
            float g = (float) (a*0.03);
            float h = (float) (a-a*0.03);
            sale_label.setText(Float.toString(g));
            finish_payment_label.setText(Float.toString(h));
            znach = znach + "Знижка: " + sale_label.getText() + "\n" + "До сплати: " + finish_payment_label.getText();
            bill_area.setText(znach);
            sale8PrecentButton.setVisible(false);
            sale15PrecentButton.setVisible(false);
        });

        sale8PrecentButton.setOnAction(event -> {
            float a = Float.parseFloat(cost_without_sale_label.getText());
            float g = (float) (a*0.08);
            float h = (float) (a-a*0.08);
            sale_label.setText(Float.toString(g));
            finish_payment_label.setText(Float.toString(h));
            znach = znach + "Знижка: " + sale_label.getText() + "\n" + "До сплати: " + finish_payment_label.getText();
            bill_area.setText(znach);
            sale3PrecentButton.setVisible(false);
            sale15PrecentButton.setVisible(false);
        });

        sale15PrecentButton.setOnAction(event -> {
            float a = Float.parseFloat(cost_without_sale_label.getText());
            float g = (float) (a*0.15);
            float h = (float) (a-a*0.15);
            sale_label.setText(Float.toString(g));
            finish_payment_label.setText(Float.toString(h));
            znach = znach + "Знижка: " + sale_label.getText() + "\n" + "До сплати: " + finish_payment_label.getText();
            bill_area.setText(znach);
            sale3PrecentButton.setVisible(false);
            sale8PrecentButton.setVisible(false);
        });

        payButton.setOnAction(event -> {
            payButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Thanks-window.fxml"));
            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });
    }

    @FXML
    public void handleCloseButtonAction(ActionEvent event){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
