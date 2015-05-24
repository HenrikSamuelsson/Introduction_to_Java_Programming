/**
 * Exercise 5.3 from the book Introduction to Java Programming (10th).
 * <p>
 * Conversion from kilograms to pounds.
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_05_03 {

	public static void main(String[] args) {
		
		// print the heading of the table
		String kilograms = "Kilograms";
		String pounds = "Pounds";
		System.out.printf("%-10s %10s %n", kilograms, pounds);
		
		// print the data in the table by the use of a loop
		// will left-justify the kilograms and right-justify the pounds
		for (int i = 1; i < 200; i = i + 2) {
			System.out.printf("%-10.0f %10.1f %n", (double) i, i * 2.2);
		}
	}

}
