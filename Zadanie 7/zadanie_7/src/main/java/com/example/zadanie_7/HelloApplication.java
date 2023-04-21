package com.example.zadanie_7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
 TCPServer.Server server=new TCPServer.Server();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("wiadomości1!");
        stage.setScene(scene);
        stage.show();
        ///drugi ekran
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load(), 320, 240);
        Stage stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.setTitle("wiadomość2!");
        stage2.show();
    }

    public static void main(String[] args) {
        launch();
    }
}