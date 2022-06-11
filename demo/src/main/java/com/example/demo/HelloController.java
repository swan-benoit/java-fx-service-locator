package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.UnsupportedEncodingException;

public class HelloController {
    public Label pluginText;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onUTF8(ActionEvent actionEvent) throws UnsupportedEncodingException {
        pluginText.setText(Demo.utf8());
    }

    public void onAscii(ActionEvent actionEvent) throws UnsupportedEncodingException {
        pluginText.setText(Demo.ascii());
    }
}
