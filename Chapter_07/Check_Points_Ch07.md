# Checkpoint Answers Chapter 7 #
## 7.1 ##
An array reference variable is declared by the use of brackets. For example, the following code declares a variable myList that references an array of double elements.
```Java  
double[] myList;
```  
An array reference variable is used as a handle to access the content of the array, but just creating this variable will not allocate any space in memory for the array. Memory for the array is allocated by using the keyword new. If we need to be able to store 10 doubles so shall we write like in the following code.
```Java  
myList = new double[10];
```  
If we know the values that shall go in the array before it is created so is it also possible to use a shorthand notation. This is called an array initializer that will allocate memory and create the array reference.
```Java
double[] myList = {1.9, 2.4, 3.4, 3.5, 1.0, 5.7, 3.1, 1.1, 8.7, 4.6};  
```  
## 7.2 ##
The memory needed for an array is allocated when the array is created, by the use of the new keyword or using an array initializer.  
## 7.3 ##
The code in this check point will output:  
```  
x is 60
The size of numbers is 30
```  
The size of an array can not be changed after it is set.  
## 7.4 ##
**(a)**  
True  

**(b)**  
False  

**(c)**  
True  

**(d)**  
False  
## 7.5 ##
The following are both valid ways to define an array:  
```Java  
double d[] = new double[30];  
float f[] = {2.3, 4.5, 6.6};  
```  
## 7.6 ##
Each element in an array is associated with an index that can be used for accessing the element.  

Example:  
```Java  
int i[] = {1, 5, 8, 2};
int myInt = i[1];	// myInt becomes 5
```  
## 7.7 ##
The type of an array index is int.  

The lowest index of an array is 0.  

The third element of an array named a is represented by `a[2]`.  
## 7.8 ##
**(a)**  
```Java
double[] listA = new double[10];
```

**(b)**  
```Java  
listB[listB.length() - 1] = 5.5;
```

**(c)**  
```Java  
System.out.println(listC[0] + listC[1]);
```

**(d)**  
```Java  
int sum = 0;
for (int e : listD) {
	sum += e;
}
```

**(e)**  
```Java  
int min = listE[0];
for (int e : listE) {
	if (e < min) {
		min = e;
	}
}
```

**(f)**  
```Java  
System.out.println(listF[(int)(Math.random()listF.length)]);
```

**(g)**  
```Java  
double[] ListG = {3.5, 5.5, 4.52, 5.6};
```  
## 7.9 ##
Attempts to access an array element with an invalid index will cause an ArrayIndexOutOfBoundsException to be thrown.    
## 7.10 ##
The creation of the array is wrong, the line 
```Java
double[100] r;  
```  
should be  
```Java  
double[] r = new double[100];
```  

The usage of length in the header of the for loop should be   
```Java
r.length  
```  

There is a semicolon after the for loop that shall be removed.  

The array assignment expression uses parentheses where it should be square brackets.  

The call to the random function misses parentheses.  

A completely corrected program looks like this:  
```Java  
public class Test {
	public static void main(String[] args) {
		double[] r = new double[100];
 
       for (int i = 0; i < r.length; i++)
         r[i] = Math.random() * 100;
     }
}
```

## 7.11 ##
The first loop will in the first iteration copy the value of `list[0]` to `list[1]`. Which means that both `list[0]` and `list[1]` will be 1. The second iteration will the copy the value of `list[1]` to `list[2]`. This continues and by the end of the first loop so will the every value in list be set to 1.  

The second loop just prints the content of the array, the output will hence be  
```  
1 1 1 1 1 1  
```
  
## 7.12 ##
No the new version of the code, presented in the check point, will not work since it would be possible to get the same card more than once.  

## 7.13 ##
The following code will copy the content of the array called "source" to the other array called "target".  
```Java  
int[] source = {3, 4, 5};
int[] target = new int[3];
System.arraycopy(source, 0, target, 0, source.length);
```  

## 7.14 ##
The following code will not really resize the array.  
```Java  
int[] myList;
myList = new int[10];

	.
	.
	.

// Sometime later you want to assign a new array to myList
myList = new int[20];
```
What happens it that the reference is moved so that it references another part of the memory, that is big enough to hold 20 elements. This means that the 10 first elements will no longer be the same unless they are somehow copied.   
