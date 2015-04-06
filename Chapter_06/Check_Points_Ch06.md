# Checkpoint Answers Chapter 6 #
## 6.1 ##
Some of the benefits of using methods are:  
- Faster development time by reuse of code  
- Reduces complexity of the code  
- Makes the code easier to maintain  
## 6.2 ##
A number of properties about a given method need to be decided before it can be defined:  
- What modifiers are suitable
- The type of the value, if any, that shall be returned
- The name of the method
- What parameters are needed as data for the method to be able to do its work
- What the method is intended to do and how it shall do it

When all of the above decisions have been made so can the method be defined. An example of a method definition looks like this:  
```Java  
public static int max(int num1, int num2) {  
	if (num1 > num2)  
		return num1;   
	else  
		return num2;  
}  
```  
The keywords public and static are examples of modifiers. The following int indicates that the method will return an int after being executed. The name of the method is max and it takes two int's as data parameters.

The part between the braces is the body of the loop and it this part that does the actual work. In this case so will it be checked which of the parameters that is biggest and the value of this parameter is returned to the caller of the method.  

A method is invoked by using the name of the method combined with the same number and type of actual parameter values as in the definition of the method.  

An invocation of the max method can for example look like this:  
```Java  
int biggestNumber = max(15, 42);  
```  
## 6.3 ##
The body of the max method can be shortened by the use of the conditional operator.  
```Java  
return ( num1 > num2 ) ? num1 : num2;  
```   
## 6.4 ##
A call to a method with a void return type is always a statement itself. A call to a value-returning method can also be a statement by itself.  
## 6.5 ##
The return type of the main method is void.  
## 6.6 ##
Omitting a return statement in a value-returning method will cause a syntax error.  

It is possible to have a return statement in a void function, this will end the execution of the method.  

It is a syntax error to have a void function that returns a value.  
