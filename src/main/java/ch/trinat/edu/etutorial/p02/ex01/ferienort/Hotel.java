package ch.trinat.edu.etutorial.p02.ex01.ferienort;

public class Hotel {
	String bezeichnung;
	int stockwerke, zimmerProStockwerk, belegung;

	public int getFreieZimmer() {
		int freieZimmer;
		freieZimmer=stockwerke*zimmerProStockwerk-belegung;
		return freieZimmer;
	}

	public int getZimmer() {
		int zimmer;
		zimmer=stockwerke*zimmerProStockwerk;
		return zimmer;
	}

	public void einchecken() {
		int zimmer=getZimmer();
		if (belegung<zimmer) {
			belegung++;
		}
		else {
			System.out.println("Es gibt keine freie Zimmer mehr!");
		}
	}

	public void auschecken() {
		if (belegung>0) {
			belegung--;
		}
		else {
			System.out.println("Niemand befindet sich im Hotel!");
		}
	}

	public void printInfo () {
		int zimmer=getZimmer();
		int freieZimmer=getFreieZimmer();
		System.out.println("*****************************");
		System.out.println("Hotel "+bezeichnung);
		System.out.println(belegung+" von "+zimmer+" belegt.");
		System.out.println(freieZimmer+" Zimmer sind noch frei.");
		System.out.println("*****************************");
	}
}