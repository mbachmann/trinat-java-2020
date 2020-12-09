package ch.trinat.edu.javafx.part1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
int	counter = 0;
 @FXML
 private PasswordField passwordField;
 @FXML
 private TextField nameField;
 @FXML
 Label lab;
 @FXML
 protected void handleSubmitButtonAction(ActionEvent event)
 {
 System.out.println("Signin button user input: "
 + nameField.getText() + " pwd: "
 + passwordField.getText() );
 }
}
