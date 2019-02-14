package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		width = width*rate;
		height = height*rate;
	}

	@Override
	public double getArea() {
		double result = width*height;
		return result;
	}

	@Override
	public double getPerimeter() {
		double result = width*2+height*2;
		return result;
	}
}