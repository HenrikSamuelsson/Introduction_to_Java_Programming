import java.util.Scanner;

/**
 * Exercise 2.21 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_21 {

	public static void main(String[] args) {
		double futureValue, investment, interest, years;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter investment amount: ");
		investment = input.nextDouble();
		System.out.print ("Enter annual interest rate in percentage: ");
		interest = input.nextDouble();
		System.out.print ("Enter number of years: ");
		years = input.nextDouble();
		
		// calculate the future value of investment
		futureValue = investment * Math.pow(1 + interest / 1200, years * 12);
		
		// display the result of the calculation
		System.out.println("Accumulated value is $" + futureValue);
	}

}
