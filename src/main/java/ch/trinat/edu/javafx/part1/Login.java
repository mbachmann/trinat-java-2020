package ch.trinat.edu.javafx.part1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		
		final Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		stage.setScene(new Scene(root, 460, 180));
		
		//stage.getScene().getStylesheets().add(getClass().getResource("login.css").toExternalForm());
		stage.setTitle("FXML Demo");
		stage.show();
	}
	
	public static void main(final String[] args)
	{
		launch(args);
	}
}