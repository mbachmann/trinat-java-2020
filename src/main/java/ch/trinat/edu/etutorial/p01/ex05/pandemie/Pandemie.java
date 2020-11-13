package ch.trinat.edu.etutorial.p01.ex05.pandemie;
//import java.util.Scanner;

import processing.core.PApplet;

public class Pandemie extends PApplet
{
	private static final long serialVersionUID = 1L;

	// globale Matrix für das Speichern der Population
	double infektionsrate=30;
	int zeile=190, spalte=93, maxTage=365;
    int[][] population = new int[zeile][spalte];
    static int tage=1;
	static public void main(String args[]) {
		PApplet.main(new String[] { "ch.trinat.edu.etutorial.p01.ex05.pandemie.Pandemie" });
	}

    public void setup()
    {
    	/*
		try(Scanner eingabe = new Scanner(System.in))
		{
	        System.out.println("Wie lange soll die Simulation dauern?");
	        maxTage = eingabe.nextInt();

	        System.out.println("Wie ansteckend ist die Krankheit?");
	        infektionsrate = eingabe.nextInt();
		}
		*/

    	size(1900, 950);  	// Setzt die Grösse des Fensters
	    background(255);  	// Setzt die Hintergrundfarbe auf Weiss
	    fill(0);			// Setzt die Schreibfarbe auf Schwarz;
    	frameRate(21); 		// gibt an wie schnell die Simulation laufen soll
	    textSize(10);		// Die Grösse der Schrift wird auf 20 Pixel gesetzt

	    // Die Werte im Array Personen werden auf 0 gesetzt
	    for (int i = 0; i < zeile; i++)
	    {
		    for (int j = 0; j < spalte; j++)
		    {
			    population[i][j] = 0;
		    }
	    }
	    //Patient-Zero
		population[(int) (Math.random()*zeile-1)+1][(int) (Math.random()*spalte-1)+1] = 1;
		print();
    }

    //Diese Methode wird endlos wiederholt und macht so die Annimation der Pandemie
	public void draw()
	{
		background(255);
		for (int i = 1; i < zeile-1; i++)
		{
			for (int j = 1; j < spalte-1; j++)
			{
				ansteckung(i,j);
			}
		}

		//Ausgabe im Processing Fenster
		print();

		text("Tag " + tage, 0, 940);
		tage++;
    }
	public void print()
	/* Ausgabe im Processing Fenster:
	Text wird nicht mit System.out.println ausgegeben, sondern mit der Methode text.
	Diese Methode bekommt einen Text und die Position, wo dieser Text geschrieben werden soll.
	Position des Texts x-Wert= x*Schriftgrösse + Schriftgrösse. y-Wert analog*/
	{
		for (int x = 0; x < zeile; x++)
		{
			for (int y = 0; y < spalte; y++)
			{
				if ((population[x][y] > 0)&&(infektioes(x,y)))
				{
					text(population[x][y], x * 10+10, y * 10+10);
				}
			}
		}
	}
	public int getZufall()
	{
		int zufall;
	    zufall = (int) (Math.random()*((1/infektionsrate)*100));
	    return zufall;
	}
	public void ansteckung(int x, int y)
	{
		if (population[x][y]==0)
		{
			if (
					(infektioes(x,y-1))||
					(infektioes(x,y+1))||
					(infektioes(x-1,y))||
					(infektioes(x+1,y))
				)
			{
				if(getZufall()==0)
				{
					population[x][y] = 1;
				}
			}
		}
		else if (population[x][y] < 21)
		{
			population[x][y] = population[x][y] + 1;
		}
		else if (population[x][y] == 21)//Kann nach 21 Tagen wieder angesteckt werden.
		{
			population[x][y] = 0;
		}
	}
	public boolean infektioes(int x, int y)
	{
		boolean ansteckung;
		if ((population[x][y]>0)&&(population[x][y]<8))
		{
			ansteckung = true;
		}
		else
		{
			ansteckung = false;
		}
		return ansteckung;
	}
}
