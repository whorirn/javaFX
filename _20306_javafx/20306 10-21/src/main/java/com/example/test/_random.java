package com.example.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _random extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField tf = new TextField();
        Label lb = new Label("숫자를 입력하세요");
        Label lb1 = new Label("숫자를 입력하세요");

        int randomNum = (int)(Math.random() * 10) + 1;

        tf.setOnAction(e-> {
            if(Integer.parseInt(tf.getText()) == randomNum) {

            }
        });

        VBox root = new VBox(lb,tf);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("랜덤 숫자");
        primaryStage.show();
    }
}
