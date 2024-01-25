package com.example.romanaddressbook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Адресна книга");
        Scene scene = new Scene(root, 600,600);
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(600);

        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(600);

        primaryStage.show();
        testData();
    }
    private void testData() {
        CollectionAddressBook addressBook = new CollectionAddressBook();
        addressBook.fillTestData();
        addressBook.print();
    }

    public static void main(String[] args) {
        launch();

    }
}
