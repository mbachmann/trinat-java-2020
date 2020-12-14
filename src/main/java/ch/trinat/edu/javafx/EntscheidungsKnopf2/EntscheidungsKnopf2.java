package ch.trinat.edu.javafx.EntscheidungsKnopf2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;
import java.util.Vector;

public class EntscheidungsKnopf2 extends Application {

    Vector<String> events = new Vector<>();
    Button button1;
    Random r = new Random();

    @Override
    public void start(Stage primaryStage) {

        button1 = new Button("Klick mich!");
        button1.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        Button addButton = new Button("Add");
        TextField textField = new TextField();
        HBox hbox = new HBox(addButton, textField);
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(5, 5, 5, 5));

        addButton.setOnAction(evt -> {
            if (textField.getText().trim().equals("")) {
                textField.setText("Textfield is EMPTY");
            } else
                events.add(textField.getText());
        });

        VBox vBox = new VBox(hbox, button1);
        vBox.setSpacing(5);
        Scene scene = new Scene(vBox, 300, 120);

        // ActionHandler registrieren
        button1.setOnAction(e -> {
            if (events.isEmpty()) {
                vBox.getChildren().add(new Label("-> List empty!!!"));
            } else
                button1.setText(randomEvent());
        });

        DropShadow shadow = new DropShadow();
        button1.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> button1.setEffect(shadow));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Random Knopf");
        primaryStage.show();

    }

    public String randomEvent() {
        return events.get(r.nextInt(events.size()));
    }

    public static void main(String[] args) {
        launch(args);
    }

}
