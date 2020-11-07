package ch.trinat.edu.etutorial.p02.ex02.kurort;

public class Hotel {
	private String bezeichnung;
	private int stockwerke, zimmerProStockwerk, belegung;
	
	public Hotel(String bezeichnung, int stockwerke, int zimmerProStockwerk, int belegung){
	    this.bezeichnung = bezeichnung;
		this.stockwerke = stockwerke;
	    this.zimmerProStockwerk = zimmerProStockwerk;
	    this.belegung = belegung;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getStockwerke() {
		return stockwerke;
	}

	public void setStockwerke(int stockwerke) {
		this.stockwerke = stockwerke;
	}

	public int getZimmerProStockwerk() {
		return zimmerProStockwerk;
	}

	public void setZimmerProStockwerk(int zimmerProStockwerk) {
		this.zimmerProStockwerk = zimmerProStockwerk;
	}

	public int getBelegung() {
		return belegung;
	}

	public void setBelegung(int belegung) {
		this.belegung = belegung;
	}

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
	
	public String toString() {
		return "Hotel"+ bezeichnung + ": " + belegung + " von " + getZimmer() + " Zimmer belegt."+ "Insgesamt sind noch " + getFreieZimmer() +" Zimmer frei.";
	}
	
	public boolean equals(Hotel h) {
	    if (h != null && h.getZimmer() == this.getZimmer()) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
