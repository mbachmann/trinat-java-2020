package ch.trinat.edu.javafx.part1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ubung_3 extends Application{

	public void start(Stage primaryStage) {
		Label l1 = new Label ("Hallo");
		Label l2 = new Label ("Welt");
		VBox root = new VBox ();
		root.getChildren().add(l1);
		root.getChildren().add(l2);

		Scene scene = new Scene(root, 240,80);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
		root.getChildren().add(createButton());
		root.getChildren().add(createButtonLambda());
	}

	static Pane createButton() {

		final Button btn = new Button();
		btn.setText("-Hello World-");
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(7,7,7,7));
		pane.getChildren().add(btn);

		btn.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle (ActionEvent event) {
				pane.getChildren().add(new Label("-Hello World!-"));
			}

		});

		return pane;
	}

	static Pane createButtonLambda() {
		final Button bouton = new Button();
		bouton.setText("Other Text");
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(15,15,15,15));
		pane.getChildren().add(bouton);
		
		bouton.setOnAction(event->pane.getChildren()
				.add(new Label ("-Other Text-")));
		
		
		return pane;
	}
	
	
	
	public static void main (String [] args) {
		launch(args);
	}

}
