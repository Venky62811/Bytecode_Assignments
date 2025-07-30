package Constructor;
class AreaRectangle {
	private double length;
	private double width;
	
	public AreaRectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public void CalculateArea() {
		System.out.println("Area of rectangle "+ length * width);
	}
}


public class Rectangle {

	public static void main(String[] args) {
		AreaRectangle ar=new AreaRectangle(32.6,42);
		ar.CalculateArea();

	}

}
