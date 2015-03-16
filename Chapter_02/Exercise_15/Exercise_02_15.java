import java.util.Scanner;

/**
 * Exercise 2.15 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_15 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, distance;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print ("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		// calculate the distance between the points
		distance = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
		
		// display the result of the calculation
		System.out.println("The distance between the two points is " 
				+ distance);
	}

}
