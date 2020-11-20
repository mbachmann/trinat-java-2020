package ch.trinat.edu.javafx.decisionbutton2;

import javafx.application.Application;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class DecisionButton2 extends Application {

	//Liste mit Aktivitäten erstellen
	String[]activityList = {};
	ObservableList <String> entries = FXCollections.observableArrayList(activityList);

	@Override
	public void start(Stage primaryStage) {
		try {

			//TextFeld für Eingabe von Aktivitäten
			TextField textField = new TextField();

			//Label zu TextField
			Label labelforText = new Label("Aktion: ");	

			//Speichern Button
			Button saveButton = new Button("Speichern");

			//HBox erstellen
			HBox hBox = new HBox();
			hBox.getChildren().addAll(labelforText, textField, saveButton);
			hBox.setSpacing(25);

			//TextFeld
			saveButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					//Falls leer
					if (textField.getText().equals("")) {
						System.out.println("Leerer Eintrag nicht erlaubt");
					}
					else if (entries.contains(textField.getText())) {
						//Falls in Liste bereits vorhanden
						textField.clear();
						System.out.println("Haben Sie bereits eingetragen");
					}
					else {
						entries.add(textField.getText());
					}
					//Nach Eintrag TextField leeren
					textField .clear();

				}
			});

			//Button der Aktionen ausgibt
			Button button = new Button("Klick mich");
			button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if (entries.size() == 0) {
						button.setText("Aktion eingeben");
					}
					else {
						button.setText(selectActivity());
					}
					primaryStage.setTitle("Entscheidungsknopf 2.0");
					primaryStage.show();
				}
			});
			
			BorderPane layout = new BorderPane();
			layout.setCenter(button);
			layout.setTop(hBox);
			
			Scene scene = new Scene(layout, 500, 500);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String selectActivity() {
		int position = (int) (Math.random() * entries.size());
		if (position == entries.size()) {
			position = position - 1;
		}
		String text = entries.get(position);
		return text;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
