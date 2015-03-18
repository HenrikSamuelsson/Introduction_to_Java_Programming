import java.util.Scanner;

/**
 * Exercise 2.22 from the book Introduction to Java Programming (10th).
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_22 {

	public static void main(String[] args) {
		// create a Scanner
		Scanner input = new Scanner(System.in);
		
		// receive the amount
		System.out.print("Enter an amount in cents, for example to enter the "
				+ "amount $11.56 write 1156: ");
		int amount = input.nextInt();
		
		// find the number of one dollars
		int numberOfOneDollars = amount / 100;
		amount = amount % 100;
		
		// find the number of quarters in the remaining amount
		int numberOfQuarters = amount / 25;
		amount = amount % 25;
		
		// find the number of dimes in the remaining amount
		int numberOfDimes = amount / 10;
		amount = amount % 10;
		
		// find the number of nickels in the remaining amount
		int numberOfNickels = amount / 5;
		amount = amount % 5;
		
		// find the number of pennies in the remaining amount
		int numberOfPennies = amount;
		
		// display results
		System.out.println("Your amount in cents " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
	}

}
