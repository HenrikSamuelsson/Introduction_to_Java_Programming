import java.util.Scanner;

/**
 * Exercise 4.1 from the book Introduction to Java Programming (10th).
 * <p>
 * Geometry: area of a pentagon.
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_04_01 {

	public static void main(String[] args) {
		// get data about the pentagon from the user
		System.out.print("Enter the length from the center to a vertex: ");
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		
		// calculate the area of the pentagon
		double s = 2 * r * Math.sin(Math.PI / 5);
		double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

		// format and present the result
		System.out.printf("The area of the pentagon is %.2f", area);
	}
	
}
