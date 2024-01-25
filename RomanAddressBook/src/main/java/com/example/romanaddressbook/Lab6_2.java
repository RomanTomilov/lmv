package com.example.romanaddressbook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class Lab6_2 {
    private Stage newStage;

    private Lab6 mainController;

    private RadioMenuItem first;

    @FXML
    private TextField textField;

    @FXML
    private RadioMenuItem second;

    @FXML
    private ToggleGroup toggleContextText;

    @FXML
    void toggleContextText(ActionEvent event) {
        if (toggleContextText.getSelectedToggle().equals(this.first))
            textField.setText("RandomText");
        else if (toggleContextText.getSelectedToggle().equals(this.second))
            textField.setText(null);
    }

    @FXML
    void exitButton(ActionEvent event) {
        newStage.close();
    }

    public void setNewStage(Stage newStage) {
        this.newStage = newStage;
    }

    public void setMainController(Lab6 mainController) {
        this.mainController = mainController;
    }

}

