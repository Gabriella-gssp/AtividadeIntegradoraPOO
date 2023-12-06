package com.example.atividadeintegradorapoo.InterfaceGrafica;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AtoProcessualController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}