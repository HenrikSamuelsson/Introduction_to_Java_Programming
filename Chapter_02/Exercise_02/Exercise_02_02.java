import java.util.Scanner;

/**
 * Exercise 2.2 from the book Introduction to Java Programming (10th).
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_02 {

	public static void main(String[] args) {
		double radius;
		double length;
		double area;
		double volume;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		radius = input.nextDouble();
		length = input.nextDouble();
		
		// calculate area and volume
		area = radius * radius * Math.PI;
		volume = area * length;
		
		// present the results
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}

}
