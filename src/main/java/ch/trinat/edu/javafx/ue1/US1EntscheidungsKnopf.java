package ch.trinat.edu.javafx.ue1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class US1EntscheidungsKnopf extends Application {

	Stage fenster;
	Scene szene;
	Button button;
	int auswahl; 
	String text; 

	// Antworten
	String[] antworten = { "Kino", "Konzert", "Essen gehen", "Lernen", "Film", "Gamen", "Sport"};

	@Override
	public void start(Stage primaryStage) {
		try {
			fenster = primaryStage;

			// Start der Applikation
			button = new Button("Klick mich");
			// Actionhandler
			button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// Ausgabe der zuf�llig gew�hlen Antwort
					button.setText(selectActivity());
					fenster.show(); 
				}
			});

			BorderPane layout = new BorderPane();
			layout.setCenter(button);
			szene = new Scene(layout, 100, 100);

			primaryStage.setScene(szene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String selectActivity() {
		auswahl = (int) (Math.random() * antworten.length);
		if (auswahl == antworten.length) {
			auswahl = auswahl - 1;
		}
		text = antworten[auswahl];
		return text;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
