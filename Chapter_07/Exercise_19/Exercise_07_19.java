import java.util.Scanner;

/**
 * Exercise 7.19 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_07_19 {

	public static void main(String[] args) {
		// create a scanner to be used for getting input
		Scanner input = new Scanner(System.in);

		// get number of elements in the list from the user
		System.out.print("Enter list: ");
		int listSize = input.nextInt();

		// create an array for storing list numbers
		int[] list = new int[listSize];

		// get numbers from the user and put them in the list
		for (int i = 0; i < listSize; i++) {
			list[i] = input.nextInt();
		}

		if (isSorted(list)) {
			System.out.println("The list is sorted");
		} else {
			System.out.println("The list is not sorted");
		}
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if( list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
