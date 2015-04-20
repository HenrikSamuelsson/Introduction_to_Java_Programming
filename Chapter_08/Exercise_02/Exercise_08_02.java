import java.util.Scanner;

/**
 * Exercise 8.2 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_08_02 {

	public static void main(String[] args) {
		final int ROWS = 4;
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

		// calculate and print the sum of the elements in the major diagonal
		System.out.println("Sum of the elemnts in the major diagonal is "
				+ sumMajorDiagonal(testArray));

	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int index = 0; index < m.length; index++) {
			sum += m[index][index];
		}
		return sum;
	}

}
