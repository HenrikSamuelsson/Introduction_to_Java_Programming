import java.util.Scanner;

/**
 * Exercise 3.9 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_03_09 {

	public static void main(String[] args) {

		// create a scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn9 = input.nextInt();
	
		// split the big integer into 9 digits
		int d9 = isbn9 % 10;
		isbn9 = isbn9 / 10;
		int d8 = isbn9 % 10;
		isbn9 = isbn9 / 10;
		int d7 = isbn9 % 10;
		isbn9 = isbn9 / 10;
		int d6 = isbn9 % 10;
		isbn9 = isbn9 / 10;
		int d5 = isbn9 % 10;
		isbn9 = isbn9 / 10;
		int d4 = isbn9 % 10;
		isbn9 = isbn9 / 10;
		int d3 = isbn9 % 10;
		isbn9 = isbn9 / 10;
		int d2 = isbn9 % 10;
		isbn9 = isbn9 / 10;
		int d1 = isbn9 % 10;
		isbn9 = isbn9 / 10;

		// calculate the checksum
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7
				+ d8 * 8 + d9 * 9) % 11;

		// print all the numbers in the isbn 
		System.out.print("The ISBN-10 number is ");
		System.out.print(d1);
		System.out.print(d2);
		System.out.print(d3);
		System.out.print(d4);
		System.out.print(d5);
		System.out.print(d6);
		System.out.print(d7);
		System.out.print(d8);
		System.out.print(d9);
		if (d10 == 10)
			System.out.println("X");
		else	
			System.out.println(d10);
	}

}
