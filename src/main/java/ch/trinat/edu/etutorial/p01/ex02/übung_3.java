package ch.trinat.edu.etutorial.p01.ex02;
import java.util.Scanner;
public class übung_3 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		int geldbetrag, hunderter , fünfziger , zwanziger , zehner  , z ;
		int a , b , c , d , e , f , g , h ;
		
		System.out.println(" Wie viel Geld wollen Sie abheben ? ");
		
		geldbetrag = eingabe.nextInt();
		z = geldbetrag; 
		
		a = z/100; 
		b = z%100; // gibt uns den Rest einer Division von z und 100 
		
		c = b/50;
		d = b%50; 
		
		e = d/20;
		f = d%20;
		
		g = f/10;
		h = f%10;
		
		
		System.out.println(" Eingegebener Geldbetrag : " + geldbetrag );
		System.out.println(" 100er : " + a );
		System.out.println(" 50er : " + c );
		System.out.println(" 20er : " + e );
		System.out.println(" 10er : " + g );
		System.out.println(" Rest : " + h );
		
		
		
		
	
		
		
		
		
	}

}
