package ch.trinat.edu.javafx.part1.selbststaendigeAufgabe;

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class randomText {
    static Vector<String> activity = new Vector<String>();
    public static void main(String[] args) {
        //Vector to store all activities from text file


        //store Activities from database into vector
        try (
                FileReader f = new FileReader("database.txt")) {
            char c[] = new char[100000000];
            f.read(c);
            String s = new String(c);
            String[] result = s.split("\r|\r\n|\n");

            for (int i = 0; i < result.length - 1; i++) {
                activity.add(result[i]);
                f.close();
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Einlesen der Datei.");
            System.err.println(e.getMessage());
        }
    }

    //random Activity generator
    public static String randomActivity(){
        int temp = (int)Math.round(Math.random()*activity.size());
        return activity.elementAt(temp);
    }

}
