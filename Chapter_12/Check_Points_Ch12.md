# Checkpoint Answers Chapter 12 #
## 12.1 ##
Exceptions provide the means to separate the details of what to do when something out of the ordinary happens from the main logic of a program. This separation can, if used right, simplify the code making it easier to understand and maintain.  

## 12.2 ##
The following statement will throw an exception because of the division with zero.  
```Java  
System.out.println(1 / 0);  
```
Division of doubles will on the other hand not throw an exception when dividing by zero. This is because the specification that Java follows specifies that this event shall return a special indicator indicating infinity.  
```Java
System.out.println(1.0 / 0);    
```
The above line will not throw an exception. The output from a test run was:
```  
Infinity  
```  
## 12.3 ##
```Java  
long value = Long.MAX_VALUE + 1;  
System.out.println(value);  
```  
The above code will add one to a long variable that already holds the biggest value that can be fitted into a long. This will cause a wrap around that may or may not be seen as an error depending on how the design of program is intended to work. This will not cause throwing of an exception in the current version of Java.  

## 12.4 ##
The JVM will stop executing the ordinary code when an exception occurs and end the program execution, unless there is special code for written to handle the exception.  

Exception handling code is written in a two block structure with a try block that holds the ordinary code and a following catch block that shall catch and handle eventual exceptions thrown in the try block.  
```Java  
try {
	// ordinary code in  
	// this block that might  
	// throw an exception  
}  
catch (Exception ex){
	// handling of exceptions  
	// in this follow up block  
}
```  
