package ch.trinat.mohlertanja.tutorials.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label label1 = new Label("Hello");
		Label label2 = new Label("World");
		
		VBox root = new VBox();
		
		root.getChildren().add(label1);
		root.getChildren().add(label2);
		
		root.getChildren().add(createButtonLamda());
		
		Scene scene = new Scene(root, 600, 300, Color.AZURE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Java FX Basic Application");
		primaryStage.show();
	}
	
	Pane createButton() {
		final Button button = new Button();
		button.setText("Add a 'Hello World' Label");
		final Pane pane = new FlowPane();
		pane.setPadding(new Insets(7, 7, 7, 7));
		pane.getChildren().add(button);
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				pane.getChildren().add(new Label("- Hello World! -"));
			}
		});
				
		return pane;
	}
	
	public static void main(String args[]) {
		launch(args);
	}

	Pane createButtonLamda() {
		final Button button = new Button();
		button.setText("Add 'Hello World' Label");
		final Pane pane = new FlowPane();
		pane.setPadding(new Insets(7, 7, 7, 7));
		pane.getChildren().add(button);
		
		button.setOnAction(event -> pane.getChildren().add(new Label("- Hello World! -")));
		
		return pane;
	}
	
}
