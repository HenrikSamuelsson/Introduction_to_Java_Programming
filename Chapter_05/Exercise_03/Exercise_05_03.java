/**
 * Exercise 5.3 from the book Introduction to Java Programming (10th).
 * <p>
 * Conversion from kilograms to pounds.
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_05_03 {

	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds");
		for (int i = 1; i < 200; i = i + 2) {
			System.out.println(i + String.format("\t\t%.1f", i * 2.2));
		}
	}

}
