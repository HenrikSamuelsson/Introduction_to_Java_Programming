import java.util.Scanner;

/**
 * Exercise 2.14 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_14 {

	public static void main(String[] args) {
		double height;
		double weight;
		double bmi;
		
		// get weight and height from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		height = input.nextDouble();
		
		// convert weight to kilograms
		weight = weight * 0.45359237;
		// convert height to meters
		height = height * 0.0254;
		// calculate BMI
		bmi = weight / (height * height);
		
		// display the calculated BMI to the user
		System.out.print("BMI is " + bmi);
	}

}
