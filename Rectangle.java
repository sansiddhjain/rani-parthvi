// package Lab1;

public class Rectangle {
	private int length;
	private int width;
	public Rectangle() {
		length = 1;
		width = 1;
	}
	public Rectangle(int len, int wid) {
		length = len;
		width = wid;
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
	public int getArea() {
		return length * width;
	}
	public boolean isSquare() {
		return length == width;
	}
	public void PrintArea() {
		for(int i = 0; i< 10; i++) {
			System.out.println(getArea());
		}
	}
}
