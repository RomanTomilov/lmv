package com.example.romanaddressbook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditController {
    @FXML
    private Button btnCancel;

    @FXML
    private Button btnOk;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtPip;

    private Person currentPerson;

    private CollectionAddressBook collectionAddressBook;

    private HelloController helloController;

    private Stage stage = new Stage();

    public void initData(Person person) {
        currentPerson = person;
        txtPip.setText(person.getPIP());
        txtPhone.setText(person.getPhone());
    }


    @FXML
    void clickOk(ActionEvent event) {
        String pip = txtPip.getText();
        String phone = txtPhone.getText();

        if (currentPerson == null) {
            Person newPerson = new Person(pip, phone);
            collectionAddressBook.add(newPerson);
        } else {
            currentPerson.setPip(pip);
            currentPerson.setPhone(phone);
            collectionAddressBook.update(currentPerson);
        }

        helloController.updateCountLabel();
        stage.close();
    }
    @FXML
    void clickCancel(ActionEvent event) {
        stage.close();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }


    public void setCollectionAddressBook(CollectionAddressBook collectionAddressBook) {
        this.collectionAddressBook = collectionAddressBook;
    }

    public void setHelloController(HelloController helloController) {
        this.helloController = helloController;
    }

}
