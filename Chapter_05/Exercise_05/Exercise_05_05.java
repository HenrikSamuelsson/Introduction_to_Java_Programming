/**
 * Exercise 5.5 from the book Introduction to Java Programming (10th).
 * <p>
 * Conversion from kilograms to pounds and pounds to kilograms.
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_05_05 {

	public static void main(String[] args) {
		// print the heading of the table
		String kg = "Kilograms";
		String p = "Pounds";
		System.out.printf("%-10s %-6s    |     %-10s %-10s %n", kg, p, p, kg);

		// print the data in the table by the use of a loop
		for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
			System.out.printf("%-10.0f %6.1f    |     %-10.0f %9.2f %n",
					(double) i, i * 2.2, (double) j, j / 2.2);
		}
	}
}
