package com.mycompany.arraystack;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

    public void initialize() {

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
    private void ExecuteAdd(ActionEvent event) {

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

    @FXML
    private void ExecuteGet(ActionEvent event) {

    }

    @FXML
    private void ExecuteSetButton(ActionEvent event) {
    }

    @FXML
    private void ExecuteAllCommand(ActionEvent event) {
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
    private void ExecuteDeleteCommand(ActionEvent event) {
    }
}
