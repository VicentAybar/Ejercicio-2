package com.ieselgrao.gametofork.controller;

import com.ieselgrao.gametofork.MainApplication;
import com.ieselgrao.gametofork.model.GameModel;

import javafx.fxml.FXML;
import java.io.IOException;
import javafx.scene.control.Label;

public class StartController {
    @FXML
    private Label textoVelocidad;
    GameModel model;
    
    @FXML
    protected void handleStartGame() throws IOException {
        MainApplication.switchToGameView();
    }

    @FXML
    protected void handleAddSpeed() 
    {
        model.addSpeed();
    }

    @FXML
    protected void handleDecreaseSpeed(){
        model.decreaseSpeed();
    }

    @FXML
    protected void initialize(){
        model = MainApplication.getGameModel();
        textoVelocidad.textProperty().bind(model.speedProperty().asString());
    }
}