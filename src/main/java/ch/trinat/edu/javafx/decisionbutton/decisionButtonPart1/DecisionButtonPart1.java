package ch.trinat.edu.javafx.decisionbutton.decisionButtonPart1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DecisionButtonPart1 extends Application {
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		Scene scene = new Scene(root, 800, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Entscheidungsknopf");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
