package com.mycompany.arraystack;

import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class PrimaryController {

    @FXML
    private RadioButton AddRadio;
    @FXML
    private ToggleGroup Command;
    @FXML
    private RadioButton GetRadio;
    @FXML
    private RadioButton SetRadio;
    @FXML
    private RadioButton AllRadio;
    @FXML
    private RadioButton DeleteRadio;
    @FXML
    private Button ExecuteAddButton;

    @FXML
    private Label AddPromptLabel;
    @FXML
    private TextField AddTextField;
    @FXML
    private Label getPromptLabel;
    @FXML
    private TextField GetTextField;
    @FXML
    private Button ExecuteGetButton;
    @FXML
    private Label SetPromptLabel;
    @FXML
    private Label IndexLabel;
    @FXML
    private Label NewDataLabel;
    @FXML
    private TextField IndexTextField;
    @FXML
    private TextField NewDataTextField;
    @FXML
    private Button ExecuteSetButton;
    @FXML
    private Button ExecuteAllButton;
    @FXML
    private Label DeletePromptLabel;
    @FXML
    private Button ExecuteDeleteButton;
    @FXML
    private TextField DeleteTextField;
    @FXML
    private Label AllPromptLabel;

    ArrayStackDS a1 = new ArrayStackDS();//array stack for storing data

    private ObservableList<String> ob;//observable list that is filled with add and delete commands

    private int index = 0;//index is used to put items into the backing array
    @FXML
    private ListView<String> listView;//listview that shows the contents of the backing array

    /**
     * executeAdd will execute the add command implemented by the array stack,
     * takes an index and data
     *
     * @param event
     */
    @FXML
    private void ExecuteAdd(ActionEvent event) {

        String str = AddTextField.getText();//get the text from the textfield
        int data = Integer.parseInt(str);//converts the string to an integer
        
        a1.add(index, data);//add the data to the backing array

        ob.add("Index: " + index + " Value: " + data);//add the value to the listview
        index++;// then increment the index

    }

    @FXML
    private void ExecuteGet(ActionEvent event) {

        int i = Integer.parseInt(GetTextField.getText());

        try {
            System.out.println(a1.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("error out of bounds");
        }
    }

    @FXML
    private void ExecuteSetButton(ActionEvent event) {

        int i = Integer.parseInt(IndexTextField.getText());//get the index to replace

        int newData = Integer.parseInt(NewDataTextField.getText());//get the new data
        try {
            a1.set(i, newData);
            ob.set(i, "Index: " + i + " Value: " + newData);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("error");
        }

    }

    @FXML
    private void ExecuteAllCommand(ActionEvent event) {

        for (int i = 0; i < a1.size(); i++) {//loop through the backing array to print it
            System.out.println("Index: " + i + " Value: " + a1.get(i));//call the get method on each index until the end of the list is reached
        }

    }

    @FXML
    private void ExecuteDeleteCommand(ActionEvent event) {

        int i = Integer.parseInt(DeleteTextField.getText());

        try {
            a1.remove(i);
            ob.remove(i);
            index--;

        } catch (IndexOutOfBoundsException e) {
            System.out.println("error");
        }

    }

    @FXML
    private void showAddCommand(ActionEvent event) {

        AddPromptLabel.setOpacity(1);
        AddTextField.setOpacity(1);
        ExecuteAddButton.setOpacity(1);

        getPromptLabel.setOpacity(0);
        GetTextField.setOpacity(0);
        ExecuteGetButton.setOpacity(0);

        SetPromptLabel.setOpacity(0);
        IndexLabel.setOpacity(0);
        NewDataLabel.setOpacity(0);
        IndexTextField.setOpacity(0);
        NewDataTextField.setOpacity(0);
        ExecuteSetButton.setOpacity(0);

        AllPromptLabel.setOpacity(0);
        ExecuteAllButton.setOpacity(0);

        DeletePromptLabel.setOpacity(0);
        DeleteTextField.setOpacity(0);
        ExecuteDeleteButton.setOpacity(0);

    }

    @FXML
    private void ShowSetCommand(ActionEvent event) {
        AddPromptLabel.setOpacity(0);
        AddTextField.setOpacity(0);
        ExecuteAddButton.setOpacity(0);

        getPromptLabel.setOpacity(0);
        GetTextField.setOpacity(0);
        ExecuteGetButton.setOpacity(0);

        SetPromptLabel.setOpacity(1);
        IndexLabel.setOpacity(1);
        NewDataLabel.setOpacity(1);
        IndexTextField.setOpacity(1);
        NewDataTextField.setOpacity(1);
        ExecuteSetButton.setOpacity(1);

        AllPromptLabel.setDisable(true);
        ExecuteAllButton.setDisable(true);
        AllPromptLabel.setOpacity(0);
        ExecuteAllButton.setOpacity(0);

        DeletePromptLabel.setOpacity(0);
        DeleteTextField.setOpacity(0);
        ExecuteDeleteButton.setOpacity(0);
    }

    @FXML
    private void ShowAllCommand(ActionEvent event) {

        AddPromptLabel.setOpacity(0);
        AddTextField.setOpacity(0);
        ExecuteAddButton.setOpacity(0);

        getPromptLabel.setOpacity(0);
        GetTextField.setOpacity(0);
        ExecuteGetButton.setOpacity(0);

        SetPromptLabel.setOpacity(0);
        IndexLabel.setOpacity(0);
        NewDataLabel.setOpacity(0);
        IndexTextField.setOpacity(0);
        NewDataTextField.setOpacity(0);
        ExecuteSetButton.setOpacity(0);

        AllPromptLabel.setDisable(false);
        ExecuteAllButton.setDisable(false);
        AllPromptLabel.setOpacity(1);
        ExecuteAllButton.setOpacity(1);

        DeletePromptLabel.setOpacity(0);
        DeleteTextField.setOpacity(0);
        ExecuteDeleteButton.setOpacity(0);
    }

    @FXML
    private void ShowDeleteCommand(ActionEvent event) {

        AddPromptLabel.setOpacity(0);
        AddTextField.setOpacity(0);
        ExecuteAddButton.setOpacity(0);

        getPromptLabel.setOpacity(0);
        GetTextField.setOpacity(0);
        ExecuteGetButton.setOpacity(0);

        SetPromptLabel.setOpacity(0);
        IndexLabel.setOpacity(0);
        NewDataLabel.setOpacity(0);
        IndexTextField.setOpacity(0);
        NewDataTextField.setOpacity(0);
        ExecuteSetButton.setOpacity(0);

        AllPromptLabel.setOpacity(0);
        ExecuteAllButton.setOpacity(0);

        DeletePromptLabel.setOpacity(1);
        DeleteTextField.setOpacity(1);
        ExecuteDeleteButton.setOpacity(1);
    }

    @FXML
    private void showGetCommand(ActionEvent event) {

        AddPromptLabel.setOpacity(0);
        AddTextField.setOpacity(0);
        ExecuteAddButton.setOpacity(0);

        getPromptLabel.setOpacity(1);
        GetTextField.setOpacity(1);
        ExecuteGetButton.setOpacity(1);

        SetPromptLabel.setOpacity(0);
        IndexLabel.setOpacity(0);
        NewDataLabel.setOpacity(0);
        IndexTextField.setOpacity(0);
        NewDataTextField.setOpacity(0);
        ExecuteSetButton.setOpacity(0);

        AllPromptLabel.setOpacity(0);
        ExecuteAllButton.setOpacity(0);

        DeletePromptLabel.setOpacity(0);
        DeleteTextField.setOpacity(0);
        ExecuteDeleteButton.setOpacity(0);

    }

}
