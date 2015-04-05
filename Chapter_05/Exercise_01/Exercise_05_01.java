import java.util.Scanner;

/**
 * Exercise 5.1 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_05_01 {

	public static void main(String[] args) {
		int userInput; 
		int numberOfNegatives = 0;
		int numberOfPositives = 0;
		double total = 0; 
		double average = 0;
		
		// create a scanner
		Scanner input = new Scanner(System.in);
		
		// get input from user repeatedly
		System.out.print("Enter an integer, the input ends if it is 0: ");
		userInput = input.nextInt();
		while (userInput != 0) {
			if(userInput > 0)
				numberOfPositives++;
			else
				numberOfNegatives++;
			total += userInput;
			userInput = input.nextInt();
		}
		
		// have all user input now, calculate the average
		average = total / (numberOfNegatives + numberOfPositives);
		
		// present the result
		System.out.println("The number of positives is " + numberOfPositives);
		System.out.println("The number of negatives is " + numberOfNegatives);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}

}
