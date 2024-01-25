package com.example.romanaddressbook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Lab6 {

    @FXML
    private Button answer;

    @FXML
    private CheckBox checkBox1;

    @FXML
    private CheckBox checkBox2;

    @FXML
    private CheckBox checkBox3;

    @FXML
    private CheckBox checkBox4;

    @FXML
    private ComboBox comboBox;
    @FXML
    private Label lblAnwerCombo;

    @FXML
    private Label lblTrueAnswer;

    @FXML
    private Label lblAnwerChoice;

    @FXML
    private ChoiceBox choiceBox;

    @FXML
    private RadioButton radioLay;

    @FXML
    private RadioButton radioCode;

    @FXML
    private RadioButton radioHier;

    @FXML
    private RadioButton radioProp;

    @FXML
    private Label lblRadio;

    private ToggleGroup radiotoggleGroup;

    @FXML
    private Button btnNextTasks;

    @FXML
    private Button btnNextLab;

    private Stage dialogStage;

    private HelloController mainController;

    public void initialize(){
        lblTrueAnswer.setText("");
        lblAnwerChoice.setText("");
        choiceBox.getItems().addAll("Правильно","Неправильно");
        lblAnwerCombo.setText("");
        comboBox.getItems().addAll("BorderPane", "AncorePane","VBox", "HBox");
        lblRadio.setText("");
        radiotoggleGroup = new ToggleGroup();
        this.radioProp.setToggleGroup(radiotoggleGroup);
        this.radioLay.setToggleGroup(radiotoggleGroup);
        this.radioHier.setToggleGroup(radiotoggleGroup);
        this.radioCode.setToggleGroup(radiotoggleGroup);
    }

    @FXML
    public void checkBoxAnswer(ActionEvent event) {
        String answer = "Ваша відповідь:";

        if(checkBox1.isSelected() & checkBox2.isSelected() & checkBox3.isSelected() & !checkBox4.isSelected()){
            answer += "\nпогодженість" + "\nдружність" + "\nгнучкість" + "\nВаша відповідь вірна!!!";
            this.lblTrueAnswer.setText(answer);
        } else {
            this.lblTrueAnswer.setText("Відповідь не вірна!" + "\nСпробуйте ще раз)");
        }

    }

    @FXML
    public void choiceBoxAnswer(ActionEvent event) {
        String trueAnswer = "Неправильно";

        if (choiceBox.getValue().toString().equals(trueAnswer)){
            lblAnwerChoice.setText("Ваша відповідь: " + choiceBox.getValue().toString() + "\nВідповідь вірна!");
        } else {
            lblAnwerChoice.setText("Ваша відповідь: " + choiceBox.getValue().toString() + "\nВідповідь не вірна!");
        }
    }

    @FXML
    public void comboBoxPressed(ActionEvent event) {
        String trueAnswer = "BorderPane";
        if (comboBox.getValue().toString().equals(trueAnswer)) {
            lblAnwerCombo.setText("Відповідь: " + comboBox.getValue().toString() + "\nВаша відповідь вірна!");
        } else {
            lblAnwerCombo.setText("Відповідь: " + comboBox.getValue().toString() + "\nВаша відповідь не вірна!");
        }
    }

    @FXML
    public void radioAnswer(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) radiotoggleGroup.getSelectedToggle();
        String answer = selectedRadioButton.getText();
        String trueAnswer = "Properties";

        if (answer.equals(trueAnswer)){
            lblRadio.setText("Ваша відповідь: " + answer + "\nВаша відповідь вірна!");
        } else {
            lblRadio.setText("Ваша відповідь: " + answer + "\nВаша відповідь не вірна!");
        }
    }

    @FXML
    public void nextTasks() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Lab6_2.fxml"));
            Parent root = loader.load();
            Lab6_2 lab62 = loader.getController();

            Stage otherDialogStage = new Stage();
            otherDialogStage.setTitle("Практична робота №6");
            otherDialogStage.initModality(Modality.WINDOW_MODAL);
            otherDialogStage.initOwner(btnNextTasks.getScene().getWindow());
            Scene scene = new Scene(root);
            otherDialogStage.setScene(scene);

            lab62.setNewStage(otherDialogStage);

            otherDialogStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void nextLab() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Lab7VideoPlayer.fxml"));
            Parent root = loader.load();
            Lab7VideoPlayer lab7VideoPlayer = loader.getController();

            Stage otherDialogStage = new Stage();
            otherDialogStage.setTitle("Практична робота №7");
            otherDialogStage.initModality(Modality.WINDOW_MODAL);
            otherDialogStage.initOwner(btnNextLab.getScene().getWindow());
            Scene scene = new Scene(root);
            otherDialogStage.setScene(scene);

            lab7VideoPlayer.setNewStage(otherDialogStage);

            otherDialogStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setMainController(HelloController mainController) {
        this.mainController = mainController;
    }


}
