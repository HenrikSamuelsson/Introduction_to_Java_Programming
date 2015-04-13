import java.util.Scanner;

/**
 * Exercise 6.4 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_06_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer to be reversed: ");
		int in = input.nextInt();
		reverse(in);
	}

	public static void reverse(int number) {
		int reversedNumber = 0;
		do {
			reversedNumber = reversedNumber * 10 + number % 10;
			number = number / 10;
		} while (number != 0);
		System.out.println(reversedNumber);
	}

}
