
/**
 * Exercise 9.1 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_09_01 {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Properties for r1:");
		System.out.println("width = " + r1.width);
		System.out.println("height = " + r1.height);
		System.out.println("area = " + r1.getArea());
		System.out.println("perimeter = " + r1.getPerimeter());
		
		System.out.println("");
		
		System.out.println("Properties for r2:");
		System.out.println("width = " + r2.width);
		System.out.println("height = " + r2.height);
		System.out.println("area = " + r2.getArea());
		System.out.println("perimeter = " + r2.getPerimeter());
	}
	
}

class Rectangle {
	double width;
	double height;
	
	/** Constructs a rectangle with height and width set to 1. */
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	/** Constructs a rectangle with specified width and height. */
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/** Return the area of this rectangle. */
	double getArea() {
		return width * height;
	}
	
	/** Return the perimeter of this rectangle. */
	double getPerimeter() {
		return width * 2 + height * 2;
	}
	
}
