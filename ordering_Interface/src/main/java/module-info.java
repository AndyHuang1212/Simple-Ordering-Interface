module com.mycompany.fxml1080729 {
    requires javafx.controls;
    requires javafx.fxml;
    
    requires javafx.web;

    opens com.mycompany.fxml1080729 to javafx.fxml;
    exports com.mycompany.fxml1080729;
}
