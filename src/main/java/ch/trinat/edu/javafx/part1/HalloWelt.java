package ch.trinat.edu.javafx.part1;

import javafx.application.Application;		//IMMER javafx. ...
import javafx.scene.Scene;
import javafx.scene.control.*;				//zu * geändert da mehrere scene.control verwendet
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HalloWelt extends Application{
	public void start (Stage primaryStage) {
		Label l1 = new Label("Hallo");
		Label l2 = new Label("Welt");
		VBox root = new VBox();
		root.getChildren().add(l1);
		root.getChildren().add(l2);

		Scene scene = new Scene(root, 240, 140);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hallo Welt");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
