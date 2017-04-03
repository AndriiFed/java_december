package com.java.courses.javafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

  private Stage primaryStage;

  @Override
  public void start(Stage primaryStage) throws Exception {
    this.primaryStage = primaryStage;

    gotoLoginPage();
  }

  public void gotoLoginPage() throws IOException {
    FXMLLoader loader =
        new FXMLLoader(this.getClass().getResource("login.fxml"));
    Parent root = loader.load();

    LoginController controller = loader.getController();
    controller.setApplication(this);

    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void gotoProfilePage() throws IOException {
    FXMLLoader loader =
        new FXMLLoader(this.getClass().getResource("profile.fxml"));
    Parent root = loader.load();

    ProfileController controller = loader.getController();
    controller.setApplication(this);

    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
