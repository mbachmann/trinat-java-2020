package ch.trinat.edu.javafx.ue2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class US2EntscheidungsKnopfErweiterung extends Application {

	Stage fenster;
	Scene szene;
	Button button, buttonTat;
	int auswahl;
	String text;

	// Antworten
	String[] antworten = { };
	ObservableList<String> eintrage = FXCollections.observableArrayList(antworten);

	@Override
	public void start(Stage primaryStage) {
		try {
			fenster = primaryStage;

			
			// TextFeld Eingabe
			TextField textField = new TextField();

			// Label Textfeld
			Label labelForText = new Label("Tat: "); 

			// neue Eintr�ge speichern
			buttonTat = new Button("Save"); 

			// HBox
			HBox hBox = new HBox(); 
			hBox.getChildren().addAll(labelForText, textField, buttonTat);
			hBox.setSpacing(10);

			
			buttonTat.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if (textField.getText().equals("")) {
						// falls Eingabe leer
						System.out.println("Eingabe leer");
						textField.clear();
					} else if (eintrage.contains(textField.getText())) {
						// falls doppelte Tat
						textField.clear();
						System.out.println("Tat bereits vorhanden");
					} else {
						eintrage.add(textField.getText());
					}
					textField.clear();
				}
			});


			// Start der Applikation
			button = new Button("Klick mich");
			// Actionhandler
			button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// Falls Liste leer
					if (eintrage.size() == 0) {
						button.setText("Tat eingeben");
					} else {
						// Ausgabe der zuf�llig gew�hlen Antwort aus der Liste
						button.setText(selectActivity());
					}
					fenster.show();
				}
			});

			BorderPane layout = new BorderPane();
			layout.setCenter(button);
			layout.setTop(hBox);
			szene = new Scene(layout, 300, 300);

			primaryStage.setScene(szene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String selectActivity() {
		auswahl = (int) (Math.random() * eintrage.size());
		if (auswahl == eintrage.size()) {
			auswahl = auswahl - 1;
		}
		text = eintrage.get(auswahl);
		return text;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
