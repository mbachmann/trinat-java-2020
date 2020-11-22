package ch.trinat.edu.javafx.decisionbutton;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EntscheidungsKnopf extends Application {

	final String[] events = {"Kino", "Essen gehen", "Konzert", "Theater", "Karting", 
			"Paintball","Fahrrad fahren" ,"Laufen gehen" ,"Netflix" ,"Sport machen" ,"Market gehen"};
	final ObservableList<String> entries = FXCollections.observableArrayList(events);

	int nbradd = 0;

	public void start(Stage primaryStage) {
		

		Button addButton = new Button("Add");
		TextField textField = new TextField();
		HBox hbox = new HBox(addButton, textField);


		addButton.setOnAction(event -> {
			entries.add(textField.getText());
			nbradd = nbradd + 1;
		});

		VBox root = new VBox(hbox);
		root.getChildren().add(createButton());

		Scene scene = new Scene(root, 370, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Was machen wir heute Abend?");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

	public String randomEvent() {
		int nbrevent = (int) (Math.random() * (11 + nbradd));
		String eventChoice = events[nbrevent];
		return eventChoice;
	}

	Pane createButton() {
		final Button btn = new Button();
		btn.setText("Klick Mich");
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(140, 0, 0, 150));
		pane.getChildren().add(btn);
		btn.setOnAction(event -> btn.setText(randomEvent()));
		return pane;
	}
}
