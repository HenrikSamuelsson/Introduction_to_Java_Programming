import java.util.Scanner;

/**
 * Exercise 3.6 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_03_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		// prompt the user to enter height in feet
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();
		
		// prompt the user to enter height in inches
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237; // constant
		final double METERS_PER_FOOT = 0.3048; // constant
		final double METERS_PER_INCH = 0.0254; // constant
		
		// compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = feet * METERS_PER_FOOT 
				+ inches * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		// display result
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}
