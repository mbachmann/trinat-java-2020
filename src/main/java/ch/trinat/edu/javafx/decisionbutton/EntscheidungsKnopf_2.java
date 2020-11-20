package ch.trinat.edu.javafx.decisionbutton;

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

public class EntscheidungsKnopf_2 extends Application {// Variablen kreieren
	Stage fenster;
	Scene szene;
	Button button, buttonSave;
	int position;
	String text;

	// Liste von Aktivitäten kreieren
	String[] liste = {};
	ObservableList<String> eintrage = FXCollections.observableArrayList(liste);

	@Override
	public void start(Stage primaryStage) {
		try {
			fenster = primaryStage;

			/*
			 * Layout *
			 */

			// TextFeld für Eingabe von Aktivitäten
			TextField textField = new TextField();

			// Dazugehöriges Label für TextFeld
			Label labelForText = new Label("Tat: ");

			// Save button um neue Einträge speichern zu können
			buttonSave = new Button("Save");

			// HBox aus Label, TextFeld und Save machen
			HBox hBox = new HBox();
			hBox.getChildren().addAll(labelForText, textField, buttonSave);
			hBox.setSpacing(10);

			/*
			 * Text Feld *
			 */
			buttonSave.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if (textField.getText().equals("")) {
						// Wenn leer wird nicht was eingegeben
						System.out.println("Keine leere Einträge");
						textField.clear();
					} else if (eintrage.contains(textField.getText())) {
						// Wenn schon in der Liste wird nichts eingegeben
						textField.clear();
						System.out.println("Bereits in der Liste");
					} else {
						eintrage.add(textField.getText());
					}
					// TextFeld clearen, wenn gesaved
					textField.clear();
				}
			});

			/*
			 * Button, der Taten ausgibt *
			 */

			// Am Anfang sollte der button Klick Mich sagen
			button = new Button("Klick mich");
			// Action für Button programmieren
			button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// Falls noch nichts in der List ist, wird der Button nur zu "Aktivitaet
					// eingeben" geändert
					if (eintrage.size() == 0) {
						button.setText("Aktivitaet eingeben");
					} else {
						// Falls schon was in der Liste ist, Random Eintrag der Liste ablesen und als
						// Button tun
						button.setText(selectActivity());
					}
					fenster.show();
				}
			});

			// Neuen BorderPane erstellen für das layout
			BorderPane layout = new BorderPane();
			// Label1 und Button1 reintun
			layout.setCenter(button);
			layout.setTop(hBox);
			// Szene 1 kreiren als layout1
			szene = new Scene(layout, 300, 300);

			// Szene zeigen
			primaryStage.setScene(szene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String selectActivity() {
		position = (int) (Math.random() * eintrage.size());
		if (position == eintrage.size()) {
			position = position - 1;
		}
		text = eintrage.get(position);
		return text;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
