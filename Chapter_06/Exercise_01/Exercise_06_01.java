/**
 * Exercise 6.1 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_06_01 {

	public static void main(String[] args) {
		for (int nr = 1; nr <= 100; nr++) {
			System.out.printf("%5d ", getPentagonalNumber(nr));
			if (nr % 10 == 0)
				System.out.println("");
		}
	}

	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}

}
