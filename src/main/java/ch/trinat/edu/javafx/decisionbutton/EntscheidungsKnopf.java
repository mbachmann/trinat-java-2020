package ch.trinat.edu.javafx.decisionbutton;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class EntscheidungsKnopf extends Application {
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setPrefWidth(200);
		root.setPrefHeight(80);
		
		Label label1 = new Label("Was machen wir heute Abend?");
		root.getChildren().add(label1);
		root.getChildren().add(createButtonLambda(root));

		Scene scene = new Scene(root, 500, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Entscheidungsknopf");
		primaryStage.show();
	}

	Pane createButtonLambda(VBox root) {
		final Button btn = new Button();
		btn.setMinWidth(root.getPrefWidth());
		btn.setMinHeight(root.getPrefHeight());
		btn.setText("Klick mich!");
		btn.setOnAction(event-> btn.setText(zufallsAntwort()));
		
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(7, 7, 7, 7));
		pane.getChildren().add(btn);
		pane.setAlignment(Pos.BASELINE_CENTER);
				
		return pane;
	}
	
	String zufallsAntwort() {
		Random zufallszahl = new Random();
		int zufallsInt;
		
		ArrayList<String> antwort = new ArrayList<>();
		antwort.add("Essen gehen");
		antwort.add("Kino");
		antwort.add("Konzert");
		antwort.add("Spieleabend");
		antwort.add("Nichts");
		zufallsInt = zufallszahl.nextInt(antwort.size());
		
		return antwort.get(zufallsInt);
	}

	public static void main(String[] args) {	
		launch(args);
	}

}
