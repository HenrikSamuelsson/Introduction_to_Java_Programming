import java.util.Scanner;

/**
 * Exercise 2.20 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_20 {

	public static void main(String[] args) {
		double balance, interestRate, interest;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter balance and interest rate (e.g., 3 for 3%): ");
		balance = input.nextDouble();
		interestRate = input.nextDouble();
		
		// calculate the interest
		interest = balance * (interestRate / 1200);
		
		// display the result of the calculation
		System.out.println("The interest is " + interest);
	}

}
