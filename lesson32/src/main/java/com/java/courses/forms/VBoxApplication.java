package com.java.courses.forms;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VBoxApplication extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Label label1 = new Label("Hello World");
    label1.setFont(new Font(100));

    Label label2 = new Label("Another");
    label2.setFont(new Font(100));

    VBox vBox = new VBox(label1, label2);

    Scene scene = new Scene(vBox);

    primaryStage.setScene(scene);
    primaryStage.setTitle("VBox Application");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
