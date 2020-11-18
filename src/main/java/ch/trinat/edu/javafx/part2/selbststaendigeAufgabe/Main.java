package ch.trinat.edu.javafx.part2.selbststaendigeAufgabe;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        final Parent root = FXMLLoader.load(getClass().getResource("Fx2_selbst.fxml"));
        stage.setScene(new Scene(root, 460, 180));
        stage.setTitle("JavaFx2 selbstaendiger Teil : Klick Mich rev2");
        stage.show();
    }

    //Vector to store all activities from text file
    static Vector<String> activity = new Vector<String>();


    public static void main(final String[] args)
    {
        readFile();
        launch(args);
    }

    public static void readFile(){
        //store Activities from database into vector
        try (
                FileReader f = new FileReader("C:\\Users\\micas\\Documents\\Cours\\Java\\IntelliJS3\\trinat-java-2020\\src\\main\\resources\\ch\\trinat\\edu\\javafx\\part2\\selbststaendigeAufgabe\\randomText")) {
            char c[] = new char[10000];
            f.read(c);
            String s = new String(c);
            String[] result = s.split("\r");

            for (int i = 0; i < result.length - 1; i++) {
                activity.add(result[i]);
                f.close();
            }
        }
        catch (IOException e) {
            System.err.println("Fehler beim Einlesen der Datei.");
            System.err.println(e.getMessage());
        }
    }
}

