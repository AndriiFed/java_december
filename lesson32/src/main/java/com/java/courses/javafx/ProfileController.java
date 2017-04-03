package com.java.courses.javafx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ProfileController {

  @FXML
  private TextField firstname;

  @FXML
  private TextField lastname;

  @FXML
  private TextField age;

  private MainApplication application;

  public void setApplication(MainApplication application) {
    this.application = application;
  }

  public void returnAction(ActionEvent actionEvent) throws IOException {
    application.gotoLoginPage();
  }
}
