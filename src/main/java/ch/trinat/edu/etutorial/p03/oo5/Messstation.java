package ch.trinat.edu.etutorial.p03.oo5;

public class Messstation {
	private String id, name, source, surrounding;
	private int id_nr,  yearly_mid, daily_max, threshold50, threshold60;


	public Messstation(String id, String name, String source, String surrounding,
			int yearly_mid, int daily_max, int threshold50, int threshold60) {

		this.id = id;
		this.name = name;
		this.source = source;
		this.surrounding = surrounding;
		this.yearly_mid = yearly_mid;
		this.daily_max = daily_max;
		this.threshold50 = threshold50;
		this.threshold60 = threshold60;
	}


	public void print() {
		
			System.out.println(id + " " + name + " " + source + " " + surrounding
					+ " " + yearly_mid + " " + daily_max + " " + threshold50 + " " + threshold60);

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


		public String getSource() {
			return source;
		}


		public void setSource(String source) {
			this.source = source;
		}


		public String getSurrounding() {
			return surrounding;
		}


		public void setSurrounding(String surrounding) {
			this.surrounding = surrounding;
		}


		public int getId_nr() {
			return id_nr;
		}


		public void setId_nr(int id_nr) {
			this.id_nr = id_nr;
		}


		public int getYearly_mid() {
			return yearly_mid;
		}


		public void setYearly_mid(int yearly_mid) {
			this.yearly_mid = yearly_mid;
		}


		public int getDaily_max() {
			return daily_max;
		}


		public void setDaily_max(int daily_max) {
			this.daily_max = daily_max;
		}


		public int getThreshold50() {
			return threshold50;
		}


		public void setThreshold50(int threshold50) {
			this.threshold50 = threshold50;
		}


		public int getThreshold60() {
			return threshold60;
		}


		public void setThreshold60(int threshold60) {
			this.threshold60 = threshold60;
		}


	}
