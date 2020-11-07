package ch.trinat.edu.etutorial.p01.ex02.doppeln;
import java.util.Scanner;

public class Doppeln 
{
	public static void main(String[] args) 
	{
		try (Scanner eingabe = new Scanner(System.in)) //Wartet auf eingaben.
		{
			double zahl; // Erstellt die Variabel "zahl" als Type "double".
			System.out.println("Geben Sie eine Zahl ein!");
			zahl = eingabe.nextDouble(); // Die Eingabe wird in der Variabel "zahl" gespeichert.
			zahl *= 2; // Die Variabel "zahl" wird verdoppelt.
			System.out.println("Ich verdopple zu:");
			System.out.println(zahl); // Die Variabel "zahl" wird in der Konsole ausgegeben.
		}
	}
}