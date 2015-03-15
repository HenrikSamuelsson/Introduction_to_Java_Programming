import java.util.Scanner;

/**
 * Exercise 2.8 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_08 {

	public static void main(String[] args) {
		// obtain  the time zone offset from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter the time zone offset to GMT: ");
		long offset = input.nextLong();
		
		// obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
	
		// obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		// obtain the total hours
		long totalHours = totalMinutes / 60;
		
		// compute the current hour
		long currentHour = totalHours % 24;
		
		// adjust the current hour using the offset
		currentHour += offset;
	
		// display results
		System.out.println("Current time is " + currentHour + ":"
		+ currentMinute + ":" + currentSecond);
	}

}
