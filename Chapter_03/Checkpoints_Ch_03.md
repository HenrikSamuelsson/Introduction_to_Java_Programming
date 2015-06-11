# Checkpoint Answers Chapter 3 #
## 3.1 ##
Examples of relational operators are:
```
<    less than  
<=   less than or equal to  
>    greater than  
>=   greater than or equal to  
==   equal to  
!=   not equal to
```  

## 3.2 ##
Below are some Boolean expressions with comments about the resulting values.  
```
x = 1  
(x > 0)   // true  
(x < 0)   // false
(x != 0)  // true
(x >= 0)  // true
(x != 1)  // false
```  

## 3.3 ##
It is now allowed to cast from an boolean to an int in Java, neither is it allowed to cast from an int to an boolean.  

This means that the following program will not compile.  
```Java  
public class CheckPoint_03_03 {

	public static void main(String[] args) {
		boolean b = true;
		i = (int)b;					// error
		
		int i = 1;
		boolean b = (boolean)i;		// error
	}

}

```  
##3.4##
An if statement that assigns 1 to x if y is greater than 0:  
```Java
if(y > 0)  
	x = 1;  
```  
##3.5##
An if statement that increases pay by 3% if score is greater than 90:  
```Java  
if(score > 90)  
	pay *= 1.03;  
```  

##3.6##
An if statement that increases pay by 3% if score is greater than 90 and otherwise increases pay by 1%.  
```Java  
if(score > 90)  
	pay *= 1.03;
else
	pay *= 1.01;
```   

##3.7##
**(a)**  
There is a logical error in this code for this checkpoint. The output will when number is 30 be:  
```
30 is even.  
30 is odd.
```
When number is 35 so will the output be:  
```
35 is odd.  
```
**(b)**  
The second version of the code is corrected and will when number is 30 output:
```  
30 is even.
```
When number is 35 so will the output, as in the first verison, be:  
```
35 is odd.  
```

##3.8##
There will be no output if x = 3 and y = 2.  

The ouput will be `z is 7` if x = 3 and y = 4.  

The ouput will be `x is 2` if x = 2 and y = 2.  

