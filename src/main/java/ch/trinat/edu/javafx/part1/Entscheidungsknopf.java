package ch.trinat.edu.javafx.part1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Entscheidungsknopf extends Application{

	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			Button button = new Button("Klick mich");
			

			root.setCenter(button);
			primaryStage.setScene(new Scene(root));
			primaryStage.setTitle("Entscheidungsknopf");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
