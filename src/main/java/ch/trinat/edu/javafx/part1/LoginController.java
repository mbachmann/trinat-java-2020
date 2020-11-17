package ch.trinat.edu.javafx.part1;

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

/*<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.ColumnConstraints?>
<?import javafx.scene.layout.GridPane?>
<?import javafx.scene.layout.RowConstraints?>

<GridPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="386.0" prefWidth="508.0" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/11.0.1" fx:controller="Teil_1.fxml.LoginController">
  <columnConstraints>
    <ColumnConstraints hgrow="SOMETIMES" maxWidth="249.0" minWidth="10.0" prefWidth="96.0" />
    <ColumnConstraints hgrow="SOMETIMES" maxWidth="412.0" minWidth="10.0" prefWidth="412.0" />
  </columnConstraints>
  <rowConstraints>
      <RowConstraints maxHeight="87.0" minHeight="10.0" prefHeight="87.0" vgrow="SOMETIMES" />
    <RowConstraints maxHeight="133.0" minHeight="10.0" prefHeight="100.0" vgrow="SOMETIMES" />
    <RowConstraints maxHeight="145.0" minHeight="10.0" prefHeight="104.0" vgrow="SOMETIMES" />
    <RowConstraints maxHeight="98.0" minHeight="10.0" prefHeight="98.0" vgrow="SOMETIMES" />
  </rowConstraints>
   <children>
      <Button mnemonicParsing="false" onAction="#handleSubmitButtonAction" text="Login" GridPane.columnIndex="1" GridPane.rowIndex="3" />
      <Label text="   Name:" GridPane.rowIndex="1" />
      <Label text="   Password:" GridPane.rowIndex="2" />
      <TextField fx:id="nameField" GridPane.columnIndex="1" GridPane.rowIndex="1" />
      <TextField fx:id="passwordField" GridPane.columnIndex="1" GridPane.rowIndex="2" />
   </children>
</GridPane>
 * 
 */
