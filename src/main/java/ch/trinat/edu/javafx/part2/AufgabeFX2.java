package ch.trinat.edu.javafx.part2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AufgabeFX2 extends Application {

	Stage fenster;
	Scene szene;
	Button buttonRandom, buttonExit, addButton;

	String[] namen;

	public void start(Stage primaryStage) {
		try {

			fenster = primaryStage;
			fenster.setTitle("                                          Entscheidungsknopf");

			VBox layout = new VBox();

			layout.setPrefWidth(220); // initialise taile optimale du bouton
			layout.setPrefHeight(65);

			buttonRandom = new Button("START");

			buttonRandom.setMinWidth(layout.getPrefWidth()); // donne la taille du bouton
			buttonRandom.setMinHeight(layout.getPrefHeight());

			buttonRandom.setTranslateX(155); // positionne le bouton
			buttonRandom.setTranslateY(80);

			Font f = new Font("Arial", 28); // permet de modifier la taille du texte dans le boutton
			buttonRandom.setFont(f);

			buttonExit = new Button("EXIT"); // initialise buttonExit pour quitter interface

			buttonExit.setTranslateX(460); // positionne le bouton Exit
			buttonExit.setTranslateY(159);

			buttonRandom.setStyle("-fx-background-color: pink"); // initialse la couleur du bouton
			buttonExit.setStyle("-fx-background-color: red");

			addButton = new Button("Add");
			TextField textField = new TextField();
			HBox hbox = new HBox(addButton, textField);

			hbox.setTranslateX(170);
			hbox.setTranslateY(-90);

			szene = new Scene(layout, 500, 250);

			layout.getChildren().addAll(buttonRandom, buttonExit, hbox);
			primaryStage.setScene(szene);
			primaryStage.show();
			

			addButton.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent event) {

					String chaine = textField.getText(); 
					
					buttonRandom.setText(chaine);
					

				}

			});
			

			buttonRandom.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent event) {

					buttonRandom.setText(text());
					fenster.show();

				}

			});

			buttonExit.setOnAction(new EventHandler<ActionEvent>() { // met en action le boutton pour quitter interface

				@Override
				public void handle(ActionEvent event) {
					System.exit(0);
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int Zufall() {
		int zufall;
		zufall = (int) (Math.random() * 10);

		return zufall;

	}

	public String text() {

		String[] name = { "Ins Kino gehen", "Essen gehen", "Trinken gehen", "Bus fahren", "Auto fahren",
				"Im Park gehen", "Party gehen", "Netflix", "Velo fahren", "Tanzen gehen" };

		return name[Zufall()];

	}

	public static void main(String[] args) {
		launch(args);
	}

}
