module com.example.demokik {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demokik to javafx.fxml;
    exports com.example.demokik;
}