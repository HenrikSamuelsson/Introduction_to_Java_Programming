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

A common way to achieve floating-point number division, that preserves the decimal part, is to add a dummy decimal 0. The result of for example 25.0 / 4 will become 6.25.  

**2.14**  
The following code  
```Java  
public class CheckPoint_02_14 {

	public static void main(String[] args) {
		System.out.println(2 * (5 / 2 + 5 / 2));
		System.out.println(2 * 5 / 2 + 2 * 5 / 2);
		System.out.println(2 * (5 / 2));
		System.out.println(2 * 5 / 2);
	}

}
```  
produces this output  
```  
8  
10  
4  
5  
```  

**2.15**  
The following code is valid   
```Java  
public class CheckPoint_02_15 {

	public static void main(String[] args) {
		System.out.println("25 / 4 is " + 25 / 4);
		System.out.println("25 / 4.0 is " + 25 / 4.0);
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
	}

}
```  
and produces this output  
```  
25 / 4 is 6
25 / 4.0 is 6.25
3 * 2 / 4 is 1
3.0 * 2 / 4 is 1.5
```  

**2.16**  
A statement to display 2<sup>3.5</sup> can be written like this  
```Java  
System.out.println(Math.pow(2, 3.5));
```  

**2.17**  
A statement that returns a floating point result of mr<sup>2</sup>, where m and r are integers, can be written  like this  
```Java  
System.out.println(1.0*m*Math.pow(r, 2));  
```  

**2.18**  
A float have 7 to 8 significant digits.  

A double have 15 to 17 significant digits.  

**2.19**  
All of the following values are correct literals.  
```
12.3, 12.3e+2, 23.4e-2, -334.4, 20.5, 39F, 40D  
```
All values are treated as double, except 39F that is considered to be float since it is marked with a F.  

**2.20**  
`52.534` can optionally be written as `5.2534e+1`, `0.52534e+2`, or `525.34e-1`. But it can not be written as `5.2334e+0` because this would mean `5.2534e`.  

**2.21**  
`5_2534e+1` is a valid double literal.  
`_2534` is not a valid literal because it begins with an underscore, it would however be a valid variable name.  
`5_2` is a valid int literal.  
`5_` is not a valid literal because it ends with an underscore.  

**2.22**  
Examples of arithmetic expressions written in Java.  
**a.**     
```Java  
4 / (3 * (r + 34)) - 9 * (a + b * c) + (3 + d * (2 + a)) / (a + b * d)
```  
**b.**  
```Java  
5.5 * Math.pow(r + 2.5, 2.5 + t)
```  
**2.23**  
The current time is obtained by calling 
```
System.currentTimeMillis()
```
that give the number of milliseconds passed since 01-01-1970, 00:00:00 GMT.  

It is then just some arithmetic calculations that is needed to transform this value to hours, minutes, and seconds. There is an detailed example program in the book that do these calculation, so there is no need to repeat them here.  

**2.24**  
The following program  
```Java  
public class CheckPoint_02_24 {
	
	public static void main(String[] args) {
		double a = 6.5;
		
		a += a + 1;
		System.out.println(a);
		
		a = 6;
		a /= 2;
		System.out.println(a);
	}

}
```
will output
```
14.0  
3.0    
```

**2.25**  
**a.**  
An expression can be used as a statement, just by adding a semicolon, if it has a side effect. This means that `i + 1;` is not a valid statement, but `i++;` is a valid statement because it has the side effect that it changes the value of i.  
**b.**  
`x++` can as explained above, be used as a statement.  
**c.**  
It is true that the statment `x = x + 5` is also an expression.  
**d.**  
The statment `x = y = x = 0` is legal.  

**2.26**  
The following program    
```Java  
public class CheckPoint_02_26 {

	public static void main(String[] args) {
		int a = 6;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		a = 6;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
	}

}  
```
will output  
```  
7  
6  
7  
7  
```  
**2.27**  
Different types of values can be used together.  

An automatic conversion will happen when a value is assigned to a variable of a type that have a larger range.  

It is also possible to assign a value to a variable that have smaller range. This can cause loss of information so a cast must be used to indicate that we are aware of what we are doing. We will then need to somehow keep control over the ranges so that no vital information is lost in the process.  

**2.28**  
The fractional part of a double value will be truncated when casting to an int.  

Casting does not change the variable being cast.  

**2.29**  
The following program  
```Java  
public class CheckPoint_02_29 {

	public static void main(String[] args) {
		float f = 12.5F;
		int i = (int)f;
		System.out.println("f is " + f);
		System.out.println("i is " + i);
	}

}
```  
will output  
```  
f is 12.5
i is 12
```  

**2.30**  
Changing `(int)(tax * 100) / 100.0` to `(int)(tax * 100) / 100` in Listing 2.8 of the book, will cause int division to be used instead of double division. This will mean that all decimals will be truncated away. So a run of the program can then look like this  
```
Enter purchase amount: 197.55  
Sales tax is $11  
```

**2.31**  
The following program  
```Java   
public class CheckPoint_02_31 {

	public static void main(String[] args) {
		double amount = 5;
		System.out.println(amount / 2);
		System.out.println(5 / 2);
	}

}
```
will output  
```
2.5  
2  
```  

**2.32**  
The following code snippet shows how to write a slightly more advanced arithmetic expression that involves square root among other things.  
```Java  
(-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a)  
```  

**2.33**  
Running the program ComputeChange, from book listing 2.10, with the input 1.99 produces the following output.  
```  
Your amount 1.99 consists of  
 1 dollars  
 3 quarters  
 2 dimes  
 0 nickels  
 4 pennies  
``` 

**2.34**  
It is not allowed to declare a variable as int and then later redeclare it as double.  

**2.35**  
Numbers are stored with a limited numbers of digits. When a variable is assigned a value that is too large (in size) to be stored, it causes overflow. An integer overflow is when a variable of type int overflows.  

Just as with integer arithmetic, floating point arithmetic operations can cause overflow.  

**2.36**  
An overflow will not cause a runtime error.  

**2.37**  
Round off errors are introduced because some numbers are stored as approximations off the exact mathematical value.   

There are no round-off errors caused by integer operations. The exception to this rules is that values can be truncated when doing division but this does not really count as an round off error.  

Floating-point operations will frequently cause round-off errors.  
