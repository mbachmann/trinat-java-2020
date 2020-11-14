package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Geldautomat {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		int Geld, Geld_Anfang;
		int a, b, c, d;
		int Rest;
		
		System.out.print("Wie viel möchten Sie abheben?");
		Geld = eingabe.nextInt();
		
		Geld_Anfang = Geld;
		
		if(Geld>=100){
            a=Geld/100;
            Geld=Geld-(a*100);
        }
        else a=0;
        if(Geld>=50){
            b=Geld/50;
            Geld=Geld-(b*50);
        }
        else b=0;
        if(Geld>=20){
            c=Geld/20;
            Geld=Geld-(c*20);
        }
        else c=0;
        if(Geld>=10){
            d=Geld/10;
            Geld=Geld-(d*10);
        }
        else d=0;
		Rest = Geld;
        
        System.out.println("Eingegebener Geldbetrag: " + Geld_Anfang + " Fr.");
        System.out.println("100er " + a);
        System.out.println("50er  " + b);
        System.out.println("20er  " + c);
        System.out.println("10er  " + d);
        System.out.println("Rest: " + Rest);
	}

}