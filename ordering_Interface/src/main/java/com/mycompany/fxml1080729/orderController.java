package com.mycompany.fxml1080729;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
        
public class orderController {
    @FXML
    private ComboBox<String> comboBox1,comboBox2,comboBox3,comboBox4; 
    
    @FXML
    public void initialize(){
        comboBox1.setItems(FXCollections.observableArrayList("1","2","3","4","5"));
        comboBox2.setItems(FXCollections.observableArrayList("1","2","3","4","5"));
        comboBox3.setItems(FXCollections.observableArrayList("1","2","3","4","5"));
        comboBox4.setItems(FXCollections.observableArrayList("1","2","3","4","5"));
    }
    
    @FXML
    void getComboBoxValue(ActionEvent event) throws IOException{
        //System.out.println(App.comboBox1);
        App.num1=0;App.num2=0;App.num3=0;App.num4=0;
        if (comboBox1.getValue()!=null) {
            App.num1=Integer.valueOf(comboBox1.getValue());
        }
        if (comboBox2.getValue()!=null) {
            App.num2=Integer.valueOf(comboBox2.getValue());
        }
        if (comboBox3.getValue()!=null) {
            App.num3=Integer.valueOf(comboBox3.getValue());
        }
        if (comboBox4.getValue()!=null) {
            App.num4=Integer.valueOf(comboBox4.getValue());
        }
        App.setRoot("shoppingCart");
    }
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToActivity() throws IOException {
        App.setRoot("activity");
    }
    @FXML
    private void switchToShoppingCart() throws IOException {
        App.setRoot("shoppingCart");
    }
    @FXML
    private void switchToTask() throws IOException {
        App.setRoot("task");
    }
}