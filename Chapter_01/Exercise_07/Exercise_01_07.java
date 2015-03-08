/**
 * Exercise 1.7 from the book Introduction to Java Programming (10th).
 * <p>
 * Approximate calculation of pi.
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_01_07 {

	public static void main(String[] args) {
		System.out.println( 4.0 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0  + 
				1.0 / 9.0 - 1.0 / 11.0 ) );
		System.out.println( 4.0 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0  + 
				1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0) );
	}

}
