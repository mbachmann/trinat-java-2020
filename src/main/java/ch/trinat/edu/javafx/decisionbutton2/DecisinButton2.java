package ch.trinat.edu.javafx.decisionbutton2;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class DecisinButton2 extends Application {
	
public String zufaelligeAntwort(String[] options) {
		
		String[] antwort = options;
		
		int random = (int)(Math.random()*antwort.length);
		return antwort[random];
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Entscheidungsknopf");
		
		final String[] events = {"Kino", "Konzert", "Essen gehen", "Spazieren gehen", "Fernsehen", "Rheinschwimmen", "Bleiben Sie Zuhause (Alain Berset, 2020)"};
		final ObservableList<String> entries = FXCollections.observableArrayList (events);
		final ListView<String> listView = new ListView<>(entries);
		
		Button addButton = new Button("Neu");
		Button button = new Button("Klick mich");
		TextField textField = new TextField();
		
		HBox hbox = new HBox(addButton, textField, button
				);
		addButton.setOnAction(evt -> {
			entries.add(textField.getText());
		});
		
		button.setOnAction(evt -> button.setText(zufaelligeAntwort(events)));
		
		VBox vBox = new VBox(hbox, listView);
		
		Scene scene = new Scene(vBox, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}