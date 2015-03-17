import java.util.Scanner;

/**
 * Exercise 2.19 from the book Introduction to Java Programming (10th).
 * 
 * @note I did not understand the suggested formula, for calculating the area of
 *       a triangle, in the book. So I searched for a formula online and found 
 *       this site: 
 *       	http://www.mathopenref.com/coordtrianglearea.html
 *       There was another formula that I ended up using.
 *       
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_02_19 {

	public static void main(String[] args) {
		double x1, x2, x3, y1, y2, y3;
		double area;
		
		// query the user for data about the three points
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter three points for a triangle: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		// calculate the area of the triangle
		area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
		
		// display the result
		System.out.println("The area of the triangle is " + area);
	}

}
