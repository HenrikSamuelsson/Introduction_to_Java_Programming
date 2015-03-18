import java.util.Scanner;

/**
 * Exercise 2.23 from the book Introduction to Java Programming (10th).
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_23 {

	public static void main(String[] args) {
		double drivingDistance, milesPerGallon, pricePerGallon, costOfDriving;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		drivingDistance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		pricePerGallon = input.nextDouble();
		
		// calculate the cost of driving
		costOfDriving = drivingDistance * pricePerGallon / milesPerGallon;
		
		// get rid of excess decimals before presenting the result
		costOfDriving =  ((int) (costOfDriving * 100)) / 100.0;
		
		// display the result
		System.out.println("The cost of driving is $" + costOfDriving);			
	}

}
