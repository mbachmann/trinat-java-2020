package ch.trinat.pruefung.pr1.einMalEins;

public class EinMalEins {

	public static void main(String[] args) {

		int resultat;
		System.out.println("Wilkommen bei einXein!\n");
		
		for(int j=10;j>=1;j--) // 1. Multiplikator
		{
			for(int i=1;i<=10;i++) // 2. Multiplikator
			{
				resultat=i*j;
				System.out.printf("%4d",resultat);
			}
			System.out.println();
		}
	}
}
