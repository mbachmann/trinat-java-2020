package ch.trinat.edu.etutorial.p02.ex02;

public class Firma {

	public static void main(String[] args) {
		
		Mitarbeiter[] mitarbeiter = new Mitarbeiter[100];
		
		int bürofläche = 0; 
		int jahresgehalt = 0;
		
		for ( int i = 0 ; i < 100 ; i++ ) {
			mitarbeiter[i] = new Mitarbeiter() ; 
		}
		
		for ( int j = 0 ; j < 10 ; j++ ) {
			
			mitarbeiter[j].Position1();
			bürofläche = bürofläche + mitarbeiter[j].getSpace1();
			jahresgehalt = jahresgehalt + mitarbeiter[j].jahresgehalt1();
			
		}
		
		for ( int k = 10 ; k < 40 ; k++ ) {
			
			mitarbeiter[k].Position2();
			bürofläche = bürofläche + mitarbeiter[k].getSpace2();
			jahresgehalt = jahresgehalt + mitarbeiter[k].jahresgehalt2();
			
		}
		
		for ( int l = 40 ; l < 100 ; l++ ) {
			
			mitarbeiter[l].position3();
			bürofläche = bürofläche + mitarbeiter[l].getSpace3();
			jahresgehalt = jahresgehalt + mitarbeiter[l].jahresgehalt3();
			
		}
			
	System.out.println( " Bürofläche : " + bürofläche + " m2 " );
	System.out.println( " Jahresgehalt : " + jahresgehalt );

}

}