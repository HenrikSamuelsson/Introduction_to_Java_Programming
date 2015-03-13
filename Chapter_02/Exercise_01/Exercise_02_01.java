import java.util.Scanner;

/**
 * Exercise 2.1 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_01 {

	public static void main(String[] args) {
		double degreeCelcius;
		double degreeFahrenheit;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		degreeCelcius = input.nextDouble();
		degreeFahrenheit = (9.0 / 5) * degreeCelcius + 32;
		System.out.print(degreeCelcius + " Celcius is " + degreeFahrenheit
				+ " Fahrenheit");
	}

}
