package com.example.test;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ListView  <String> lv = new ListView<>();
        ObservableList <String> ov = FXCollections.observableArrayList();

        lv.setItems(ov);

        ov.addAll("치킨","피자","떡볶이","순제");

        lv.setOnMouseClicked(e->{
            System.out.println("클릭돪");

            String selected = lv.getSelectionModel().getSelectedItem();
            int index = lv.getSelectionModel().getSelectedIndex();

           // System.out.println("인덱스 : " + index);
           // System.out.println("메뉴 : " + selected);

        });

        // 이전 선택과 현재 선택 동시에 받아오기
        lv.getSelectionModel().selectedItemProperty().addListener((a,oldVal,newVal) -> {
        System.out.println("예전 : " + oldVal);
        System.out.println("기존 : " + newVal);
        });

        VBox vb = new VBox(lv);

        Scene scene = new Scene(vb,500,500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("간식 튜포");
        primaryStage.show();
    }
}
