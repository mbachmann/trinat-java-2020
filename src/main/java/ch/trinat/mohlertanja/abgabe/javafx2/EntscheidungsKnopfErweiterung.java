package ch.trinat.mohlertanja.abgabe.javafx2;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class EntscheidungsKnopfErweiterung extends Application {
	
	List<String> entries = new Vector<String>();

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {			
//			String[] plans = { "Wir gehen ins Kino", "Wir gehen an ein Konzert", "Wir gehen essen",
//					"Wir gehen spazieren", "Wir sehen uns einen Film an", "Wir gamen", "Wir gehen tanzen" };
			
			//List<String> entries = plans;
			entries.add("Wir gamen");
			
			BorderPane pane = new BorderPane();
			pane.setMinHeight(300);
			pane.setMinWidth(500);
			GridPane grid = new GridPane();
			
			Label label = new Label("Tat: ");
			//label.setAlignment(Pos.TOP_LEFT);
			grid.add(label, 0, 0);
			
			TextField text = new TextField();
//			text.setMaxHeight(100);
//			text.setMinHeight(20);
//			text.setPrefHeight(Region.USE_COMPUTED_SIZE);
//			text.setAlignment(Pos.TOP_CENTER);
			grid.add(text, 1, 0);
			
			Button saveButton = new Button("save");
//			saveButton.setAlignment(Pos.TOP_RIGHT);
			saveButton.setOnAction(evt -> {
				String newEntry = text.getText();
				if(newAnswer(newEntry)) {
					entries.add(newEntry);
				}
			});
			grid.add(saveButton, 2, 0);
			
//			VBox vbox = new VBox();
//			vbox.setPadding(new Insets(10));
//
//			vbox.getChildren().add(label);
//			vbox.getChildren().add(text);
//			vbox.getChildren().add(saveButton);
//
//			vbox.getChildren().add(createButton());
			grid.add(createButton(), 1, 2);
			
			
			pane.setTop(grid);

			Scene scene = new Scene(pane, Color.AZURE);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Was machen wir heute Abend?");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	Pane createButton() {
		final Button button = new Button();
		button.setText("Klick mich");

		final BorderPane pane = new BorderPane();
		BorderPane.setAlignment(button, Pos.CENTER);
		BorderPane.setMargin(button, new Insets(12, 12, 12, 12));
		pane.setCenter(button);

		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				button.setText(randomAnswer());
			}
		});

		return pane;
	}
	
	public boolean newAnswer(String text) {
		if (!text.isEmpty()) {
			for (int i = 0; i < entries.size(); i++) {
				if(entries.get(i).contentEquals(text)) {
					System.out.println("Eintrag schon vorhanden");
					return false;
				}
			}
			return true;
		}
		else {
			System.out.println("Leerer Eintrag");
			return false;
		}
	}

	public String randomAnswer() {
//		String[] todaysPlan = { "Wir gehen ins Kino", "Wir gehen an ein Konzert", "Wir gehen essen",
//				"Wir gehen spazieren", "Wir sehen uns einen Film an", "Wir gamen", "Wir gehen tanzen" };
		int random = (int) (Math.random() * entries.size());
		return entries.get(random);
	}
	
	Pane eingabe() {
		Label label = new Label("Tat: ");
		
		final BorderPane pane = new BorderPane();
		
		BorderPane.setAlignment(label, Pos.TOP_LEFT);
		//BorderPane.setMargin(label, new Insets(12, 12, 12, 12));
		pane.getChildren().add(label);
		
		return pane;
	}

	public static void main(String[] args) {
		launch(args);
	}
}