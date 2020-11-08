package ch.trinat.edu.javafx.part1;

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

public class Ubung_4 extends Application{




	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(final Stage primaryStage) throws Exception {
		final BorderPane borderPane = new BorderPane();
		borderPane.setPadding(new Insets(7, 7, 7, 7));
		borderPane.setTop(createToolbarPane());
		borderPane.setCenter(createInputPane());
		borderPane.setLeft(createNavigationPane());
		
		//primaryStage.setTitle(LayoutExample.class.getSimpleName());
		primaryStage.setScene(new Scene(borderPane, 350, 250));
		
		primaryStage.setTitle("HelloWorld");
		primaryStage.show();

	}

	private Pane createNavigationPane() {
		final VBox vBox = new VBox(5);
		vBox.setStyle("-fx-border-width: 2; -fx-border-color: blue");
		vBox.getChildren().addAll(new Text ("LEFT"),
								  new Button("VBox1"),
								  new Button("VBox2"));
		return vBox;
	}

	private Pane  createInputPane() {
		final GridPane gridPane = new GridPane();
		gridPane.setBorder(
				new Border(
						new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID,null,
						new BorderWidths(5)))
				);
		
		gridPane.setPadding(new Insets(7, 7, 7, 7));
		gridPane.setGridLinesVisible(true);
		gridPane.setHgap(5);
		gridPane.setVgap(20);
		
		final Label label1 = new Label("Label1");
		final TextField textField1 = new TextField();
		final Label label2 = new Label("Label2");
		final TextField textField2 = new TextField();
		final Button btn = new Button("Button");
		
		gridPane.add(label1,0,0);
		gridPane.add(textField1,1,0);
		gridPane.add(label2,0,1);
		gridPane.add(textField2, 1,1);
		gridPane.add(btn, 2, 0);
		
		return gridPane;
	}

	private Pane createToolbarPane() {
		final HBox hBox = new HBox(5);
		hBox.setStyle("-fx-border-width: 2; -fx-border-color: red;");
		hBox.getChildren().addAll(
				new Text("TOP"), new Button("HBox1"), new Button ("HBox2"));
		
		return hBox;
	}

}



