package ch.trinat.edu.javafx.part1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	@FXML
	private PasswordField passwortfeld;
	
	@FXML
	private TextField nameFeld;
	
	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		System.out.println("Signin button user input: " + nameFeld.getText() + " pwd: " + passwortfeld.getText());
	}
	
}
