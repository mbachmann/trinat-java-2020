package ch.trinat.edu.javafx.part1;

import javafx.application.Application;		//IMMER javafx. ...
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;				//zu * geändert da mehrere scene.control verwendet
import javafx.scene.layout.*;				//zu * geändert da mehrere scene.layout verwendet
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HalloWeltAction extends Application{
	public void start (Stage primaryStage) {
		Label l1 = new Label("Hallo");
		Label l2 = new Label("Welt");
		VBox root = new VBox();
		root.getChildren().add(l1);
		root.getChildren().add(l2);
		//root.getChildren().add(createButton());		//Damit der Button auch im Start erscheint
		root.getChildren().add(createButtonLambda());

		Scene scene = new Scene(root, 240, 140);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hallo Welt");
		primaryStage.show();
	}

	Pane createButton() {
		final Button btn = new Button();
		btn.setText("Add 'Hallo Welt' Label");
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(7, 7, 7, 7));
		pane.getChildren().add(btn);
		//ActionHandler registrieren
		btn.setOnAction(new EventHandler<ActionEvent>() {			//Anonym da kein Klassenname
			@Override
			public void handle(ActionEvent event) {					//Ereignisorientierte Programmierung
				pane.getChildren().add(new Label("- Hallo Welt -"));
			}
		});

		return pane;
	}
	
	Pane createButtonLambda () {
		final Button btn = new Button();
		btn.setText("Add 'Hallo Welt' Label");
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(7, 7, 7, 7));
		pane.getChildren().add(btn);
		//ActionHandler registrieren
		btn.setOnAction(event -> pane.getChildren().add(new Label(" - Hallo Welt - ")));
		
		return pane;
	}

	public static void main(String[] args) {
		launch(args);
	}
}