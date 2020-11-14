package ch.trinat.mohlertanja.tutorials.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
		
		Scene scene = new Scene(root, 600, 300, Color.AZURE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Java FX Basic Application");
		primaryStage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
