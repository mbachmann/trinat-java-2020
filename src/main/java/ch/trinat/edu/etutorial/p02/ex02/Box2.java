package ch.trinat.edu.etutorial.p02.ex02;

public class Box2 { // static Volumen & Oberfläche Methoden

	private int length, width, height;

	// default Konstruktor
	public Box2() {
		this.length = 1;
		this.width = 1;
		this.height = 1;
	}

	// Param Kontruktor
	public Box2(int l, int w, int h) {
		this.length = l;
		this.width = w;
		this.height = h;
	}

	// Kopie Konstruktor
	public Box2(Box2 b) {
		this.length = b.length;
		this.width = b.width;
		this.height = b.height;
	}

	// equals Methode
	public boolean equals(Box2 b) {
		if ((b != null) && (b.length == this.length) && (b.width == this.width) && (b.height == this.height)) {
			return true;
		} else
			return false;
	}

	// static!
	public static int getVolume(int l, int w, int h) {
		int volume = l * w * h;
		return volume;
	}

	// static!
	public static int getSurface(int l, int w, int h) {
		int surface = 2 * l * w + 2 * w * h + 2 * l * h;
		return surface;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
