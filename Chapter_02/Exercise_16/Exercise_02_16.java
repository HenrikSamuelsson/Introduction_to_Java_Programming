import java.util.Scanner;

/**
 * Exercise 2.16 from the book Introduction to Java Programming (10th).
 * 
 * @note Got the answer 78.59180539343781 when testing with input 5.5. The
 *       answer according to the book should have been 78.5895. I do not know
 *       what caused this mismatch, seems to big to be a rounding error.
 *        
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_16 {

	public static void main(String[] args) {
		double side, area;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter the side: ");
		side = input.nextDouble();
		
		// calculate the area
		area = 3 * Math.pow(3.0, 0.5) / 2 * Math.pow(side, 2);
		
		// display the result of the calculation
		System.out.println("The area of the hexagon is  " + area);
	}

}
