package com.example.demokik;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _spell_checkup extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TextArea ta1 = new TextArea();
        TextArea ta2 = new TextArea();
        Button bt1 = new Button("말춤법 검사하기");
        Label lb1 = new Label();

        HBox hb = new HBox(10, ta1, ta2);
        VBox vb = new VBox(hb,bt1,lb1);

        bt1.setOnAction(e->{
            String how = ta1.getText();

            int count = 0;

            if (how.contains("마춤뻡")){
                how = how.replace("마춤뻡","맞춤법");
                count++;
                ta2.setText(how);
            }
            if (how.contains("사생활치매")){
                how = how.replace("사생활치매","사생활침해");
                count++;
                ta2.setText(how);
            }
            if (how.contains("골이따분한 성격")){
                how = how.replace("골이따분한 성격","고리타분한 성격");
                count++;
                ta2.setText(how);
            }
            
            lb1.setText("현재" + count + "개의 오타가 교정되었습니다");
        });

        Scene sc = new Scene(vb, 700, 700);

        primaryStage.setScene(sc);
        primaryStage.setTitle("말춤법 검사기");
        primaryStage.show();

    }
}
