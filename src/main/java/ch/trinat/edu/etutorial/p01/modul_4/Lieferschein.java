package ch.trinat.edu.etutorial.p01.modul_4;

public class Lieferschein
{
	public static void main(String[] args)
	{
		System.out.println("Lieferschein");
		linie(12,'*');
		System.out.println("Artikel 1		          15.90");
		System.out.println("Artikel 2		          21.90");
		System.out.println("Artikel 3		          32.50");
		linie(40,'-');
		double total=summe(15.90, 21.90, 32.50);
		System.out.println("Preis total		          "+total);
		linie(40,'=');
	}

	public static void linie(int länge, char zeichen)
	{
		for (int i=0;i<länge;i++)
		{
			System.out.print(zeichen);
		}
		System.out.println();
	}
	public static double summe(double a, double  b, double  c)
	{
		return a+b+c;
	}
}



