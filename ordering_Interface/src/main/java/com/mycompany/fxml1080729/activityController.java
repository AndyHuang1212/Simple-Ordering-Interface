package com.mycompany.fxml1080729;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class activityController {
    @FXML
    private WebView webView;
    @FXML
    private WebEngine engine;
    
    @FXML
    public void initialize(){
        engine = webView.getEngine();
        loadPage();
    }
    public void loadPage(){
        engine.load("https://www.kebuke.com/news/");
    }
    
    
    
    
    

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void switchToOrder() throws IOException {
        App.setRoot("order");
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