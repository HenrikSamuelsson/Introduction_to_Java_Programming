import java.util.Scanner;

/**
 * Exercise 2.9 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_09 {

	public static void main(String[] args) {
		double v0, v1, t, a;
	
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter v0, v1 and t: ");
		v0 = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();
		
		// calculate average acceleration
		a = (v1 - v0) / t;
		
		// present the result
		System.out.println("The average acceleration is " + a);
	}

}
