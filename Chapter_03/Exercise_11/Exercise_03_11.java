import java.util.Scanner;

/**
 * Exercise 3.11 from the book Introduction to Java Programming (10th).
 * <p>
 * Find the number of days in a month.
 * <p>
 * Could use the Calendar class to solve this exercise with just a few lines of
 * code but we are still early in the book so will use a more basic naive
 * approach.
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_03_11 {

	public static void main(String[] args) {
		int month;
		int year;
		int daysInMonth;
		String monthName;

		// get the month and the year from the user.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number representing a month: ");
		month = input.nextInt();
		System.out.print("Enter number representing a year: ");
		year = input.nextInt();

		// process the input
		switch (month) {
		case 1:
			daysInMonth = 31;
			monthName = "January";
			break;
		case 2:
			// February so need to check for leap years
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				daysInMonth = 29;
			else
				daysInMonth = 28;
			monthName = "February";
			break;
		case 3:
			daysInMonth = 31;
			monthName = "March";
			break;
		case 4:
			daysInMonth = 30;
			monthName = "April";
			break;
		case 5:
			daysInMonth = 31;
			monthName = "May";
			break;
		case 6:
			daysInMonth = 30;
			monthName = "June";
			break;
		case 7:
			daysInMonth = 31;
			monthName = "July";
			break;
		case 8:
			daysInMonth = 31;
			monthName = "August";
			break;
		case 9:
			daysInMonth = 30;
			monthName = "September";
			break;
		case 10:
			daysInMonth = 31;
			monthName = "October";
			break;
		case 11:
			daysInMonth = 30;
			monthName = "November";
			break;
		case 12:
			daysInMonth = 31;
			monthName = "December";
			break;
		default:
			System.out.println("The month number is invalid!");
			return; // exit program
		}

		// display results
		System.out.println(monthName + " " + year + " had " + daysInMonth
				+ " days.");
	}
	
}
