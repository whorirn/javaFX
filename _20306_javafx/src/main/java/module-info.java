module com.example._20306_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._20306_javafx to javafx.fxml;
    exports com.example._20306_javafx;
}