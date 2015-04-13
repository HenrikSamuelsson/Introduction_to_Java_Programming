import java.util.Scanner;

/**
 * Exercise 6.2 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_06_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long in = input.nextLong();
		int sum = sumDigits(in);
		System.out.println("The sum of the digits in " + in + " is " + sum);
	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
