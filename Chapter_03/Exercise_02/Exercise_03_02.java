import java.util.Scanner;

/**
 * Exercise 3.2 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_03_02 {

	public static void main(String[] args) {
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 3 % 10);
		int number3 = (int) (System.currentTimeMillis() / 7 % 10);

		// create a scanner
		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + " + " + number2 + " + "
				+ number3 + "? ");

		int answer = input.nextInt();

		System.out.println(number1 + " + " + number2 + " + " + number3 + " = "
				+ answer + " is " + (number1 + number2 + number3 == answer));
	}

}
