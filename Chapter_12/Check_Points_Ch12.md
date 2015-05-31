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
The JVM will stop executing the ordinary code when an exception occurs and end the program execution, unless there is special code written just to handle the exception.  

Exception handling code is written in a two block structure with a try block that holds the ordinary code and a following catch block that shall catch and take care of eventual exceptions thrown in the try block.  
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

## 12.5 ##
Output if value is 30:  
```  
value is too small
Continue after the catch block
```  
Output if value is 50:
```  
Continue after the catch block
```  

## 12.7 ##
The java.lang.Throwable class is the superclass of all errors and exceptions in the Java language. Only objects that are instances of this class, or one of its subclasses, are thrown by the JVM or can be thrown by the Java throw statement.  

The classes Error and Exception are both subclasses of Throwable. 
- The Error class is used by the JVM when a system error occurs. For example that there is no more available memory.   
- The Exception class is for exceptions caused by the program. These types of exceptions can be caught and handled by the code.  

## 12.9 ##
It is often not possible to anticipate how an exception shall be handled since it depends on how the the program that uses the class is constructed. This is why the exception is thrown up in the call stack so that the user of the class can choose how to handle the exception. The main purpose of declaring the exception is hence to inform the user of the class what exceptions can be thrown so that they can be handled appropriately.  

An exception is declared by the use of the keyword throws in the method declaration. Multiple exceptions are declared by separating them with commas.  
```Java  
public void writeList() throws IOException, IndexOutOfBoundsException {  
	// method body omitted for brevity  
}
```  

## 12.10 ##
Checked exception is a property of the exception classes. Anything that is a subclass of Exception except for RuntimeException and its subclasses is a checked exception.  

The code will not compile unless checked exceptions are caught or declared to be thrown in the method signature. There are no such demands regarding unchecked exceptions.  

## 12.11 ##
The keyword throw is used to throw an exception. There can only be one exception in a single throw statement.  

Example statement that throws an exception:  
```Java  
throw new EmptyStackException();
```  

## 12.12 ##
The keyword called throw is used to throw an Exception from a method or static block.  

The keyword throws is used in method declarations to denote what types of exceptions possibly can be thrown by the method.  

## 12.13 ##
Assume that we have the following try catch block.  
```Java  
try {  
	statement1;
	statement2;
	statement3;
}
catch (Exception1 ex1) {
}
catch (Exception2 ex2) {
}

statement4;
```  
Now assume that an exception is caused by statement2.  

Under the above assumptions so will statement3 not be executed. And statement4 will be executed if and only if the thrown exception is caught in one of the catch blocks.  

## 12.14 ##
The code in this checkpoint will try to access an element with an index that is outside of the range of valid indexes. This will cause an IndexOutOfBoundsException. This type of exception is a subclass of RuntimeException. The output when running the code will hence be:  
```  
RuntimeException  
```  
## 12.15 ##
The method that is invoked will cause an ArithmeticException to be thrown. Nothing is printed inside the method because the exception is thrown before the actual printing starts. The try block will be excited directly without execution of the print statement inside the try block. There is then a following catch for ArithmeticException that will print:  
```  
ArithmeticException  
```  
## 12.16 ##
The code inside the method will cause an  StringIndexOutOfBoundsException that is a subclass of RuntimeException. This exception is caught in method itself. The main method then continues its normal execution flow.  

The output will be:  
```  
RuntimeException in method()  
After the method call  
```  
## 12.17 ##
The Throwable.getMessage() method is used for retrieving the detailed message describing the exception associated with a given Throwable instance.  

## 12.18 ##
The member method called printStackTrace in the Throwable class is a very useful tool for diagnosing an Exception. It indicates what happened and where in the code this happened by printing information about the content of the stack when the exception occurred.  

## 12.19 ##
The presence of a try-catch block will not impose any overhead when no exception occurs.  

## 12.20 ##
The code will possibly throw a checked exception. This means that the exception must be caught in the code or so must it be declared that the code can throw an exception.

Below is a fixed version that declares the throwing of the exception.  
```Java  
public void m(int value) throws Exception {
	if (value < 40)
		throw new Exception("value is too small");
}
```  

## 12.21 ##
If no exception occurs so will both statement4 and statement5 be executed.  

If the exception is of type Exception1 so will both statement4 and statement5 be executed.  

If the exception is not of type Exception1 so will statement4 be executed but not statement5.  

## 12.22 ##
The method presented in the checkpoint will work but can be expensive to run if many of the input strings are on the incorrect form since this will then cause overhead when the exception is caught.  

If it is desired to have code without exceptions so can the solution be based on the use of regular expression.  
```Java  
public static boolean isNumeric(String token) {
	return token.matches("-?\\d+(\\.\\d+)?");
}
```  
Another possible solution could be based around checking each character in the string to see if it is a number.  
```Java  
public static boolean isNumeric(String token) {
	for (char c : token.toCharArray()) {
		if (!Character.isDigit(c))
			return false;
	}
	return true;
}
```  
Note that it is tricky to write a method that covers all possible cases of numeric input. The first solution will for example fail if the locale decimal indicator is set to anything else than a dot. The second solution will only accept numbers, decimal points or minus signs will be rejected.  

## 12.23 ##
Suppose that statement2 causes an exception in the following code.
```Java  
try {
	statement1;
	statement2;
	statement3;
}
catch (Exception1 ex1) {
}
catch (Exception2 ex2) {
	throw ex2;
}
finally {
	statement4;
}
statement5;
```  
If no exception occurs so will both statement4 and statement5 be executed.  

If the exception is of type Exception1 so will both statment4 and statment5 be executed.  

If the exception is of type Exception2 so will statement4 be executed but statment5 will not be executed.  

If the exception is not Exception1 nor Exception2, so will statement4 be executed but statement5 will not be executed.  

## 12.24 ##
The output would be:
```  
java.lang.Exception: New info from method1  
 	at ChainedExceptionDemo.method1(ChainedExceptionDemo.java:16)  
 	at ChainedExceptionDemo.main(ChainedExceptionDemo.java:4)
```  