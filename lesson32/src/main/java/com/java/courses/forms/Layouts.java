package com.java.courses.forms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Layouts extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Label label1 = new Label("Label 1");
    final TextField textField1 = new TextField();
    HBox hBox = new HBox(label1, textField1);

    hBox.setMargin(label1, new Insets(10, 10, 10, 10));
    hBox.setMargin(textField1, new Insets(10, 10, 10, 10));

    Label label2 = new Label("Label 2");
    final TextArea textArea = new TextArea();
    HBox hBox2 = new HBox(label2, textArea);
    hBox2.setMargin(label2, new Insets(10, 10, 10, 10));

    Button button1 = new Button("OK");

    button1.setOnAction(event -> {
      String text = textField1.getText();
      textArea.appendText(text + "\n");
    });

    Button button2 = new Button("Cancel");
    button2.setOnAction(event -> textArea.clear());

    HBox hBox3 = new HBox(button1, button2);
    hBox3.setAlignment(Pos.CENTER);

    VBox vBox = new VBox(hBox, hBox2, hBox3);

    Scene scene = new Scene(vBox);

    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
