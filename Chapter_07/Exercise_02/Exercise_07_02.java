import java.util.Scanner;

/**
 * Exercise 7.2 from the book Introduction to Java Programming (10th).
 * <p>
 * Reverse the numbers entered.
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */
public class Exercise_07_02 {

	public static void main(String[] args) {
		final int NUMBER_COUNT = 10;
		int[] numbers = new int[NUMBER_COUNT];
		
		Scanner input = new Scanner(System.in);
		
		// get the numbers from the user
		for (int i = 0; i < NUMBER_COUNT; i++) {
			numbers[i] = input.nextInt();
		}
		
		// print all the numbers in reverse
		for (int i = NUMBER_COUNT; i > 0; i--) {
			System.out.print(numbers[i - 1] + " ");
		}
	}

}
