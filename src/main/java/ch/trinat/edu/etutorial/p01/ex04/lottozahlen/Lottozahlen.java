package ch.trinat.edu.etutorial.p01.ex04.lottozahlen;

public class Lottozahlen 
{
	public static void main(String[] args) 
	{
		// Array f�r 6 Lottozahlen
		int[] lottozahlen = new int[6];
		int max=0,min=50,maxPosition=1,minPosition=1,swap;

		// Ziehung der Lottozahlen
		for (int i = 0; i < lottozahlen.length; i++) 
		{
			lottozahlen[i] = (int) (Math.random() * 49) + 1;

			// doppelte Ziehung verhindern
			for (int j = 0; j < i; j++) 
			{
				if (lottozahlen[j] == lottozahlen[i]) 
				{
					i--;
				}
			}
		}
		// Ausgabe der Zahlen am Bildschirm		
		System.out.print("Lottozahlen: ");
		for (int i = 0; i < lottozahlen.length; i++) 
		{
			System.out.print(lottozahlen[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < lottozahlen.length; i++) 
		{
			if (max<lottozahlen[i])
			{
				max=lottozahlen[i];
				maxPosition=i+1;
			}
			if (min>lottozahlen[i])
			{
				min=lottozahlen[i];
				minPosition=i+1;
			}
		}
		System.out.println("Das maximum ist die "+maxPosition+ ". Zahl mit dem Wert "+max+".");		
		System.out.println("Das minimum ist die "+minPosition+ ". Zahl mit dem Wert "+min+".");	
		
		//Bubble-Sort:		
		System.out.println();
		System.out.println("Sortiert mittels Bubble-Sort: ");	
		for (int j=1; j < lottozahlen.length; j++)
		{
			for (int i = 0; i < lottozahlen.length-j; i++) 
			{
				if (lottozahlen[i]>lottozahlen[i+1])
				{
					swap=lottozahlen[i];
					lottozahlen[i]=lottozahlen[i+1];
					lottozahlen[i+1]=swap;
				}
			}
		}
		
		// Ausgabe der Zahlen am Bildschirm		
		System.out.print("Lottozahlen: ");
		for (int i = 0; i < lottozahlen.length; i++) 
		{
			System.out.print(lottozahlen[i]+" ");
		}
		System.out.println();
	}
}
