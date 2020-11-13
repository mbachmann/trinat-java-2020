package ch.trinat.edu.etutorial.p02.ex02;

public class BoxFactory {

	public static void main(String[] args) {
		
		
		 
		
		Box[] boxen = new Box[100] ;
		
		double volume = 0  ; 
		double surface = 0 ;  
		
		for ( int i = 0 ; i < 100 ; i++ ) {
			boxen[i] = new Box() ; 
		}
		
		
		for ( int j = 0 ; j < 10 ; j++ ) {
			System.out.print(j + " . : ");
			boxen[j].printStandadbox();
			
			
			volume = volume + boxen[j].getVolum();
			surface = surface + boxen[j].getSurface();
		}
		for ( int k = 10 ; k < 90 ; k++ ) {
			System.out.print(k + " . : ");
			boxen[k].printZufälligeBoxen();
			
			
			volume = volume + boxen[k].getVolum();
			surface = surface + boxen[k].getSurface();
			
		}
		
		
		for ( int l = 90 ; l<100 ; l++ ) {
			System.out.print(l + " . : ");
			boxen[l] = boxen[l-10].clone();			
            boxen[l].printclone();
			
			volume = volume + boxen[l].getVolum();
			surface = surface + boxen[l].getSurface();
		
		}
		
			System.out.println( " Das gesammte Volume ist von : " + volume );
			System.out.println( " Die gesammte Oberfläche ist von : " + surface );
		
		
		
	}

}
