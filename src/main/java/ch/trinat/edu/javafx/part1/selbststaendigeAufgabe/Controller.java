package ch.trinat.edu.javafx.part1.selbststaendigeAufgabe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button btn;
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event)
    {
    	
    btn.setText(randomText.randomActivity());
    }
}