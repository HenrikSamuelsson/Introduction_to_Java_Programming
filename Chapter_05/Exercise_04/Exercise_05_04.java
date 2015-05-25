/**
 * Exercise 5.4 from the book Introduction to Java Programming (10th).
 * <p>
 * Conversion from miles to kilometers.
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_05_04 {

	public static void main(String[] args) {
		// print the heading of the table
		String miles = "Miles";
		String km = "Kilometers";
		System.out.printf("%-10s %-10s %n", miles, km);

		// print the data in the table by the use of a loop
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-10.0f %-10.3f %n", (double) i, i * 1.609);
		}
	}

}
