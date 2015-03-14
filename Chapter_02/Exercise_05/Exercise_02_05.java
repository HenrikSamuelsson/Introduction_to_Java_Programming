import java.util.Scanner;

/**
 * Exercise 2.5 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_05 {

	public static void main(String[] args) {
		double subtotal;
		int subtotalInCents;
		int gratuityRate;
		int totalInCents;
		int gratuityInCents;
			
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter the subtotal and a gratuity rate: ");
		subtotal = input.nextDouble();
		gratuityRate = input.nextInt();
		
		// calculate gratuity and total in cents
		subtotalInCents = (int)(subtotal * 100);
		gratuityInCents = (int)(subtotal * gratuityRate);
		totalInCents = subtotalInCents + gratuityInCents;
		
		// present the result in dollars and cents
		System.out.println("The gratuity is $" + 
				gratuityInCents / 100 + "." + gratuityInCents % 100 + 
				" and total is $" + 
				totalInCents / 100 + "." + totalInCents % 100);
	}

}
