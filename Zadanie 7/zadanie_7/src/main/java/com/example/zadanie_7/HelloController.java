package com.example.zadanie_7;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    protected TextArea screen;
    @FXML
    protected TextField detagram;

    TCPClient client;
    @FXML
    public void initialize()
    {
        client=new TCPClient(screen);
        Platform.runLater(client);

    }
    @FXML
    public  void onSend()
    {
        client.send(detagram.getText(),screen);
    }
}