package ch.trinat.edu.javafx.part2.uebung09;

import java.text.NumberFormat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaSliderField extends Application {
	@SuppressWarnings("deprecation")
	@Override
	public void start(Stage stage) {
		TextField textField = new TextField ();
		Slider slider = new Slider(1, 10, 5);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setBlockIncrement(1);
		
	    final double INIT_VALUE = 5;
        slider.setValue(INIT_VALUE);
        textField.setText(new Double(INIT_VALUE).toString());
        textField.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());
        
		VBox layout = new VBox(10, textField, slider);
		layout.setStyle("-fx-padding: 10px; -fx-alignment: baseline-right");
		stage.setScene(new Scene(layout, 300, 100));
		stage.setTitle("Goes to");
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}