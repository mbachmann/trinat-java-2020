package ch.trinat.edu.javafx.decisionbutton.decisionButtonPart1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DecisionButtonPart1 extends Application {
	
	String randomWord = "Klick mich!";
	
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		
		root.getChildren().add(createButton());
		
		Scene scene = new Scene(root, 800, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Entscheidungsknopf");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

	Pane createButton() {
		final Button btn = new Button();
		btn.setText(randomWord);
		final FlowPane pane = new FlowPane();
		pane.getChildren().add(btn);
		// ActionHandler registrieren
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				random();
			}
		});
		return pane;
	}
	
	void random() {
		randomWord = "test";
	}
}
