import java.util.Scanner;

/**
 * Exercise 2.6 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_06 {

	public static void main(String[] args) {
		int number;
		int sum = 0;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter a number between 0 and 1000: ");
		number = input.nextInt();
		
		// extract and sum up the digits
		sum += number % 10;
		number = number / 10;
		sum += number % 10;
		number = number / 10;
		sum += number;
		
		// present the result
		System.out.println("The sum of the digits is " + sum);
	}

}
