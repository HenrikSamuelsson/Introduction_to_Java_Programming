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

