package com.java.courses.forms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeBoard extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    GridPane gridPane = new GridPane();

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        Button button = new Button(i + " " + j);
        button.setDisable(true);
        button.setPrefSize(100, 100);
        button.setId(i + "" + j);
        button.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, button.getId(), ButtonType.OK);
            alert.show();
            button.setDisable(false);
          }
        });
        gridPane.add(button, i, j);
      }
    }

    Scene scene = new Scene(gridPane);

    primaryStage.setScene(scene);
    primaryStage.setTitle("Tic Tac Toe");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
