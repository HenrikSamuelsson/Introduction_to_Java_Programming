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
