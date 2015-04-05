import java.util.Scanner;

/**
 * Exercise 5.2 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_05_02 {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 10; // number of questions
		int correctCount = 0; // count the number of correct answers
		int count = 0; // count the number of questions
		long startTime = System.currentTimeMillis();
		String output = ""; // output string is initially empty
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTIONS) {
			// generate two random single-digit integers between 1 and 15
			int number1 = (int) (Math.random() * 15) + 1;
			int number2 = (int) (Math.random() * 15) + 1;

			// prompt the student to answer “What is number1 + number2?”
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();

			// grade the answer and display the result
			if (number1 + number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			} else
				System.out.println("Your answer is wrong.\n" + number1 + " + "
						+ number2 + " should be " + (number1 + number2));

			// Increase the count
			count++;

			output += "\n" + number1 + "+" + number2 + "=" + answer
					+ ((number1 + number2 == answer) ? " correct" : " wrong");
		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Correct count is " + correctCount
				+ "\nTest time is " + testTime / 1000 + " seconds\n" + output);
	}
}
