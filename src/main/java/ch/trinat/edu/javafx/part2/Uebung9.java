package ch.trinat.edu.javafx.part2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class Uebung9 extends Application {
	@Override
	public void start(Stage stage) {
		TextField textfield = new TextField();
		// Label label = new Label();
		Slider slider = new Slider(1, 11, 5); // min max current values
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setBlockIncrement(1);
		textfield.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
		VBox layout = new VBox(10, textfield, slider);
		layout.setStyle("-fx-padding: 10px; -fx-alignment: baseline-right");
		stage.setScene(new Scene(layout, 300, 100));
		stage.setTitle("Slider & textfield bind");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}