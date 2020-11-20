package ch.trinat.edu.javafx.decisionbutton2;

import java.util.Vector;

import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class DecisionButton2 extends Application {

	public String zufaelligeAntwort(Vector <String> options) {

		int random = (int)(Math.random()*options.size());
		return options.get(random);
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Entscheidungsknopf");
		Vector <String> auswahl = null;
		String[] events = {"Kino", "Konzert", "Essen gehen", "Spazieren gehen", "Fernsehen", "Rheinschwimmen", "Bleiben Sie Zuhause (Alain Berset, 2020)"};

		for (int i = 0; i < events.length; i++) {
			auswahl.add(events[i]);
		}

		ObservableList<String> entries = FXCollections.observableArrayList (auswahl);
		ListView<String> listView = new ListView<>(entries);
		
		

		Button addButton = new Button("Neu");
		Button button = new Button("Klick mich");
		TextField textField = new TextField();

		HBox hbox = new HBox(addButton, textField, button);
		addButton.setOnAction(evt -> {entries.add(textField.getText());});

		button.setOnAction(evt -> button.setText(zufaelligeAntwort(auswahl)));

		VBox vBox = new VBox(hbox, listView);

		Scene scene = new Scene(vBox, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}