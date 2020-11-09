package ch.trinat.edu.javafx.part1.selbststaendigeAufgabe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private PasswordField button;
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event)
    {
    button.setText(randomText.randomActivity());
    }
}