![](https://github.com/HenrikSamuelsson/Introduction_to_Java_Programming/blob/master/Chapter_03/Resources/check_point_03_08.png)

##3.9##
There will be no output if x = 2 and y = 3.  

The ouput will be `x is 3` if x = 3 and y = 2.  

The ouput will be `z is 6` if x = 3 and y = 3.  

##3.10##
The problem with the code in this checkpoint is that only D or F will be printed. D will be printed whenever score is 60 or more, F is printed if score is less than 60.  

The score comparisons shall be done in descending order for this code to work as intended.  

##3.11##
a, b, and c are equivalent.  

b and c are correctly indented.  

##3.12##
```Java
boolean newLine = count % 10 == 0;
```

##3.13##
Both a and b are correct and will do the same thing. The code in b is the preferred way because it shows that the statements are related.  

##3.14##
**(a)**  
This code will always check for both even numbers and numbers that is a multiple of 5.

The output when using number 14, 15, and 30 will be:
```
14 is even  
15 is a multiple of 5
30 is even  
30 is a multiple of 5
```  

**(b)**  
This code will check if a number is even. If the number is odd so will an additional check be done that checks if the number is a multiple of 5.  

The out put when using number 14, 15, and 30 will be:
```  
14 is even  
15 is a multiple of 5
30 is even  
```  

##3.15##
Math.random() will generate a random double value between 0.0 and 1.0, excluding 1.0.  

Examples of possible values when using Math.random() are 0.5, 0.0, 0.234.  

##3.16##
**(a)**  
Generates an int in the 0 to 19 interval:  
```
int a = (int)(Math.random() * 20);    
```  

**(b)**  
Generates an int in the 10 to 19 interval:  
```
int b = 10 + (int)(Math.random() * 10);    
```  

**(c)**  
Generates an int in the 10 to 50 interval:  
```
int c = 10 + (int)(Math.random() * 41);    
```  

**(d)**  
Generates an int that is 0 or 1:  
```
int d = (int)(Math.random() * 2);    
```  

##3.17##
The two statements in this checkpoint are equal. The first one is better since it is shorter.  

##3.18##
```Java  
x = 1  

(true) && (3 > 4)      // false  
!(x > 0) && (x > 0)    // false  
(x > 0) || (x < 0)	   // true  

(x != 0) || (x == 0)   // true  
(x >= 0) || (x < 0)    // true  
(x != 1) == !(x == 1)  // true  
```  

##3.19##
**(a)**  
```Java  
(num > 1) && (num < 100)  
```  
**(b)**  
```Java  
(num > 1) && (num < 100) || (num < 0)  
```  

##3.20##
**(a)**  
```Java  
(x - 5 < 4.5) && (-(x - 5) < 4.5)
```  
**(b)**  
```Java  
(x - 5 > 4.5) || (-(x - 5) > 4.5)
``` 

##3.21##
Assume that x and y are int type variables.  

Examples of legal Java expressions:  
```Java  
x /= y  
```     

Examples of illegal Java expressions.
```Java  
x > y > 0  
x = y && y  
x or y  
x and y  
(x != 0) || (x = 0) 
```  

##3.22##
Yes.  

##3.23##
Call the following expression p:  
```  
x >= 50 && x <= 100  
```  
p is false when x is 45   
p is true when x is 67  
p is false when x is 101  

##3.24##
The output will be  
```
(x < y && y < z) is true  
(x < y || y < z) is true  
!(x < y) is false  
(x + y < z) is true  
(x + y > z) is false  
```  

##3.25##
Boolean expression that evaluates to true if age is greater than 13 and less than 18.  
```Java  
age > 13 && age < 18  
```  

##3.26##
Boolean expression that evaluates to true if weight is greater than 50 pounds or height is greater than 60 inches.  
```Java  
weight > 50 || height > 60
```  

##3.27##
Write a Boolean expression that evaluates to true if weight is greater than 50 pounds and height is greater than 60 inches.  
```Java  
weight > 50 && height > 60
```  

##3.28##
Write a Boolean expression that evaluates to true if either weight is greater than 50 pounds or height is greater than 60 inches, but not both.  
```Java  
(weight > 50 && !(height > 60)) || (!(weight > 50) && height > 60)  
``` 
My opinion is that the other answer, that can be found on the book web site, is wrong on this one.  

##3.29##
The following data types are allowed to be used as a switch variable:  
- char  
- byte  
- short  
- int  
- String  

Omitting a break statement will cause a fall-through causing the code in the next case to be to executed.  

A switch statement can be converted to an equivalent if statement.    

A switch statement can make the code easier to read comparing to using deeply nested if statements.  

##3.30##
```Java  
public class CheckPoint_03_03 {

	public static void main(String[] args) {
		int x, y;

		x = 3;
		y = 3;
		switch (x + 3) {
		case 6:
			y = 1;
		default:
			y += 1;
		}
		System.out.println("After switch statement y = " + y);
		
		// rewrite switch to an equivalent if-else variant
		y = 3; 	// set y to original value
		if(x + 3 == 6)
			y = 1;
		y += 1;
		System.out.println("After if statement y = " + y);
	}

}
```  
y is 2 after the switch statement.  

##3.31##
```Java  
public class CheckPoint_03_31 {

	public static void main(String[] args) {
		int x = 1, a = 3;
		
		// first version with an if-else statement
		if (a == 1)
			x += 5;
		else if (a == 2)
			x += 10;
		else if (a == 3)
			x += 16;
		else if (a == 4)
			x += 34;

		System.out.println("After if-else x = " + x);
		
		x = 1;	// set x to original value before switch statement
		
		// second version with a switch statement
		switch (a) {
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;
		case 4:
			x += 34;
			break;
		}
		
		System.out.println("After switch x = " + x);
	}

}
```  
x is 17 after the switch statement.  

A flowchart for the switch statement is shown below.  

![](https://github.com/HenrikSamuelsson/Introduction_to_Java_Programming/blob/master/Chapter_03/Resources/checkpoint_03_31.png?raw=true)

##3.32##
```Java  
switch (day) {
case 0:
	System.out.println("Sunday");
	break;
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thursday");
	break;
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;
}
```  

##3.33##
The output will be:  
```  
sorted  
```  

##3.34##
```Java  
ticketPrice = ages >= 16 ? 20 : 10;  
```  

##3.35##
**(a)** 
```Java   
if (x > 10)
	score = 3 * scale;
else
	score = 4 * scale;
```  
**(b)**  
```Java  	
if (income > 10000)
	tax = income * 0.2;
else
	tax = income * 0.17 + 1000;
```  
**(c)**
```Java    
if (number % 3 == 0) 
	System.out.println(i);
else
	System.out.println(j);
```  

##3.36##
```Java  
1 == (int) (Math.random() * 2) ? 1 : -1;
```  

##3.37##
The precedence of the the Boolean operators is (listed from high to low):
- NOT `!`    
- XOR `^`  
- AND `&&`   
- OR `||`  

The expression `true || true && false` will be evaluated as follows.  
```
true || (true && false)  
true || false
true
```
The expression `true && true || false` will be evaluated as follows.  
```  
(true && true) || false  
true || false  
true
```  

##3.38##
It is true that all the binary operators except =, +=, -=, *=, /=, %= are left associative.  

##3.39##
```  
2 * 2 - 3 > 2 && 4 – 2 > 5  
4 - 2 > 2 && 4 - 2 > 5  
2 > 2 && 2 > 5  
false && false  
false  
```  

```
2 * 2 - 3 > 2 || 4 – 2 > 5  
4 - 3 > 2 || 4 – 2 > 5  
1 > 2 || 2 > 5  
false || false  
false     
```  

##3.40##
`(x > 0 && x < 10)` is the same as `((x > 0) && (x < 10))`  

`(x > 0 || x < 10)` is the same as `((x > 0) || (x < 10))`  

`(x > 0 || x < 10 && y < 0)` is the same as  `(x > 0 ||(x < 10 && y < 0))`  
