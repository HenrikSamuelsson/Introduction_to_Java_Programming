import java.util.Scanner;

/**
 * Exercise 3.4 from the book Introduction to Java Programming (10th).
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_03_04 {

	public static void main(String[] args) {
		int monthNumber;
		String monthName;

		// generate a random number between 1 and 12
		monthNumber = 1 + (int) (Math.random() * 12);

		// look up the name of month
		switch (monthNumber) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "Mars";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "Error illegal month number";
		}

		// display the name of the generated month
		System.out.println(monthName);
	}

}
