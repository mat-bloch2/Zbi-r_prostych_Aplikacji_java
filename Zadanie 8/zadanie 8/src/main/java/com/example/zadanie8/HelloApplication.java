package com.example.zadanie8;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.AccessibleAttribute;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextArea;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloApplication extends Application {

    TextArea textArea;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Edytor");
        stage.setScene(scene);
        stage.show();
        textArea=(TextArea) stage.getScene().getRoot().getChildrenUnmodifiable().get(0);
    }

    @Override
    public void stop() throws IOException {
        Stage stage=new Stage();
        FileChooser fileChooser= new FileChooser();
        fileChooser.setTitle("wybierz folder");
        File file=fileChooser.showSaveDialog(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        PrintWriter writer = new PrintWriter(file.getPath());
        writer.println(textArea.getText());
        writer.close();

    }

    public static void main(String[] args) {
        launch();
    }
}