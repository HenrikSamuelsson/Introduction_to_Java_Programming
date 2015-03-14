import java.util.Scanner;

/**
 * Exercise 2.4 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_04 {

	public static void main(String[] args) {
		double pounds;
		double kilograms;
			
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter a number in pounds: ");
		pounds = input.nextDouble();
		
		// convert pounds into kilograms
		kilograms = pounds * 0.454;
		
		// present the result
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}

}
