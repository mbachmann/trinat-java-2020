package ch.trinat.edu.javafx.ue1.U7LoginDialog;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	@FXML
	private PasswordField passwordField;
	@FXML
	private TextField nameField;
	@FXML
	protected void handleSubmitButtonAction(ActionEvent event)
	{
		System.out.println("Signin button user input: "
				+ nameField.getText() + " pwd: "
				+ passwordField.getText());
	}
}
