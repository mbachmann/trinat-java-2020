package ch.trinat.edu.etutorial.p01.ex02.swap;
import java.util.Scanner;

public class Swap 
{
	public static void main(String[] args) 
	{
		String a, b, a_hilf;
		try (Scanner eingabe = new Scanner(System.in)) 
		{
			System.out.println("Geben Sie einen Namen ein");
			a = eingabe.next(); // Die Erste Eingabe wird in der Variabel "a" abgespeichert.
			System.out.println("Geben Sie einen Namen ein");
			b = eingabe.next(); // Die Zweite Eingabe wird in der Variabel "b" abgespeichert.
		}
		
		System.out.println(a + " und " +b);
		// Zuerst werden die Variabeln "a" und "b" in der Konsole ausgegeben.
		
		a_hilf = a;  // "a_hilf" nimmt den Wert von "a" an.
		a = b; // "a" nimmt den Wert von "b" an.
		b = a_hilf; // "b" nimmt den Wert von "a_hilf" an.
		// Die Variabeln "a" und "b" haben somit ihre Werte vertauscht.
		
		System.out.println(a + " und " +b);
		// Zuletzt werden diese in der Konsole ausgegeben.
	}
}
