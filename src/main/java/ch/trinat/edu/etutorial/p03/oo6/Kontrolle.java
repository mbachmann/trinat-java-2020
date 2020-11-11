package ch.trinat.edu.etutorial.p03.oo6;

public class Kontrolle {

	public static void main(String[] args) {

		Backofen b = new Backofen("Ofen 1","Kuche")	;

		Mikrowelle m2 = new Mikrowelle ("Mikro 2","Wohnzimmer")	;
		Waschmachine w = new Waschmachine ("Waschmachine 1", "Waschkuche")	;

		Mikrowelle m1 = new Mikrowelle ("Mikro 1","Kuche")	;

		haushaltsgerat [] gerate = {b,m2,w,m1};

		w.start("lang",5);
		b.start(200, "Unter und ober hitze");
		m1.start(600, 1.5);


		for (int i=0;i<4;i++) {
			System.out.println(gerate[i].getName()+" : ");

			System.out.print(gerate[i].getTyp()+" , ");
			
			System.out.print(gerate[i].getStandort()+" , ");
			System.out.println(gerate[i].getStatus());
			System.out.println();
		}
	}

}
