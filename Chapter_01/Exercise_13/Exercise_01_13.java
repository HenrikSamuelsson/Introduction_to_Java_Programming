/**
 * Exercise 1.13 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_01_13 {

	public static void main(String[] args) {
		// a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9 
		
		// calculate and print x
		System.out.println( ( 44.5 * 0.55 - 50.2 * 5.9 ) 
				/ ( 3.4 * 0.55 - 50.2 * 2.1 ) );
		
		// calculate and print y
		System.out.println( ( 3.4 * 5.9 - 44.5 * 2.1 ) 
				/ ( 3.4 * 0.55 - 50.2 * 2.1 ) );
	}

}
