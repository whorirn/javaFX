package com.example.demokik;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class jjj extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TextArea ta1 = new TextArea();
        TextArea ta2 = new TextArea();
        Button bt = new Button("옮기기");

        bt.setOnAction(e->{
            String how = ta1.getText();
            ta2.setText(how);
        });

        HBox hb = new HBox(50, ta1, ta2);
        VBox vb = new VBox(hb, bt);

        Scene sc = new Scene(vb, 700, 700);

        primaryStage.setScene(sc);
        primaryStage.setTitle("텍수투 에우어리아");
        primaryStage.show();



    }
}
