package com.java.courses.javafx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

  @FXML
  private TextField login;

  @FXML
  private PasswordField password;

  private MainApplication application;

  public void setApplication(MainApplication application) {
    this.application = application;
  }

  public void okAction(ActionEvent actionEvent) throws IOException {
    String user = login.getText();
    String pass = password.getText();
    if (UserAuthorization.checkCredentials(user, pass)) {
      application.gotoProfilePage();
    }

    System.out.println("ok clicked: " + login.getText());
  }

  public void cancelAction(ActionEvent actionEvent) {
    System.out.println("cancel clicked: " + password.getText());
  }
}
