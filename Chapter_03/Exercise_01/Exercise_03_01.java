import java.util.Scanner;

/**
 * Exercise 3.1 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_03_01 {

	public static void main(String[] args) {
		double a, b, c;
		double discriminant;
		double r1, r2;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		// calculate the discriminant
		discriminant = Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5);
		
		// calculate and display roots based on the value of the discriminant
		if (discriminant > 0) {
			r1 = (-b + discriminant) / (2 * a);
			r2 = (-b - discriminant) / (2 * a);
			System.out.println("The equation has two roots " + r1 + " and " 
					+ r2);
		} else if (discriminant == 0) {
			r1 = -b / (2 * a);
			System.out.println("The equation has one root " + r1);
		} else {
			System.out.println("The equation has no real roots");
		}	
	}

}
