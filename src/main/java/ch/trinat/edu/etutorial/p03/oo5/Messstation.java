package ch.trinat.edu.etutorial.p03.oo5;
//Mischa Kissling
//10/2020

public class Messstation {
	
	private String id;
	private String name;
	private String sourceTyp;
	private String environment;
	private int yearlyAverage;
	private int dailyMax;
	private int daysOver50;
	private int daysOver60;
	
	public Messstation(String id, String name, String sourceTyp, String environment, int yearlyAverage, int dailyMax,
			int daysOver50, int daysOver60) {
		super();
		this.id = id;
		this.name = name;
		this.sourceTyp = sourceTyp;
		this.environment = environment;
		this.yearlyAverage = yearlyAverage;
		this.dailyMax = dailyMax;
		this.daysOver50 = daysOver50;
		this.daysOver60 = daysOver60;
	}
	
	public void printInfo() {
		System.out.println("check");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSourceTyp() {
		return sourceTyp;
	}

	public void setSourceTyp(String sourceTyp) {
		this.sourceTyp = sourceTyp;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public int getYearlyAverage() {
		return yearlyAverage;
	}

	public void setYearlyAverage(int yearlyAverage) {
		this.yearlyAverage = yearlyAverage;
	}

	public int getDailyMax() {
		return dailyMax;
	}

	public void setDailyMax(int dailyMax) {
		this.dailyMax = dailyMax;
	}

	public int getDaysOver50() {
		return daysOver50;
	}

	public void setDaysOver50(int daysOver50) {
		this.daysOver50 = daysOver50;
	}

	public int getDaysOver60() {
		return daysOver60;
	}

	public void setDaysOver60(int daysOver60) {
		this.daysOver60 = daysOver60;
	}
	
}
