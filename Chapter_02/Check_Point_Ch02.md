# Checkpoint Answers Chapter 2 #
**2.1**  
The problem with the original code, presented in the book, is that the string to be printed is split with an end-line. This is not allowed.  

The solution is to use string concatenation. Most development environments will actually insert this automatically for us these days.  

A fixed version of the code looks like this:  
```Java  
public class Test {

	public static void main(String[] args) {
		double i = 50.0;
		double k = i + 50.0;
		double j = k + 1;
		
		System.out.println("j is " + j + " and "
				+ "k is " + k);

	}

}  
``` 

**2.2**  
The Scanner class can be used for getting input from the user. An import of this class is required and the class can then be used in this way:  
```Java
Scanner input = new Scanner(System.in);
double number = input.nextDouble();
```  
The above code expects the user to enter a number. Should the user write something else like 5a so will this cause a so called Exception. This Exception must be handled in the code because the program will otherwise terminate in an uncontrolled manner.  

**2.3**  
There are no performance differences between the following two import statements.
```Java  
import java.util.Scanner;
import java.util.*;
```  

**2.4**  
The following are all valid names for identifiers:  
- miles  
- Test  
- $4  
- apps  
- x  
- y  
- radius  

The following are not valid names for identifiers because all contain characters not allowed to be used in identifiers.  
- a++   
- --a  
- #44  

This identifier name is disqualified in two ways because it starts with a number and uses a # which is not allowed.  
- 4#r 

The following are all keywords and can hence not be used as names for identifiers.  
- class  
- public  
- int  

**2.5**  
The problem with the original code, presented in the book, is that the identifier k is not declared or given a value before it is used.  

A working version of the code:  
```Java  
public class Test {

	public static void main(String[] args) {
		int k = 1;
		int i = k + 2;
		System.out.println(i);
	}

}
```  

**2.6**  
The problem with the original code, presented in the book, is the below line where the variables are declared in an invalid way.  
```Java  
int i = j = j = 2;
```  
A corrected valid code looks like this:
```Java  
int i, j, k;  
i = j = k = 2;
```  

**2.7**  
Using constants is benfical because:  
1. Can be used for replacing a long number with a short simple text in numeroues places in the code, which saves time when coding.  
2. Being able to use a descriptive name makes the code easier to read.  
3. Should the value of the constant need to be changed so will we only need to change the code at a single location.   

Here is an example of declaring a constant in Java:  
```Java  
final int SIZE = 20;
```  
**2.8**  
The following naming conventions are often used in Java code.

Variables and methods are written in lowercase. If a name is made up of several words so are the words pushed together and words following the first word will have the first letter capitalized. For example:  
```Java  
radius, getHeight, numberOfStudents
```  

Class names are written in the same way as variables and methods except that the first letter is capitalized.  

Constants are written all uppercase. An underscore is used to separate the words in constants that contain multiple words.

A constant:  
```Java  
MAX_VALUE
```  

A class:  
```Java
Test
```  

Variables or methods:
```Java  
read, readDouble
```  

**2.9**  
The following code is based on the algorithm that is described in the book.  
```Java  
public class Checkpoint_02_09 {
	
	public static void main(String[] args) {
		double miles = 100;									// step 1
		final double KILOMETERS_PER_MILE = 1.609;			// step 2
		double kilometers = miles * KILOMETERS_PER_MILE;	// step 3
		System.out.println(kilometers);						// step 4
	}

}
```  
The variable kilometers will have the value 160.9 after step 4.  

**2.10** 
The following program will print the max and min values of a number of data types.  
```Java  
public class CheckPoint_02_10 {
	
	public static void main(String[] args) {
		System.out.println("byte max: " + Byte.MAX_VALUE);   
		System.out.println("byte min: " + Byte.MIN_VALUE);
		
		System.out.println("short max: " + Short.MAX_VALUE);   
		System.out.println("short min: " + Short.MIN_VALUE);
		
		System.out.println("int max: " + Integer.MAX_VALUE);   
		System.out.println("int min: " + Integer.MIN_VALUE);
		
		System.out.println("long max: " + Long.MAX_VALUE);   
		System.out.println("long min: " + Long.MIN_VALUE);
		
		System.out.println("float max: " + Float.MAX_VALUE);   
		System.out.println("float min: " + Float.MIN_VALUE);
		
		System.out.println("double max: " + Double.MAX_VALUE);   
		System.out.println("double min: " + Double.MIN_VALUE);
	}

}

```  
Result when running the program:  
```  
byte max: 127  
byte min: -128  
short max: 32767  
short min: -32768  
int max: 2147483647  
int min: -2147483648  
long max: 9223372036854775807  
long min: -9223372036854775808  
float max: 3.4028235E38  
float min: 1.4E-45  
double max: 1.7976931348623157E308  
double min: 4.9E-324  
```  
The program will not answer the question of what type that takes the least amount of memory. But it can be concluded, by studying the numbers above, that it is byte that is cheapest to store, taking only 8 bits of memory.  

**2.11**  
Start by doing the math in your head or on paper and then run below program to verify.  
```Java
public class CheckPoint_02_11 {

	public static void main(String[] args) {
		System.out.println("56 % 6 = " + 56 % 6);   
		System.out.println("78 % -4 = " + 78 % -4);
		System.out.println("-34 % 5 = " + -34 % 5);
		System.out.println("-34 % -5 = " + -34 % -5);
		System.out.println("5 % 1 = " + 5 % 1);
		System.out.println("1 % 5 = " + 1 % 5);
	}

}  
```  
Result from the program:  
```  
56 % 6 = 2  
78 % -4 = 2  
-34 % 5 = -4  
-34 % -5 = -4  
5 % 1 = 0  
1 % 5 = 1  
```
  
**2.12**  
The weekday 100 days after a Tuesday can be calculated using the modulo operator.  

Tuesday is day 2 in the week, and there are 7 days in a week. We want the day after 100 days. The calculation of this will be:  
```  
(2 + 100) % 7 = 4
```  
The result is 4 indicating the fourth day in a week, meaning that the answer is Thursday.

**2.13**  
The result of integer division will always be an integer. Eventual fraction will be truncated away. This means that 25 / 4 becomes 6 instead of 6.25.  

A common way to achieve floating-point number division if the decimal part shall be preserved is to add a dummy decimal 0. The result of for example 25.0 / 4 will become 6.25.  


