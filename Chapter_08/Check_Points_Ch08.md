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
