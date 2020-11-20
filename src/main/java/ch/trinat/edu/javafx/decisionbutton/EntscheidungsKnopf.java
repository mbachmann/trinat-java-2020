package ch.trinat.edu.javafx.decisionbutton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EntscheidungsKnopf extends Application {

	// Variablen kreieren
	Stage fenster;
	Scene szene;
	Button button;
	int position;
	String text;

	// Liste von Aktivitäten kreieren
	String[] liste = { "Kino", "Konzert", "Essen gehen", "Schlafen", "Nichts", "Fern schauen", "Musik hören",
			"Sport schauen" };

	@Override
	public void start(Stage primaryStage) {
		try {
			fenster = primaryStage;

			// Am Anfang sollte der button Klick Mich sagen
			button = new Button("Klick mich");
			// Action für Button programmieren
			button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// Wenn gedrückt wird, sollte sich der Text im Button ändern - es muss ein
					// Random text erstellt wird
					button.setText(selectActivity());
					fenster.show();
				}
			});

			// Neuen BorderPane erstellen für das layout
			BorderPane layout = new BorderPane();
			// Label1 und Button1 reintun
			layout.setCenter(button);
			// Szene 1 kreiren als layout1
			szene = new Scene(layout, 100, 100);

			// Szene zeigen
			primaryStage.setScene(szene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String selectActivity() {
		position = (int) (Math.random() * liste.length);
		if (position == liste.length) {
			position = position - 1;
		}
		text = liste[position];
		return text;
	}

	public static void main(String[] args) {
		launch(args);

	}

}
