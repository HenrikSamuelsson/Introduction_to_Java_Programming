import java.util.Date;

/**
 * Exercise 9.3 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_09_03 {

	public static void main(String[] args) {
		Date d = new Date();
		long time = 10_000;
		final long MAX_TIME = 10_000_0000_000L;
		while (time <= MAX_TIME) {
			d.setTime(time);
			System.out.println(d.toString());
			time *= 10;
		}
	}

}
