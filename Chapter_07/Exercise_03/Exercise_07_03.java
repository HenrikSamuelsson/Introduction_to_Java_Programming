import java.util.Scanner;

/**
 * Exercise 7.3 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_07_03 {
	final static int MAX = 100;

	public static void main(String[] args) {
		int[] inputStorage = new int[MAX];
		int userInput;
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter the integers between 1 and " + MAX + ": ");
		userInput = inputScanner.nextInt();
		while (userInput != 0) {
			inputStorage[userInput - 1]++;
			userInput = inputScanner.nextInt();
		}

		for (int i = 0; i < 100; i++) {
			if (inputStorage[i] == 1)
				System.out.println(i + 1 + " occurs 1 time");
			else if (inputStorage[i] > 1)
				System.out.println(i + 1 + " occurs " + inputStorage[i]
						+ " times");
		}
	}

}
