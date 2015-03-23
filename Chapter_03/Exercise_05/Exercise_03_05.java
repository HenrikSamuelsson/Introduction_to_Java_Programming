import java.util.Scanner;

/**
 * Exercise 3.5 from the book Introduction to Java Programming (10th).
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_03_05 {

	public static void main(String[] args) {
		final int DAYS_IN_A_WEEK = 7;
		
		// create a Scanner
		Scanner input = new Scanner(System.in);
		
		// query the user for the start day
		System.out.print("Enter today's day: ");
		int startDayNumber = input.nextInt();
		
		// translate day number to the actual name of the day
		String startDayName;
		
		switch (startDayNumber) {
		case 0:
			startDayName = "Sunday";
			break;
		case 1:
			startDayName = "Monday";
			break;
		case 2:
			startDayName = "Tuesday";
			break;
		case 3:
			startDayName = "Wednesay";
			break;
		case 4:
			startDayName = "Thursday";
			break;
		case 5:
			startDayName = "Friday";
			break;
		case 6:
			startDayName = "Saturday";
			break;
		default:
			startDayName = "ERROR";
		}
		
		// query the user for the number of elapsed days since the start day
		System.out.print("Enter the number of days elapsed since today: ");
		int daysPassed = input.nextInt();
		
		// calculate the number of the future day
		int endDayNumber = (startDayNumber + daysPassed) % DAYS_IN_A_WEEK;
		
		// translate day number to the actual name of the day
		String endDayName;
		
		switch (endDayNumber) {
		case 0:
			endDayName = "Sunday";
			break;
		case 1:
			endDayName = "Monday";
			break;
		case 2:
			endDayName = "Tuesday";
			break;
		case 3:
			endDayName = "Wednesday";
			break;
		case 4:
			endDayName = "Thursday";
			break;
		case 5:
			endDayName = "Friday";
			break;
		case 6:
			endDayName = "Saturday";
			break;
		default:
			endDayName = "ERROR";

		}
		
		// display results
		System.out.println("Today is " + startDayName + " and the future day "
				+ "is " + endDayName);
	}

}
