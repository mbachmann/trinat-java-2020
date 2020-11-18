package ch.trinat.edu.javafx.part2.selbststaendigeAufgabe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;

public class Controller {
    @FXML
    private Button btn;

    @FXML
    private TextField textfeld;

    @FXML
    private Button speichern;

    @FXML
    private Label label;

    private String eingabe;
    private boolean condition = false;
    private String previousInput = "";
    private int previousInt = 0, temp;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        Main.readFile();
        temp = (int)(Math.random()* Main.activity.size());
        if (temp != previousInt) {
            btn.setText(randomText.randomActivity(temp));
        }
        else {
            btn.setText(randomText.randomActivity(temp+1));
        }
        previousInt = temp;
    }

    @FXML
    void handleSpeichern(ActionEvent event) {
        eingabe = textfeld.getText();

        //verify that input doesn't match previous input
        Main.readFile();
        for(int i = 0; i < Main.activity.size(); i++){
            if (Main.activity.elementAt(i).equals(eingabe) == true){
                condition = true;
            }
            else { condition = false; }
        }


        // write into text file
        if (condition == false && eingabe != "" ) {

            try (FileWriter w = new FileWriter("C:\\Users\\micas\\Documents\\Cours\\Java\\IntelliJS3\\trinat-java-2020\\src\\main\\resources\\ch\\trinat\\edu\\javafx\\part2\\selbststaendigeAufgabe\\randomText", true)) {

                w.write("\r" + eingabe);

            } catch (IOException e) {
                System.err.println("Fehler beim Schreiben in der Datei.");
                System.err.println(e.getMessage());
            }
            textfeld.setText("");
            label.setText("gespeichert!");
        }

        //display error
        else {
            label.setText("Eingabe schon vorhanden");
            textfeld.setText("");
        }
       previousInput = eingabe;
    }
}
