module com.example._20306 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._20306 to javafx.fxml;
    exports com.example._20306;
}