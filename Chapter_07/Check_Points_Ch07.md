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
