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

## 7.15 ##
The problem is that the content is swapped two times so wo will end up with the same order of elements as we started with.  

The trick to fix the problem is to stop the for loop when we have reached the midpoint of the array. A fixed version looks like this.  
```Java  
int[] list = {1, 2, 3, 5, 4};
for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
	// Swap list[i] with list[j]
	int temp = list[i];
	list[i] = list[j];
	list[j] = temp;
}
```
  
## 7.16 ##
Arrays are passed as references when used as arguments to methods. This reduces the amount of information that needs to be passed. Note that this means that if the method changes the content of the array so will this also affect corresponding array content existing outside of the method block.  

## 7.17 ##
**(a)**  
```Java  
public class Test {
	public static void main(String[] args) {
		int number = 0;
		int[] numbers = new int[1];
		m(number, numbers);
		System.out.println("number is " + number + " and numbers[0] is "
				+ numbers[0]);
	}

	public static void m(int x, int[] y) {
		x = 3;
		y[0] = 3;
	}
}
```  
The program from above will output:
```  
number is 0 and numbers[0] is 3  
```  

**(b)**  
```Java  
public class Test {
	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 4, 5 };
		reverse(list);
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}

	public static void reverse(int[] list) {
		int[] newList = new int[list.length];
		for (int i = 0; i < list.length; i++)
			newList[i] = list[list.length - 1 - i];
		list = newList;
	}
}
```  
The program from above will output:  
```  
1 2 3 4 5
```  
The reason that the output is not reversed is that the reference called "list" used inside the reverse method is a copy of the "list" in the main method, these two references are not the same even tough they have the same name.

"list" inside reverse will reference memory where the content is in deed reversed when we reach the end of method. But the other "list" in main will still reference another chunk of memory whit unaltered content.  

## 7.18 ##
TODO - Skipping this one because it means to much work right now.  

## 7.19 ##
Each of the following code snippets are incorrect.  

```Java
public static void print(String... strings, double... numbers)  
```  
The problem with above code is that it is only allowed to have a single variable-length parameter.  

```Java  
public static void print(double... numbers, String name)
```  
The problem with the above is that a variable-length parameter is only allowed to be placed last int the parameter list.  

```Java  
public static double... print(double d1, double d2)
```  
The problem with the above code is that it is not allowed to return a variable-length type from a method.  

## 7.20 ##
The printMax method from Listing 7.5 can be invoked like this  
```Java  
printMax(1, 2, 2, 1, 4);
printMax(new double[]{1, 2, 3});
```  
but not like this
```Java  
printMax(new int[]{1, 2, 3}); 
```  
because the types does not match and there is no automatic conversion in this case.  

## 7.21 ##
Replace  
```Java  
(low + high) / 2  
```  
with  
```Java  
(-low + high) / 2 + low
```
  
## 7.26 ##
The java.util.Arrays.sort method is overloaded so that it can be used to sort arrays of any primitive type except boolean. This sort method will not create a new method, the elements will be sorted into the array that is given as argument to the method.  

## 7.29 ##
These are all valid ways to declare the main method  
```Java
public static void main(String[] args)
public static void main(String args[])
public static void main(String[] x)
public static void main(String x[])  
```  
The name of the parameter does not matter and there are two ways of placing the square brackets when declaring an array in Java.  

This is not a valid ways to declare main since the public access modifier must be applied to make the method visible to the world
```Java 
static void main(String x[])
```  

## 7.30 ##
**(1)**  
```  
Number of strings is 4  
I  
have  
a  
dream  
```  

**(2)**  
```  
Number of strings is 1  
1 2 3  
```  

**(3)**  
```  
Number of strings is 0  
```  
