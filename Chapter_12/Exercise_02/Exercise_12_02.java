/**
 * Exercise 12.2 from the book Introduction to Java Programming (10th).
 * <p>
 * InputMismatchException
 * <p>
 * Sums two given integer. Will throws and catches an exception if the user does
 * not enter integers.
 */

import java.util.Scanner;

public class Exercise_12_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean done = false;
		int number1 = 0;
		int number2 = 0;

		System.out.print("Enter two integers: ");

		while (!done) {
			try {
				number1 = input.nextInt();
				number2 = input.nextInt();
				done = true;
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.print("Incorrect input and re-enter two integers: ");
				input.nextLine(); // Discard input
			}
		}

		System.out.println("Sum is " + (number1 + number2));
	}
}
