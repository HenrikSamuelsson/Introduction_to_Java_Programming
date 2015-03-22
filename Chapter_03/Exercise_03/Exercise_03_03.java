import java.util.Scanner;

/**
 * Exercise 3.3 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_03_03 {

	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter a, b, c, d, e, f: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		// use Cramers rule to solve the system of linear equations
		if (a * d - b * c == 0) {
			System.out.println("The equation has no solution");
		} else {
			x = (e * d - b * f) / (a * d - b * c);
			y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);
		}	
	}

}
