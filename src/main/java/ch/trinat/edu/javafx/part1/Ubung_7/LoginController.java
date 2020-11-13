package ch.trinat.edu.javafx.part1.Ubung_7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private PasswordField passwordField;
	
	@FXML
	private TextField     nameField;
	
	@FXML
	private Button btn;
	
	@FXML
	protected void handleSubmitButtonAction(ActionEvent event){
		System.out.println("Signin button user input: "
				+ nameField.getText() 
				+ " pwd: "+ passwordField.getText());
	}

}