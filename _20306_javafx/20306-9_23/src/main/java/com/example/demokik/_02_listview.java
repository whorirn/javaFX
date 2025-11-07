package com.example.demokik;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _02_listview extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //화아면에 보여어주는 상자아 lv
        ListView<String> lv = new ListView<>();
        //실제에로 데이터업를 담는 상자아 ov
        ObservableList <String> ov = FXCollections.observableArrayList();

        //lv와아 ov를 연결주는 코오드
        lv.setItems(ov);

        TextField tf = new TextField();
        Button btadd  = new Button("추가하기");
        Button btremove = new Button("삭제하기");
        Button btset = new Button("변경하기");
        Button btcontains = new Button("검사하기");
        //버튼 누르면 tf 있는거 가져와서 리스트뷰에 추가
        btadd.setOnAction(e->{
            String text = tf.getText();
            ov.add(text);
        });
        btremove.setOnAction(e->{
            String text = tf.getText();
            ov.remove(text);
        });
        btset.setOnAction(e->{
            ov.set(0, tf.getText());
        });
        btcontains.setOnAction(e->{
            String text = tf.getText();
            if (ov.contains(text)){
                System.out.println("존재합니까?");
            }else {
                System.out.println("없습니까?");
            }

        });

        VBox vb = new VBox(lv,tf,btadd,btremove,btset,btcontains);

        Scene sc = new Scene(vb,500,500);

        primaryStage.setTitle("자바 전공 심화반 저녁 리스트");
        primaryStage.setScene(sc);
        primaryStage.show();

    }
}
