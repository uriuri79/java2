package ru.gb.javafxapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea chatArea;
    @FXML
    private TextField userMessage;

    public void clickSendButton(ActionEvent actionEvent) {
        final String message = userMessage.getText();
        chatArea.appendText(message + "\n");
        userMessage.clear();
    }
}

