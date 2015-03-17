import java.util.Scanner;

/**
 * Exercise 2.18 from the book Introduction to Java Programming (10th).
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_18 {

	public static void main(String[] args) {
		int a, b, p;
		a = 1;
		b = 2;
		
		System.out.println("a\tb\tpow(a, b)");
		
		p = (int) Math.pow(a, b);
		System.out.println(a + "\t" + b + "\t" + p);
		a++;
		b++;
		
		p = (int) Math.pow(a, b);
		System.out.println(a + "\t" + b + "\t" + p);
		a++;
		b++;
		
		p = (int) Math.pow(a, b);
		System.out.println(a + "\t" + b + "\t" + p);
		a++;
		b++;
		
		p = (int) Math.pow(a, b);
		System.out.println(a + "\t" + b + "\t" + p);
		a++;
		b++;
		
		p = (int) Math.pow(a, b);
		System.out.println(a + "\t" + b + "\t" + p);
		a++;
		b++;
	}

}

