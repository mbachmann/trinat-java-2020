package ch.trinat.edu.javafx.part1.Ubung_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Helloworld extends Application {

		public void start(Stage primaryStage) {
			Label l1= new Label("Hallo");
			Label l2= new Label("Welt");
			VBox root= new VBox();
			root.getChildren().add(l2);
			root.getChildren().add(l1);
			Scene scene= new Scene(root, 240, 40);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Hello World");
			primaryStage.show();
		}
		
		public static void main(String[] args) {
			launch(args);
			}
		}
	


