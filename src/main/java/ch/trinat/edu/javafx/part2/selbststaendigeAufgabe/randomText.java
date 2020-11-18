package ch.trinat.edu.javafx.part2.selbststaendigeAufgabe;


import ch.trinat.edu.javafx.part2.selbststaendigeAufgabe.Main;

public class randomText {
    // random Activity generator
    public static String randomActivity(int temp){
        return Main.activity.elementAt(temp);
    }

}
