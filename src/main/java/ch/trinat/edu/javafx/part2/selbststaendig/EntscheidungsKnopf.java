package ch.trinat.edu.javafx.part2.selbststaendig;

	import java.util.Vector;

import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.stage.Stage;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.layout.BorderPane;



	public class EntscheidungsKnopf extends Application {
		@Override 
		public void start(Stage primaryStage) {
			try {
				Vector liste = Controller.liste();
				Parent root = FXMLLoader.load(getClass().getResource("EntscheidungsKnopf.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setTitle("Entscheidungsbutton");
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}

