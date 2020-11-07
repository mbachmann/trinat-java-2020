package ch.trinat.edu.etutorial.p02.ex01.fluggesselschaft;

public class Fluggesellschaft {
	public static void main(String[] args) {

		Flugzeug[] airline = new Flugzeug[5];
		for (int i= 0; i< 5; i++){
			airline[i]= new Flugzeug();
		}

		airline[0].bezeichnung="Airbus 320";
		airline[0].idNummer=1;
		airline[0].sitze=165;
		airline[0].geschwindigkeit=890;
		airline[0].reichweite=12600;

		airline[1].bezeichnung="Boeing 747";
		airline[1].idNummer=2;
		airline[1].sitze=436;
		airline[1].geschwindigkeit=907;
		airline[1].reichweite=13700;

		airline[2].bezeichnung="Avro RJ85";
		airline[2].idNummer=3;
		airline[2].sitze=93;
		airline[2].geschwindigkeit=760;
		airline[2].reichweite=2200;

		airline[3].bezeichnung="Airbus 380";
		airline[3].idNummer=4;
		airline[3].sitze=516;
		airline[3].geschwindigkeit=907;
		airline[3].reichweite=12000;

		airline[4].bezeichnung="Airbus 380 - Business";
		airline[4].idNummer=5;
		airline[4].sitze=409;
		airline[4].geschwindigkeit=airline[3].geschwindigkeit;
		airline[4].reichweite=airline[3].reichweite;


		for (int i= 0; i< 5; i++){
			airline[i].printInfo();
			double time= airline[i].getTime(6330.00);
			System.out.println("Dauer: "+ Math.round(time*10)/10.0+" h");
			int capacity= airline[i].getCapacity(365);
			System.out.println("Kapazität: "+ capacity+ " Passagiere/Jahr");
		}
	}
}
