//Mischa Kissling
//09/2020


package ch.trinat.edu.etutorial.p02.ex02;

public class Box {
	int height;
	int width;
	int depth;
	
	//GETTERS & SETTERS
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	// Default Konstruktur (Einheitsbox)
	public Box() {
		height = 1;
		width = 1;
		depth = 1;
	}
	
	public Box(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public Box clone() {
		Box clone = new Box();
		return clone;
	}
	
	public boolean equals(Box b) {
		if (b!=null && b.width==this.width && b.height==this.height && b.depth==this.depth) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getVolume() {
		return this.height*this.width*this.depth;
	}
	
	public int getSurface() {
		return (this.width*this.depth*2)+(this.height*this.depth*2)+(this.width*this.height*2);
	}
	
}