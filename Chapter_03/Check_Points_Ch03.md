# Checkpoint Answers Chapter 3 #
**3.1**  
Examples of relational operators are:
```
<    less than  
<=   less than or equal to  
>    greater than  
>=   greater than or equal to  
==   equal to  
!=   not equal to
```  

**3.2**  
Below are some Boolean expressions with comments about the resulting values.  
```
x = 1  
(x > 0)   // true  
(x < 0)   // false
(x != 0)  // true
(x >= 0)  // true
(x != 1)  // false
```  

**3.3**  
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
**3.4**  
An if statement that assigns 1 to x if y is greater than 0:  
```Java
if(y > 0)  
	x = 1;  
```  
**3.5**  
An if statement that increases pay by 3% if score is greater than 90:  
```Java  
if(score > 90)  
	pay *= 1.03;  
```  

**3.6**  
An if statement that increases pay by 3% if score is greater than 90 and otherwise increases pay by 1%.  
```Java  
if(score > 90)  
	pay *= 1.03;
else
	pay *= 1.01;
```   

**3.7**  
**(a)**  
There is a logical error in this code for this check point. The output will when number is 30 be:  
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

**3.8**  
There will be no output for if x = 3 and y = 2.  

The ouput will be  
```
x is 2
```
if x = 2 and y = 2.  

![](https://github.com/HenrikSamuelsson/Introduction_to_Java_Programming/blob/master/Chapter_03/Resources/check_point_03_08.png)

