package com.example.zadanietest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.controlsfx.control.action.Action;

import java.util.function.Function;

public class HelloController {
    kalkulato kalkulato=new kalkulato();
    kalkulato kalkulato2;
    Function action;
    @FXML
    private Label scean;


    public void on_number_Click(ActionEvent event){
        Button button=(Button) event.getSource();
        kalkulato.add_nr(Short.valueOf(button.getId().substring(1)));
        print_screan_kalculator();
    }
    public void on_dot_Click(ActionEvent event)
    {
        kalkulato.add_dot();
        print_screan_kalculator();
    }
    public void on_add_Click(ActionEvent event)
    {
        kalkulato2=kalkulato;
        kalkulato=new kalkulato();
        action=new Function() {
            @Override
            public Object apply(Object o) {
                kalkulato.add(kalkulato2.print_number());
                return kalkulato.print_number();
            }
        };
    }

    public void on_equels_Click()
    {
        if(action!=null)
            scean.setText(String.valueOf(action.apply(new Object())));
    }

    public void on_substraction_Click()
    {
        kalkulato2=kalkulato;
        kalkulato=new kalkulato();
        action=new Function() {
            @Override
            public Object apply(Object o) {
                kalkulato2.substaction(kalkulato.print_number());
                kalkulato=kalkulato2;
                return kalkulato.print_number();
            }
        };

    }
    public void on_poduct_Click()
    {
        kalkulato2=kalkulato;
        kalkulato=new kalkulato();
        action=new Function() {
            @Override
            public Object apply(Object o) {
                kalkulato.product(kalkulato2.print_number());
                return kalkulato.print_number();
            }
        };
    }
    public void on_quotient_Click()
    {
        kalkulato2=kalkulato;
        kalkulato=new kalkulato();
        action=new Function() {
            @Override
            public Object apply(Object o) {
                kalkulato2.quotient(kalkulato.print_number());
                kalkulato=kalkulato2;
                return kalkulato.print_number();
            }
        };
    }

    public void print_screan_kalculator()
    {
        scean.setText(String.valueOf(kalkulato.print_number()));
    }
    public void on_C_Click()
    {
        kalkulato=new kalkulato();
        print_screan_kalculator();
    }
    public void on_pow_Click()
    {
        kalkulato.pow();
        print_screan_kalculator();
    }
    public void on_sqrt_Click()
    {
        kalkulato.sqrt();
        print_screan_kalculator();
    }
    public void on_negation_Click()
    {
        kalkulato.negation();
        print_screan_kalculator();
    }
}