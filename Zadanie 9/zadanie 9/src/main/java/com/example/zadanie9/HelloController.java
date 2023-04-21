package com.example.zadanie9;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public Label result;
    public TextField amount,converter;


    @FXML
    protected void onConverter() {
        result.setText("PLN:"+String.valueOf(Double.valueOf(amount.getText())* Double.valueOf(converter.getText())));
    }
}