import java.util.Scanner;

/**
 * Exercise 3.8 from the book Introduction to Java Programming (10th).
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_03_08 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter three integers: ");
	    int n1 = input.nextInt();
	    int n2 = input.nextInt();
	    int n3 = input.nextInt();
	    
	    if (n1 > n2) {
	    	int temp = n2;
	    	n2 = n1;
	    	n1 = temp;
	    }
	    
	    if (n2 > n3) {
	    	int temp = n3;
	    	n3 = n2;
	    	n2 = temp;
	    }
	    
	    if (n1 > n2) {
	    	int temp = n2;
	    	n2 = n1;
	    	n1 = temp;
	    }
	    
	    System.out.println("The sorted numbers are "+ n1 + " " + n2 + " " + n3);
	}
}
