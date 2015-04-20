import java.util.Scanner;

/**
 * Exercise 8.1 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_08_01 {

	public static void main(String[] args) {
		final int ROWS = 3;
		final int COLUMNS = 4;
		double[][] testArray = new double[ROWS][COLUMNS];

		// get data for the array from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a " + ROWS + "-by-" + COLUMNS
				+ " matrix row by row:");
		for (int rowIndex = 0; rowIndex < ROWS; rowIndex++) {
			for (int columnIndex = 0; columnIndex < COLUMNS; columnIndex++) {
				testArray[rowIndex][columnIndex] = input.nextDouble();
			}
		}

		// calculate and print the sum for all the columns
		for (int columnIndex = 0; columnIndex < COLUMNS; columnIndex++) {
			System.out.println("Sum of the elemnts at column " + columnIndex
					+ " is " + sumColumn(testArray, columnIndex));
		}

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int rowIndex = 0; rowIndex < m.length; rowIndex++) {
			sum += m[rowIndex][columnIndex];
		}
		return sum;
	}

}
