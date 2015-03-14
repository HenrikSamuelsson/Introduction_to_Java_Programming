import java.util.Scanner;

/**
 * Exercise 2.7 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_07 {

	public static void main(String[] args) {
		int minutes;
		int days;
		int years;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter the number of minutes: ");
		minutes = input.nextInt();
		
		// the modulo operation will remove the years
		// the following division will convert from from minutes to days
		days = minutes % (60 * 24 * 365) / (60 * 24);
		
		// division that will truncate away the days and convert remainder
		// from minutes to years
		years = minutes / (60 * 24 * 365);
		
		// present the result
		System.out.println(minutes + " minutes is approximately " + years +
				" years and " + days + " days" );
	}

}
