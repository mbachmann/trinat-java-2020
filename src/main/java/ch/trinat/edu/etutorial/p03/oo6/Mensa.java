package ch.trinat.edu.etutorial.p03.oo6;


import java.io.FileReader;



        import java.io.FileReader;
        import java.io.IOException;


public class Mensa {

    static Nahrungsmittel[] zutaten = new Nahrungsmittel [11];

    public static void main(String[] args) {



        try (	FileReader f = new FileReader ("/Users/theoportmann/IdeaProjects/trinat-java-20/src/main/java/ch/trinat/edu/etutorial/p03/oo6/Nahrungsmittel");){
            char[] c = new char [8000];
            f.read(c);

            String s = new String (c);
            String[] result = s.split(";|\n");

            for (int j=0;j<11;j++) {

                double [][] werte = new double [28][3];

                for (int i=1+j*85; i<85+j*85;i=i+3) {

                    werte[( i% 85 - 1)/3 ]	[0]= Double.parseDouble(result[i]);
                    werte[( i% 85 - 1)/3 ]	[1]= Double.parseDouble(result[i+1]);
                    werte[( i% 85 - 1)/3 ]	[2]= Double.parseDouble(result[i+2]);


                }

                Nahrungsmittel ntemp = new Nahrungsmittel (result[j*85]);
                ntemp.setNaehrwerte(werte);
                zutaten[j]=ntemp;


                f.close();
            }
        }

        catch (IOException e) {
            System.err.println("Fehler beim Einlesen der Datei.");
            System.err.println(e.getMessage());
        }



        int beilage = (int)(Math.random()*3);
        int fleisch = (int)(Math.random()*4+3);
        int gemuse = (int)(Math.random()*4+7);


        Menu menu = new Menu ("Menu 1 " ,zutaten[fleisch],zutaten[gemuse],zutaten[beilage]);

        menu.print();
        menu.gefrieren();
        menu.kochen();
        System.out.println();



    }

}
