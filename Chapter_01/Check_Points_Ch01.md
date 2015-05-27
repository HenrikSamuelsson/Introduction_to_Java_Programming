# Checkpoint Answers Chapter 1 #
## 1.1 ##
A computer is said to be made up of hardware and software. 

Hardware are the different devices either installed in or connected to the computer. For example the drives, screen, keyboard, and motherboard.

Software is a set of instructions that are interpreted and executed by the hardware.

## 1.2 ##
Five major computer hardware components are  
1. Processor  
2. Memory  
3. Hard drive  
4. Screen  
5. Keyboard   

## 1.3 ##
CPU stands for Central Processing Unit.

## 1.4 ##
One unit used when measuring CPU speed is Hertz.  

## 1.5 ##
A bit is the basic unit of information in computing. A bit can only have one of two values. These values are commonly represented as 0 or 1.  

A byte is a unit of information in computing that most commonly consists of eight bits.  

## 1.6 ##
Memory is special hardware used for holding information while executing a software. RAM stands for Random Access Memory. The name RAM indicates that any part of the memory can be read and written in roughly the same amount of time.  

## 1.7 ##
Memory size is, at the time of writing, often measured in gigabyte (GB).  
  
## 1.8 ##
The unit to measure disk size is, at the time of writing, often measured in gigabyte (GB) or terabyte (TB).  

## 1.9 ##
The difference between memory and a storage device is usually that a memory will lose its content if the computer is powered off as opposed to a storage device where the memory is more or less permanent.  

## 1.10 ##
A CPU only understand instructions written in machine language. Each CPU family uses its own version of the machine language.  
## 1.11 ##
Assembly language is a low-level programming language in which there is a very strong correspondence between the language and the architecture's machine code.  

## 1.12 ##
An assembler translates assembly-language instructions into machine code.  

## 1.13 ##
The main difference between a high-level language and a low level language is that the former is platform independent and written in a more human friendly way.  

## 1.14 ##
A source program is a program written in a high-level language that needs further transformation before the computer can use it.  

## 1.15 ##
An interpreter translates small parts of source code, more or less line by line, into machine code that then are executed by the computer directly.  

## 1.16 ##
A compiler takes one or more files with high level source code and builds a machine language program that is stored in a file. This machine code file is then used at a later stage when the program shall run.  

## 1.17 ##
The difference between a compiler and interpreter is that an interpreter works with translation of source code to machine code in real time while the program is running. An compiler will be finished with the entire translation before the program runs.  

## 1.18 ##
An operating system (OS) is software that manages computer hardware and software resources and provides common services for computer programs. The operating system is an essential component of the system software in a computer system. Application programs usually require an operating system to function.  

Some currently popular operating systems are Windows, Linux, and Android.

## 1.19 ##
An operating system is responsible for handling of input/output devices such as keyboard mouse and screen. An operating system will also often make it possible to run several programs at once by letting each program use the CPU in short intervals and giving each application some memory that the application is allowed to read and write. An operating system is often also responsible for security, preventing unauthorized access to the system.  
 
## 1.20 ##
Multiprogramming allows multiple programs to run simultaneously by sharing the same CPU.  

Multithreading allows a single program to execute multiple tasks at the same time. In a game so can for example one task be responsible for playing sounds. While another task updates the graphics.  

Multiprocessing, or parallel processing, uses two or more processors together to perform subtasks concurrently and then combine solutions of the subtasks to obtain a solution for the entire task.  

## 1.21 ##
Initial development of Java was done at Sun Microsystems and the work was lead by James Gosling.  

Java is currently owned and developed by a company called Oracle.  

## 1.22 ##
A Java applet is a small application which is written in Java and delivered to the users over the Web. The user launches the Java applet from a web page, and the applet is then executed within in a process separate from the web browser itself.  

## 1.23 ##
Java is often used when developing Android applications. 

## 1.24 ##
The Java language specification is a technical definition of the Java programming language’s syntax and semantics.  

## 1.25 ##
JDK is an acronym for Java Development toolKit.  

## 1.26 ##
IDE is an acronym for Integrated Development Environment.  

