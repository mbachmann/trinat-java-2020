package ch.trinat.example.junit.mockito;

public class ChangeRateFromTxt implements ChangeRate {

	/**
	 * �ffnet Textfile mit Wechselkursen
	 * @param file the file name
	 */
	public void openTxtFile(String file)
	{}

	@Override
	public double getRate_EUROtoSFR() {
		// TODO get Rate from txtfile
		return 0; //avoid Error
	}

	@Override
	public double getRate_EUROtoEURO() {
		// TODO get Rate from txtfile
		return 0; //avoid Error
	}

	@Override
	public double getRate_EUROtoDOLLAR() {
		// TODO get Rate from txtfile
		return 0; //avoid Error
	}

	@Override
	public double getRate_EUROtoPOUND() {
		// TODO get Rate from txtfile
		return 0; //avoid Error
	}

}
