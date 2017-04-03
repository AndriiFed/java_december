package com.java.courses.forms;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FirstApplication extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    Label label = new Label("Hello World");
    label.setFont(new Font(100));

    Scene scene = new Scene(label);

    stage.setScene(scene);
    stage.setTitle("First Application");
    stage.setWidth(500);
    stage.setHeight(500);
    stage.show();

  }

  public static void main(String[] args) {
    launch();
  }
}
