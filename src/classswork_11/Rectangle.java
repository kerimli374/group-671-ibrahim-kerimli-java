package classswork_11;

public class Rectangle {
	double height;
	double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	double area = width * height;
	
	public void getArea() {
		System.out.println(area);
	}
	
	double perimeter = width + height * 2;
	
	public void getPerimeter() {
		System.out.println(perimeter);
	}
	
	public void printInfo() {
		System.out.println(width);
		System.out.println(height);
		System.out.println(area);
		System.out.println(perimeter);
	}
}
