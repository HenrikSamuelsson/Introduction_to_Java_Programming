import java.util.Scanner;

/**
 * Exercise 2.17 from the book Introduction to Java Programming (10th).
 * 
 * @note The degree character is displayed by inserting the unicode for this
 * 	     character which is 00B0.
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_17 {

	public static void main(String[] args) {
		double temperature, windSpeed, windChillIndex;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter the temperature in Fahrenheit between "
				+ "-58\u00B0F and 41\u00B0F: ");
		temperature = input.nextDouble();
		System.out.print ("Enter the wind speed (>=2) in miles per hour: ");
		windSpeed = input.nextDouble();
		
		// calculate the wind chill corrected temperature
		windChillIndex = 35.74 + 0.6215 * temperature 
				- 35.75 * Math.pow(windSpeed, 0.16) 
				+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);
		
		// display the result
		System.out.println("The wind chill index is " + windChillIndex);			
	}

}
