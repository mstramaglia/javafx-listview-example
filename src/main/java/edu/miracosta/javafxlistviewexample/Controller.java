package edu.miracosta.javafxlistviewexample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label textLabel01;

    @FXML
    private TextField inputTextField01;

    @FXML
    private ListView<String> listView01;

    ObservableList<String> listItems = FXCollections.observableArrayList("Apples", "Bananas", "Carrots");

    @FXML
    protected void onAddItemButtonClick() {
        String listItemText = inputTextField01.getText();
        listItems.add(listItemText);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        textLabel01.setText("Please enter an item to add to the list:");

        listView01.setItems(listItems);
    }
}