package ch.trinat.edu.javafx.part1.uebung01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldFX extends Application {
	public void start(Stage primaryStage) {
		Label l1 = new Label("Hello");
		Label l2 = new Label("World");
		VBox root = new VBox();
		root.getChildren().add(l1);
		root.getChildren().add(l2);
		Scene scene = new Scene(root, 240, 40);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}