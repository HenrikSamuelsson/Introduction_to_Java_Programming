import java.util.Scanner;

/**
 * Exercise 3.10 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_10_10 {

	public static void main(String[] args) {
		// generate two random integers both less than 100
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		// prompt the student to answer “what is number1 + number2?”
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		// grade the answer and display the result
		if (number1 + number2 == answer)
			System.out.println("You are correct!");
		else
			System.out.println("Your answer is wrong.\n" + number1 + " + "
					+ number2 + " should be " + (number1 + number2));
	}
}
