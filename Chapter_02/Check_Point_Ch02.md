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

