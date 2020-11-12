package ch.trinat.edu.javafx.part2.Fx2_Uebg9;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SlideText extends Application {
        @Override
            public void start(Stage stage) throws Exception {
                final Parent root = FXMLLoader.load(getClass().getResource("MarcusAurelius"));
                stage.setScene(new Scene(root, 460, 180));
                stage.setTitle("Uebg9");
                stage.show();
        }
        public static void main(String[] args) {
            launch(args);
        }
    }
