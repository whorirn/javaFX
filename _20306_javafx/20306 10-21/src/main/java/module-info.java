module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;


    opens com.example.test to javafx.fxml;
    exports com.example.test;
}