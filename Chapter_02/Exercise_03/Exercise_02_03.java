import java.util.Scanner;

/**
 * Exercise 2.3 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_03 {

	public static void main(String[] args) {
		double feet;
		double meters;
			
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		feet = input.nextDouble();
		
		// convert feet into meters
		meters = feet * 0.305;
		
		// present the result
		System.out.println(feet + " feet is " + meters + " meters.");
	}

}
