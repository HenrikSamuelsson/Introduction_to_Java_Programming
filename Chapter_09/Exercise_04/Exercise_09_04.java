import java.util.Random;

/**
 * Exercise 9.4 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_09_04 {

	public static void main(String[] args) {
		Random rand = new Random(1000);
		for(int i = 0; i < 50; i++)
			System.out.println(rand.nextInt(100));
	}

}
