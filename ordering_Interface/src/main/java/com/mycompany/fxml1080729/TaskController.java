package com.mycompany.fxml1080729;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TaskController {
    @FXML
    private Alert a = new Alert(AlertType.NONE);
    @FXML
    private Label cpoint;
    @FXML
    private Pagination pagination;
    @FXML
    private Button b1,b2,b3;
    
    @FXML
    public void initialize(){
        //積分
        cpoint.setText(""+App.check_point);
        //pagination
        ArrayList<ImageView> imagesView = new ArrayList<>();
        ArrayList<String> images = new ArrayList<>();
        images.add("/images/good.jpg");
        images.add("/images/normal.jpg");
        images.add("/images/3.jpg");
        images.add("/images/4.jpg");
        for (String i:images) {
            imagesView.add(new ImageView(i));
        }
        for (ImageView i:imagesView) {
            i.setFitHeight(260);
            i.setFitWidth(480);
        }
        pagination.setPageFactory(n->imagesView.get(n));
        //3Buttons
        Image b1Image=new Image("/images/gift.png");
        ImageView b1imageView=new ImageView(b1Image);
        b1imageView.setFitWidth(40);
        b1imageView.setFitHeight(40);
        b1.setGraphic(b1imageView);
        Image b2Image=new Image("/images/delivery.png");
        ImageView b2imageView=new ImageView(b2Image);
        b2imageView.setFitWidth(40);
        b2imageView.setFitHeight(40);
        b2.setGraphic(b2imageView);
        Image b3Image=new Image("/images/document.png");
        ImageView b3imageView=new ImageView(b3Image);
        b3imageView.setFitWidth(40);
        b3imageView.setFitHeight(40);
        b3.setGraphic(b3imageView);
    }
    @FXML
    private void show_alert(){
        if (App.today_check==false) {
            a.setAlertType(AlertType.INFORMATION);
            a.setContentText("簽到獎勵\n獲得積分10分!!");
            a.setHeaderText("恭喜完成當日簽到");
            App.check_point+=10;
            a.show();
            cpoint.setText(""+App.check_point);
            App.today_check=true;
        }else{
            a.setAlertType(AlertType.WARNING);
            a.setContentText("歡迎明天再來");
            a.setHeaderText("今天已經簽到完成!!");
            a.show();
        }        
    }
    @FXML
    private void show_alert2(){
        a.setAlertType(AlertType.WARNING);
        a.setContentText("下次一定");
        a.setHeaderText("此功能尚未開放QQ");
        a.show();
    }
    
    @FXML
    private void switchToQues() throws IOException {
        App.setRoot("questionnaire");
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
    private void switchToShoppingCart() throws IOException {
        App.setRoot("shoppingCart");
    }
    
    @FXML
    private void switchToOrder() throws IOException {
        App.setRoot("order");
    }
}