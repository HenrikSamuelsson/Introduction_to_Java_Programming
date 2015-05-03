import java.util.GregorianCalendar;

/**
 * Exercise 9.5 from the book Introduction to Java Programming (10th).
 * <p>
 * Note that the month count is for some reason starting at 0 as opposed
 * to the year and day of month. This means that the month will be seem to be 
 * off by one in the output.
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_09_05 {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		
		// display the current year, month and day
		System.out.print(gc.get(GregorianCalendar.YEAR) + " " +
		gc.get(GregorianCalendar.MONTH) + " " +
		gc.get(GregorianCalendar.DAY_OF_MONTH) + "\n");

		// change the time and display year, month and day
		gc.setTimeInMillis(1234567898765L);
		System.out.print(gc.get(GregorianCalendar.YEAR) + " " +
		gc.get(GregorianCalendar.MONTH) + " " +
		gc.get(GregorianCalendar.DAY_OF_MONTH) + "\n");
	}

}
