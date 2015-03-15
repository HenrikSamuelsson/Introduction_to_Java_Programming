import java.util.Scanner;

/**
 * Exercise 2.10 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_10 {

	public static void main(String[] args) {
		// amount of water
		double m;
		// initial and final temperature of the water
		double t0, t1;
		// energy needed to warm 1 kg water 1 degree  
		final int F = 4184;
		// total energy needed to warm the water
		double q;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter the amount of water in kilograms: ");
		m = input.nextDouble();
		System.out.print ("Enter the initial temperature: ");
		t0 = input.nextDouble();
		System.out.print ("Enter the final temperature: ");
		t1 = input.nextDouble();
		
		// calculate the energy needed to warm the water
		q = m * (t1 - t0) * F;
		
		// present the result
		System.out.println("The energy needed is " + q);
	}

}
