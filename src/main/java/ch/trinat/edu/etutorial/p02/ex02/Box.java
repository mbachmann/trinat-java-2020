package ch.trinat.edu.etutorial.p02.ex02;

public class Box {

	private int length, width, height;

	// default Konstruktor
	public Box() {
		this.length = 1;
		this.width = 1;
		this.height = 1;
	}

	// Param Kontruktor
	public Box(int length, int w, int h) {
		this.length = length;
		this.width = w;
		this.height = h;
	}

	// Kopie Konstruktor
	public Box(Box b) {
		this.length = b.length;
		this.width = b.width;
		this.height = b.height;
	}

	// equals Methode
	public boolean equals(Box b) {
		if ((b != null) && (b.length == this.length) && (b.width == this.width) && (b.height == this.height)) {
			return true;
		} else
			return false;
	}

	public int getVolume() {
		int volume = this.length * this.width * this.height;
		return volume;
	}

	public int getSurface() {
		int surface = 2 * this.length * this.width + 2 * this.width * this.height + 2 * this.length * this.height;
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
