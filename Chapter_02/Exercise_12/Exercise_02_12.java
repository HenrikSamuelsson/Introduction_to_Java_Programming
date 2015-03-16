
import java.util.Scanner;

/**
 * Exercise 2.12 from the book Introduction to Java Programming (10th).
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_12 {

	public static void main(String[] args) {
		double acceleration, velocity, runwayLength;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter speed and acceleration: ");
		velocity = input.nextDouble();
		acceleration = input.nextDouble();
		
		// calculate the runway length
		runwayLength = velocity * velocity / (2 * acceleration); 
		
		// display the result
		System.out.println("The minimum runway length for this airplane is  " 
				+ runwayLength);			
	}

}
