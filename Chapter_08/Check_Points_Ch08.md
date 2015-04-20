# Checkpoint Answers Chapter 8 #
## 8.1 ##
A two-dimensional array that hold int values and is of size 4-by-5 is created like this:  
```Java  
int[][] matrix = new int[4][5];
```  

## 8.2 ##
The rows in a two-dimensional array can have different lengths, arrays with this property is known as ragged arrays.  

## 8.3 ##
```Java  
int[][] array = new int[5][6];
int[] x = {1, 2};
array[0] = x;
System.out.println("array[0][1] is " + array[0][1]);
```
The above code will set array[0][0] to 1 and array[0][1] to 2. So the output will be:  
```  
array[0][1] is 2
```  

## 8.4 ##
Examples of valid statements:  
```Java  
int[][] y = new int[3][];
int[][] z = {{1, 2}};
int[][] m = {{1, 2}, {2, 3}};
```  
Examples of invalid statements:  
```Java  
int[][] r = new int[2]; 
int[] x = new int[];
int[][] n = {{1, 2}, {2, 3}, };
```  

## 8.5 ##
```Java  
int[][] array = {{1, 2}, {3, 4}, {5, 6}};
for (int i = array.length - 1; i >= 0; i——) {
	for (int j = array[i].length - 1; j >= 0; j——)
 		System.out.print(array[i][j] + " ");
 	System.out.println();
}
```  
The above code setups a two dimensional array with 3 rows and 2 columns. It will then print the content of the array "in reverse". The output will be:  
```  
6 5  
4 3  
2 1  
```  

## 8.6 ##
```Java   
int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
int sum = 0;
for (int i = 0; i < array.length; i++)
	sum += array[i][0];
System.out.println(sum);
```  
The above code setups a two dimensional array with 3 rows and 2 columns. The sum of all the elements in the first column will then be calculated (1 + 3 + 5) and the result is printed. The output will hence be:  
```  
9  
```  

## 8.7 ##
The method called m1 will take a two dimensional array as input and check the number of rows and columns. The result of the check is returned in an array where the row count is placed first and then follows the column count.

The method is tested with a 2 by 4 array so the output will be: 
``` 
2
4
```  

## 8.8 ##
A declaration of a three dimensional array:
```Java  
int[][][] a = new int[4][6][5];  
```  

## 8.9 ##
Assume that we have the following declaration:  
```Java 
int[][][] x = new char[12][5][2];  
```  

This array will in total hold 120 elements because 12 times 5 times 2 is 120.  

The value of  
```Java  
x.length  
```  
will be 12 because the outermost array can hold 12 elements.

The value of  
```Java  
x[2].length  
```  
will be 5 because this refers to the array in the "second dimension".

The value of  
```Java  
x.length[0][0]  
```  
will be 2 because this is a reference to the "third dimension" and these are all arrays of size 2.  

## 8.10 ##
```Java  
int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};  
System.out.println([0][0][0]);  
System.out.println([1][1][1]);  
```  
The above code will declare an three-dimensional array of size 2-by-2-by-2. The "first" and "last" elements in the array are then printed, so the output will be:  
```  
1
8
```  
