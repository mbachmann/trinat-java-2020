package ch.trinat.mohlertanja.tutorials.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LayoutCombinationExample extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		final BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(7, 7, 7, 7));
		pane.setTop(createToolbarPane());
		pane.setCenter(createInputPane());
		pane.setLeft(createNavigationPane());
		primaryStage.setTitle(LayoutCombinationExample.class.getSimpleName());
		primaryStage.setScene(new Scene(pane, 350, 250));
		
		primaryStage.setTitle("LayoutCombinationExample");
		primaryStage.show();
		
	}
	
	private Pane createInputPane() {
		final GridPane pane = new GridPane();
		pane.setBorder(
				new Border(
						new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, null, new BorderWidths(5)))
		);
		pane.setPadding(new Insets(7, 7, 7, 7));
		pane.setGridLinesVisible(true);
		pane.setHgap(5);
		pane.setVgap(10);
		
		final Label label1 = new Label("Label 1");
		final Label label2 = new Label("Label 2");
		final TextField textfield1 = new TextField();
		final TextField textfield2 = new TextField();
		final Button button = new Button("Button");
		
		pane.add(label1, 0, 0);
		pane.add(textfield1, 1, 0);
		pane.add(label2, 0, 1);
		pane.add(textfield2, 1, 1);
		pane.add(button, 1, 2);
		
		return pane;
	}
	
	private Pane createToolbarPane() {
		final HBox hbox = new HBox(5);
		hbox.setStyle("-fx-border-width: 2;-fx-border-color: red;");
		hbox.getChildren().addAll(new Text("TOP"), new Button("HBox1"), new Button("HBox2"));
		
		return hbox;
	}
	
	private Pane createNavigationPane() {
		final VBox vbox = new VBox(5);
		vbox.setStyle("-fx-border-width: 2;-fx-border-color: red;");
		vbox.getChildren().addAll(new Text("LEFT"), new Button("VBox 1"), new Button("VBox 2"));
		
		return vbox;
	}

	public static void main(String[] args) {
		launch(args);
		
	}

}
