package ch.trinat.edu.etutorial.p01.ex02;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		
		String a,b,e,f;
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Geben Sie das erste Wort ein: "); 
		a = eingabe.next();
		System.out.println("Geben Sie das zweite Wort ein: "); 
		b = eingabe.next();
		
		e=a;
		f=b;
		a=f;
		b=e;
	
		System.out.println("Eingabe: " + a + " und "+ b); 
		eingabe.close();
	}

}
