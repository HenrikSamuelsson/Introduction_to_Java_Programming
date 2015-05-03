/**
 * Exercise 9.6 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

import java.util.Random;

public class Exercise_09_06 {

	public static void main(String[] args) {
		final int DATA_AMOUNT = 100_000;
		int[] data = new int[DATA_AMOUNT];
		StopWatch stopWatch = new StopWatch();

		// generate some random data for our data array
		Random rand = new Random();
		for (int i = 0; i < DATA_AMOUNT; i++) {
			data[i] = rand.nextInt();
		}
		
		// sort the data and measure the time that the sorting takes
		stopWatch.start();
		java.util.Arrays.sort(data);
		stopWatch.stop();	
		
		// display the result
		System.out.println(stopWatch.getElapsedTime());
	}

}

class StopWatch {
	private long startTime;
	private long endTime;

	/** Constructs a stop watch with start time set to the current time. */
	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	/** Sets the start time. */
	void start() {
		startTime = System.currentTimeMillis();
	}

	/** Sets the end time. */
	void stop() {
		endTime = System.currentTimeMillis();
	}
	
	/** Calculates the elapsed time between start and stop. */
	long getElapsedTime() {
		return endTime - startTime;
	}
	
}