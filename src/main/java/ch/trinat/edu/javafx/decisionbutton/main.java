package ch.trinat.edu.javafx.decisionbutton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class main extends Application implements EventHandler<ActionEvent>{
	
	public void start(Stage window) {
		
		window.setTitle("Decision");
		StackPane root = new StackPane();
		
		Button button = new Button("Click me");
		root.getChildren().add(button);
		
		button.setOnAction(this);
		
		Scene scene = new Scene(root, 400, 400);
		window.setScene(scene);
		window.show();
	}
	
	public static void maion(String[] args) {
		launch(args);
	}
	
	@Override
	public void handle(ActionEvent event) {
		System.out.println("Hello World");
	}
}
