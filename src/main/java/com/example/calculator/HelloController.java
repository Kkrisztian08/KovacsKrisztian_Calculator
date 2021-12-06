package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

public class HelloController {
    @FXML
    private Label eredmeny;
    @FXML
    private Spinner<Double> elsoszam;
    @FXML
    private Spinner<Double> masodikszam;

    @FXML
    private void osszeadas() {
        double elsoSzam=elsoszam.getValue();
        double masodikSzam=masodikszam.getValue();
        int muvelet=(int)elsoSzam+(int)masodikSzam;
        eredmeny.setText(""+muvelet);


    }

    /*public  void initialize(){
        elsoszam.getStyleClass().clear();
        masodikszam.getStyleClass().clear();
    }*/

    public void szorzas(ActionEvent actionEvent) {
        double elsoSzam=elsoszam.getValue();
        double masodikSzam=masodikszam.getValue();
        int muvelet=(int)elsoSzam*(int)masodikSzam;
        eredmeny.setText(""+muvelet);
    }

    public void kivonas(ActionEvent actionEvent) {
        double elsoSzam=elsoszam.getValue();
        double masodikSzam=masodikszam.getValue();
        int muvelet=(int)elsoSzam-(int)masodikSzam;
        eredmeny.setText(""+muvelet);
    }

    public void osztas(ActionEvent actionEvent) {
        double elsoSzam=elsoszam.getValue();
        double masodikSzam=masodikszam.getValue();
        double muvelet=elsoSzam/masodikSzam;
        eredmeny.setText(""+muvelet);
    }

    public void maradekososztas(ActionEvent actionEvent) {
        double elsoSzam=elsoszam.getValue();
        double masodikSzam=masodikszam.getValue();
        int muvelet=(int)elsoSzam % (int)masodikSzam;
        eredmeny.setText(""+muvelet);
    }
}