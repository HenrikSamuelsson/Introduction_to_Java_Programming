import java.util.Scanner;

/**
 * Exercise 4.2 from the book Introduction to Java Programming (10th).
 * <p>
 * Geometry: great circle distance.
 * <p>
 * Note that the solution is not exactly as in the book, the user will there 
 * input the coordinates separated by a comma. My solution assumes that that 
 * the data is separated by a blank space.
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_04_02 {

	public static void main(String[] args) {
		double lat1, lon1, lat2, lon2; // coordinates for two points
		final double R = 6_371.01; // radius of the earth
		double d; // distance between the two points

		// get the coordinates for the two points from the user
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter point 1 (latitude and longitude) in degrees: ");
		lat1 = input.nextDouble();
		lon1 = input.nextDouble();
		System.out
				.println("Enter point 2 (latitude and longitude) in degrees: ");
		lat2 = input.nextDouble();
		lon2 = input.nextDouble();

		// the values are currently i degrees will need to convert them to
		// radians to be able to us them in the trigonometric math methods
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);

		// calculate the distance between the two point by the use of the
		// formula provided in the exercise description
		d = R
				* Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1)
						* Math.cos(lat2) * Math.cos(lon1 - lon2));

		// print the result of the calculations
		System.out
				.println("The distance between the two points is " + d + "km");
	}

}
