/**
 * Exercise 1.11 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_01_11 {

	public static void main(String[] args) {
		// 312032486 is the initial population
		// 365 * 24 * 60 * 60 is the number of seconds in a year
		System.out.println( 312032486 + (
				  365 * 24 * 60 * 60 / 7 	// births
				- 365 * 24 * 60 * 60 / 13	// deaths
				+ 365 * 24 * 60 * 60 / 45	// immigrants
				) * 1);						// year count
		System.out.println( 312032486 + (
				+ 365 * 24 * 60 * 60 / 7 	// births
				- 365 * 24 * 60 * 60 / 13	// deaths
				+ 365 * 24 * 60 * 60 / 45	// immigrants
				) * 2);						// year count
		System.out.println( 312032486 + (
				+ 365 * 24 * 60 * 60 / 7 	// births
				- 365 * 24 * 60 * 60 / 13	// deaths
				+ 365 * 24 * 60 * 60 / 45	// immigrants
				) * 3);						// year count
		System.out.println( 312032486 + (
				+ 365 * 24 * 60 * 60 / 7 	// births
				- 365 * 24 * 60 * 60 / 13	// deaths
				+ 365 * 24 * 60 * 60 / 45	// immigrants
				) * 4);						// year count
		System.out.println( 312032486 + (
				+ 365 * 24 * 60 * 60 / 7 	// births
				- 365 * 24 * 60 * 60 / 13	// deaths
				+ 365 * 24 * 60 * 60 / 45	// immigrants
				) * 5);						// year count
	}

}
