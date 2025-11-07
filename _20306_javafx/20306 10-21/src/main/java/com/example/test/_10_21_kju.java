package com.example.test;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _10_21_kju extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ListView  <String> lv = new ListView<>();
        ObservableList <String> ov = FXCollections.observableArrayList();

        Label lb1 = new Label("팔린 음료수 : ");
        Label lb2 = new Label("판매한 금액 : ");
        Button bt1 = new Button("구매하기");

        lv.setItems(ov);

        ov.addAll("코카콜라  1300원","사이다  1700","퍼블릭 스테틱 보이드  1300원");


        HBox hb = new HBox(60,bt1,lb1,lb2);
        VBox root = new VBox(lv,hb);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("자판기");
        primaryStage.show();
    }
}
