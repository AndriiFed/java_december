package com.java.courses.forms;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GridLayout extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Label label = new Label("text");
    label.setFont(new Font(20));
    TextField textField = new TextField();

    Button button1 = new Button("OK");
    //Button button2 = new Button("Cancel");

    GridPane gridPane = new GridPane();
    gridPane.add(label, 0, 0);
    gridPane.add(textField, 1, 0);

    gridPane.add(button1, 0, 1);
    gridPane.setColumnSpan(button1, 2);

    Scene scene = new Scene(gridPane);

    primaryStage.setScene(scene);
    primaryStage.setTitle("Grid Layout");
    primaryStage.show();

  }

  public static void main(String[] args) {
    launch();
  }
}
