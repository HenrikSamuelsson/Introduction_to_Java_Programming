import java.util.Scanner;

/**
 * Exercise 2.13 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_13 {

	public static void main(String[] args) {
		double monthlyDeposit;
		double Savings = 0;
		
		// get monthly deposit from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		monthlyDeposit = input.nextDouble();
		
		// calculate amount after six months
		Savings = (monthlyDeposit + Savings) * (1 + 0.00417);
		Savings = (monthlyDeposit + Savings) * (1 + 0.00417);
		Savings = (monthlyDeposit + Savings) * (1 + 0.00417);
		Savings = (monthlyDeposit + Savings) * (1 + 0.00417);
		Savings = (monthlyDeposit + Savings) * (1 + 0.00417);
		Savings = (monthlyDeposit + Savings) * (1 + 0.00417);
		
		// get rid of excess decimals
		Savings =  ((int) (Savings * 100)) / 100.0;
		
		// present the result
		System.out.println("After the sixth month, the account value is $" +
				Savings);
	}

}
