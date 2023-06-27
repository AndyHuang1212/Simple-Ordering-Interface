package com.mycompany.fxml1080729;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;

public class PrimaryController {
    
    @FXML
    private ProgressBar progressBar1,progressBar2,progressBar3,progressBar4;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void switchToOrder() throws IOException {
        App.setRoot("order");
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
    
    @FXML
    private void progressBarMove() throws IOException {
        Thread t = new Thread(() -> {
            double progress = 0;
            for (progress = 0; progress <=1; progress+=0.01) {
                try {
                    if (progress<=0.4) {
                        progressBar1.setProgress(progress);
                    }
                    if (progress<=0.2) {
                        progressBar2.setProgress(progress);
                    }
                    if (progress<=0.7) {
                        progressBar3.setProgress(progress);
                    }
                    if (progress<=0.9) {
                        progressBar4.setProgress(progress);
                    }
                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        t.start();
    }
}
