package com.mycompany.fxml1080729;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class shoppingCartController {
    @FXML
    private Alert alert = new Alert(AlertType.NONE);
    @FXML
    private TableView tableview;
    @FXML
    private Label payLabel;
    /*
    @Override
    public void initialize(URL url, ResourceBundle rb){
    }
    */
    @FXML
    public void initialize(){
        TableColumn drinksCol=new TableColumn("品項");
        TableColumn sugarCol=new TableColumn("甜度");
        TableColumn iceCol=new TableColumn("冰塊");
        TableColumn sizeCol=new TableColumn("中/大");
        
        tableview.getColumns().addAll(drinksCol,sugarCol,iceCol,sizeCol); 
        
        ObservableList<drinks> data=FXCollections.observableArrayList(
                //new drinks("好喝紅茶"),new drinks("普通紅茶"),new drinks("咖啡紅茶"),new drinks("美式咖啡")
        );
        for (int i = 0; i < App.num1; i++) {
            data.add(new drinks("好喝紅茶"));
        }
        for (int i = 0; i < App.num2; i++) {
            data.add(new drinks("普通紅茶"));
        }
        for (int i = 0; i < App.num3; i++) {
            data.add(new drinks("咖啡紅茶"));
        }
        for (int i = 0; i < App.num4; i++) {
            data.add(new drinks("美式咖啡"));
        }
        
        drinksCol.setCellValueFactory(
            new PropertyValueFactory<drinks,String>("drinksName")
        );
        sugarCol.setCellValueFactory(
            new PropertyValueFactory<drinks,String>("sugarComboBox")
        );
        iceCol.setCellValueFactory(
            new PropertyValueFactory<drinks,String>("iceComboBox")
        );
        sizeCol.setCellValueFactory(
            new PropertyValueFactory<drinks,String>("sizeComboBox")
        );
        tableview.setItems(data);
    }
    
    //計算價格
    @FXML
    private void getPayNum() {
        int index=-1,sum=0;
        String s;
        for (int i = 0; i < App.num1; i++) {
            index+=1;
            s=(String)((drinks) tableview.getItems().get(index)).getSizeComboBox().getValue();
            if (s.equals("中") ) {
                sum+=30;
            }else if (s.equals("大")) {
                sum+=40;
            }           
        }
        for (int i = 0; i < App.num2; i++) {
            index+=1;
            s=(String)((drinks) tableview.getItems().get(index)).getSizeComboBox().getValue();
            if (s.equals("中") ) {
                sum+=48;
            }else if (s.equals("大")) {
                sum+=58;
            }            
        }
        for (int i = 0; i < App.num3; i++) {
            index+=1;
            s=(String)((drinks) tableview.getItems().get(index)).getSizeComboBox().getValue();
            if (s.equals("中") ) {
                sum+=88;
            }else if (s.equals("大")) {
                sum+=98;
            }
        }
        for (int i = 0; i < App.num4; i++) {
            index+=1;
            s=(String)((drinks) tableview.getItems().get(index)).getSizeComboBox().getValue();
            if (s.equals("中") ) {
                sum+=80;
            }else if (s.equals("大")) {
                sum+=120;
            }
        }
        //顯示價錢
        payLabel.setText("$: "+ sum);
    }
    //送出
    @FXML
    private void submit() throws IOException {
        boolean ok=true;
        String s1,s2,s3;
        for (int i = 0; i < (App.num1+App.num2+App.num3+App.num4); i++) {
            s1=(String)((drinks) tableview.getItems().get(i)).getSizeComboBox().getValue();
            s2=(String)((drinks) tableview.getItems().get(i)).getIceComboBox().getValue();
            s3=(String)((drinks) tableview.getItems().get(i)).getSugarComboBox().getValue();
            if (s1==null || s2==null || s3==null) {
                ok=false;
            }
        }
        if (ok) {
            switchToPrimary();
        }else{
            alert.setAlertType(AlertType.ERROR);
            alert.setContentText("請再次檢查");
            alert.setHeaderText("尚未填寫完畢!");
            alert.show();
        }
    }
    
    
    //下方目錄
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToActivity() throws IOException {
        App.setRoot("activity");
    }    
    @FXML
    private void switchToTask() throws IOException {
        App.setRoot("task");
    }    
    @FXML
    private void switchToOrder() throws IOException {
        App.setRoot("order");
    }
}