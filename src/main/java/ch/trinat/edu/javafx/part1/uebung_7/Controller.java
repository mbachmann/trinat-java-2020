package ch.trinat.edu.javafx.part1.uebung_7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	 private PasswordField passwordField;
	 @FXML
	 private TextField nameField;
	@FXML
	 private Button btn;
	 @FXML

	 protected void print(ActionEvent event)
	 { System.out.println("Signin button user input: "
				 + nameField.getText() + " pwd: "
				 + passwordField.getText());

	}}