## 1.27 ##
NetBeans and Eclipse are two different integrated development environments that can be helpful when developing Java programs.   
## 1.28 ##
A keyword is a word that has special meaning to the compiler and can hence not be used for other purposes.  

Example of keywords are:  
- class  
- public  
- static  
- void  

## 1.29 ##
Java is case sensitive.  

All keywords are written in lower case.  

## 1.30 ##
A comment is text in the source code intended for the human developers to document and explain the code.  

The compiler will ignore all comments.  

A comment line is started by writing two slashes and will then continue until the end of the line.  

I paragraph comment can span over multiple lines. This type of comment starts with a slash followed by an asterisk and ends with an asterisk followed by a slash.  

## 1.31 ##
The following statement will display a string on the console:  
```java
System.out.println("A string that will appear on the console.");
```
## 1.32 ##
The output of the following code
```java
public class Test {
	public static void main(String[] args) {
		System.out.println("3.5 * 4 / 2 - 2.5 is ");
		System.out.println(3.5 * 4 / 2 - 2.5);
	}
}
```
will be
```
3.5 * 4 / 2 - 2.5 is  
4.5
```

## 1.33 ##
The Java source file-name extension is ".java".  

The Java bytecode file-name extension is ".class".  

## 1.34 ##
The input to a Java compiler is a source file that shall have the ".java" extension.  

The output of a Java compiler is a bytecode file that will have a ".class" extension.  

## 1.35 ##
The command used to compile a Java program in the console is "javac" followed by the name of the source file.  

## 1.36 ##
The command used to run a Java program in the console is "java" followed byte the name of bytecode file. Note that the ".class" extension shall not be included in the command.  

## 1.37 ##
JVM stands for Java Virtual Machine. This is a program that can translate bytecode into machine code and in this way run a Java program.  

## 1.38 ##
Java can not be run on any machine.  

There must be a JVM installed on a machine if a Java program shall be able to run.  

## 1.39 ##
A NoClassDefFoundError indicates a class file that does not exist. 
   
## 1.40 ##
A NoSuchMethodError can be a indication that the class to be executed does not have a proper main method.  

## 1.41 ##
The following code need to be reformatted according to the programming style and documentation guidelines.  
```Java
public class Test {
	// Main method
	public static void main(String[] args)
	{
		/** Display output */
		System.out.println("Welcome to Java");
	}
}
```

The code is simple enough to read without the comments so these comments, that just crowd the code, can be removed.

Lets also change to end-of-line style block braces throughout the entire code for consistency and because this is the style used in the Java API source code.  

The result after changes will be:
```Java
public class Test {
	public static void main(String[] args) {
		System.out.println("Welcome to Java");
	}
}
```

## 1.42 ##
A syntax error is introduced when writing some code that does not follow the Java syntax rules.  

A runtime error will occur during program execution causing the program to terminate in an uncontrolled way because of some unforeseen event.  

I program with a logical error will compile and run but, does not behave as is should during execution.  

## 1.43 ##
Examples of syntax errors are misspelling of keywords, missing a terminating brace, or not ending a statement with a semicolon.  

Examples of runtime errors are not being able to handle incorrect user input. For example if a number is expected and the user writes "five" instead of 5. Or the user enters 0 and we use this to divide later on.  

Examples of logical errors are using the wrong formula for calculating something. Or not having full understanding of how some language feature actually works.  

## 1.44 ##
Forgetting to put a closing quotation mark on a string will raise a syntax error when compiling the code.  

## 1.45 ##
A program that needs to read integer, but the user enter strings will raise an runtime error, assuming we have not included special code to handle this situation.  

## 1.46 ##
Mistakenly using the wrong code, like calculating the area of a triangle instead of the area of a rectangle, introduces a logical error.  

## 1.47 ##
The following code have errors multiple errors:
```Java
public class Welcome {
	public void Main(String[] args) {
		System.out.println('Welcome to Java!);
	}
}
```
Lets fix the code.  

The name of the method "Main" is misspelled, should be "main".  

The keyword static is missing.  
  
The string in the print statement have a single apostrophe when there should be two quotation marks surrounding the string.  

A fully corrected version looks like this:  
```Java
public class Welcome {
	public static void main(String[] args) {
		System.out.println("Welcome to Java!");
	}
}
```
