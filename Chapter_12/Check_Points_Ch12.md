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

## 12.25 ##
A custom exception class is defined by extending Exception or a subclass of Exception. 

## 12.26 ##
An exception of type Exception will be thrown in method(). This exception is caught in method and then re-thrown out to main.  
The resulting output will be  
```  
Exception in method()  
Exception in main
```   

## 12.27 ##
A file object is attempted to be created like this  
```Java  
new File("c:\book\test.dat");  
```  
but there is a problem. It has been forgotten that a backslash cannot be used directly in a string, it has special meaning and must be accompanied by an extra backslash.  

A corrected version looks like this:  
```Java  
new File("c:\\book\\test.dat);
```   

## 12.28 ##
The class called File have several member methods that can be used to get properties about files on a system.  

The exist() methods checks if a file exists.  

Files or directories can be deleted with the delete() method.  

Renaming of files is done with renameTo() method.  

The size of a a file is retrieved with the length() method.  

File(pathname: String) can be used for creation of both directories and files.  

## 12.29 ##
The file class is not intended for I/O.   

Creation of a File object does mean that a file will be created on the disk.  

## 12.30 ##
A PrintWriter for writing data to a file is created like this  
```Java  
PrintWriter output = new PrintWriter(file);  
```  
There are multiple things that can go wrong when using PrintWriter so we must either handle these problems or at least inform the user of our class that things can go wrong. This is way the main method in Listing 12.13 is declared with throws Exception.  

Listing 12.13 closes the file at the end by the use of the close() method. Data may not get saved properly in the file if this step is omitted.  

## 12.31 ##
The program from this checkpoint will store the following text in a file called temp.txt.  
```  
amount is 32,320000 3,232000e+01
amount is 32,3200 3,2320e+01
 false
  Java
```  
## 12.32 ##
Example of using the concept try with resources.  
```Java  
public class Checkpoint_12_32 {

	public static void main(String[] args) throws Exception {
		try (java.io.PrintWriter output = new java.io.PrintWriter("temp.txt");) {
			output.printf("amount is %f %e\r\n", 32.32, 32.32);
			output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
			output.printf("%6b\r\n", (1 > 2));
			output.printf("%6s\r\n", "Java");
		}
	}

}
```  
## 12.33 ##
A Scanner that takes input from a file is created in the following way.  
```Java  
Scanner input = new Scanner(file);  
```  
The throws Exception declaration in listing 12.15 is needed because the code have no functionality for handling exceptions. It is the up to the user of the code to decide how the eventual exceptions shall be handled. The throws exception declaration functions as documentation for both the user and the compiler that the exceptions shall be handled by another part.  

If the close() method is not invoked, the problem will run fine. But it is a good practice to close the file to release the resource on the file. The compiler will also probably give us a warning.  

## 12.35 ##
The line separator is not the same on all platforms.  

Some examples of different line separators  
- Windows: `\r\n`  
- Mac (OS 9-): `\r`  
- Mac (OS 10+): `\n`  
- Unix/Linux: `\n`  

## 12.36 ##
The Scanner will repeatedly read the entered data  
- intValue holds 45  
- doubleValue contains 57.8  
- line contains ' ', '7 ', '8 ', '9'  

## 12.37 ##
The Scanner will repeatedly read the entered data  
- intValue contains 45  
- doubleValue contains 57.8  
- and line is empty  

The reason that line is empty is that the 
token-reading method nextDouble() reads in 57.8 and stops at the delimiter, which in this case is a line separator (the Enter key). The nextLine() method ends after reading the line separator and returns the string read before the line separator. Since there are no characters before the line separator, line is empty.  

## 12.38 ##
Creation of a Scanner object for reading text from an URL is done in the following way.  
```Java  
URL url = new URL("www.google.com/index.html");  
Scanner input = new Scanner(url.openStream());  
```  

## 12.39 ##
One problem with the WebCrawler program is that it is possible that listOfPendingsURLs can hold duplicate URLs. This will happen if a link is not in listOfTraversedURLs and the link appears more than one time in a given page.  
