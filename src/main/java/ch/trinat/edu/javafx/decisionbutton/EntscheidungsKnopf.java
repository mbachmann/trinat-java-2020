package ch.trinat.edu.javafx.decisionbutton;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EntscheidungsKnopf extends Application {
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		root.getChildren().add(createButton());
		
		Scene scene = new Scene(root, 370, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Was machen wir heute Abend?");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	Pane createButton() {
		final Button btn = new Button();
		String Klick = "Klick Mich";
		String Kino = "Kino";
		String Essen = "Essen gehen";
		String Konzert = "Konzert";
		String Theater = "Theater";
		String Karting = "Karting";
		String Paintball = "Paintball";
		btn.setText(Klick);
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(140, 0, 0, 150));
		pane.getChildren().add(btn);
		btn.setOnAction(event -> pane.getChildren()
				.add(new Label("- Hello World! -")));
		return pane;
	}
}
