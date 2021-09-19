module com.example.auth.authproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.auth.authproject to javafx.fxml;
    exports com.example.auth.authproject;
}