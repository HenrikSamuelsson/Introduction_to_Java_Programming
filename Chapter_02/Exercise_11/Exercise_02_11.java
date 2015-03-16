import java.util.Scanner;

/**
 * Exercise 2.11 from the book Introduction to Java Programming (10th).
 * <p>
 * @note Did not get the exact same answer as in the book. This is likely
 * because of some rounding error.
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_11 {

	public static void main(String[] args) {
		int years, population;
		double births, deaths, immigrants;
		final int START_POPULATION = 312032486;
		final double SECONDS_IN_YEAR = 31536000;
		final int BIRTH_FACTOR = 7;
		final int DEATH_FACTOR = 13;
		final int IMMIGRANT_FACTOR = 45;
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter the numbers of years: ");
		years = input.nextInt();
		
		// do some population calculations based on user input
		births = years * SECONDS_IN_YEAR / BIRTH_FACTOR;
		deaths = years * SECONDS_IN_YEAR / DEATH_FACTOR;
		immigrants = years * SECONDS_IN_YEAR / IMMIGRANT_FACTOR;
		population = (int) (START_POPULATION + births - deaths + immigrants);  
		
		// display the population
		System.out.println("The population in " + years + " years is " + 
				population);			
	}

}
