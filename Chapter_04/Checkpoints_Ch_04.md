# Checkpoint Answers Chapter 4 #
##4.1##
**(a)**  
```  
Math.sqrt(4)   // 2.0  
```  
**(b)**  
```  
Math.sin(2 * Math.PI)    // -2.4492935982947064E-16  
```  
**(c)**  
```  
Math.cos(2 * Math.PI)    // 1.0  
```  
**(d)**
```  
Math.pow(2, 2)    // 4.0  
```  
**(e)**  
```  
Math.log(Math.E)   // 1.0  
```  
**(f)**  
```  
Math.exp(1)    // 2.718281828459045  
```  
**(g)**  
```  
Math.max(2, Math.min(3, 4))    // 3  
```  
**(h)**  
```  
Math.rint(-2.5)    // -2.0  
```  
**(i)**  
```  
Math.ceil(-2.5)    // -2.0  
```  
**(j)**  
```  
Math.floor(-2.5)    // -3.0   
```  
**(k)**  
```  
Math.round(-2.5f)   // -2  
```  
**(l)**  
```  
Math.round(-2.5)    // -2  
```  
**(m)**  
```  
Math.rint(2.5)    // 2.0  
```  
**(n)**  
```  
Math.ceil(2.5)    // 3.0  
```  
**(o)**  
```  
Math.floor(2.5)    // 2.0  
```  
**(p)**  
```  
Math.round(2.5f)    // 3  
```  
**(q)**  
```  
Math.round(2.5)    // 3    
```  
**(r)**  
```  
Math.round(Math.abs(-2.5))   // 3  
```  

##4.2##
The argument for trigonometric methods is an angle in radians.  

##4.3##
```Java  
// convert 47 degrees to radians  
double angle = Math.toRadians(47);  
```  

##4.4##
```Java  
// convert pi / 7 radians to degrees  
double angle = Math.toDegrees(Math.PI / 7);  
```  

##4.5##
**(a)**  
```Java  
int i = 34 + (int)(Math.random() * 22);  
```  
**(b)**  
```Java  
int j = (int)(Math.random() * 1000);
```  
**(c)**  
```Java  
double k = 5.5 + (int)(Math.random() * 50);  
```  

##4.6##
There is one package that is automatically imported into any Java program, this package is called java.lang.  

One of the classes that belongs to the java.lang package is the Math class. This means that the Math methods can be used directly without the need for explicit import.  
 
##4.7##
```Java  
Math.log(Math.exp(5.5));    // evaluates to 5.5  
```  
```Java  
Math.exp(Math.log(5.5));    // evaluates to 5.5  
```		
```Java  
Math.asin(Math.sin(Math.PI / 6));    // evaluates to 0.5235987755982988 = pi / 6  
```  
```Java  
Math.sin(Math.asin(Math.PI / 6));    // evaluates to 0.5235987755982988 = pi / 6  
```  
##4.8##
```Java  
System.out.println((int)'1');	// prints 49
System.out.println((int)'A');	// prints 65
System.out.println((int)'B');	// prints 66 
System.out.println((int)'a');	// prints 97
System.out.println((int)'b');	// prints 98
```  
```Java  
System.out.println((char)40);	// prints (
System.out.println((char)59);	// prints ;
System.out.println((char)79);	// prints O
System.out.println((char)85);	// prints U	
System.out.println((char)90);	// prints Z
```  
```Java
System.out.println((char)0x40);	// prints @
System.out.println((char)0x5A);	// prints Z
System.out.println((char)0x71);	// prints q
System.out.println((char)0x72);	// prints r
System.out.println((char)0x7A);	// prints z 
```  

##4.9##
Examples of correct character literals:
```Java  
'l'  
'\u3fFa'  
'\b'  
'\t'  
```  
Example of incorrect character literal, because the Unicode representation is too long:
```Java  
'\u345dE'
```  

##4.10##
```Java  
System.out.println('\\');	// prints \
System.out.println('"');	// prints "
```  

##4.11##
```Java  
int i = '1';  
```  
equals  
```Java  
int i = 49;  
```  
because the ASCII code for 1 is 49, i will hence become 49.  

```Java  
int j = '1' + '2' * ('4' - '3') + 'b' / 'a';  
```  
equals  
```Java  
int j = 49 + 50 * (52 - 51) + 98 / 97;  
```  
that evaluates to j becoming 100.  

```Java  
int k = 'a';  
```  
equals  
```Java  
int k = 97;  
```  
because the ASCII code for a is 97, k will hence become 97.  

```Java  
char c = 90;  
```  
equals  
```Java  
char c = 'Z';  
```  
because the 90 equals Z in the ASCII table, c will hence hold the value Z.  

##4.12##
Some examples that illustrate casting.  
```Java  
// i will be set to 65
char c = 'A';  
int i = (int)c;  
```  
```Java 
// i will be set to 1000 
float f = 1000.34f;  
int i = (int)f;  
```  
```Java  
// i will be set to 1000
double d = 1000.34;  
int i = (int)d;  
```  
```Java  
// c will be set to 'a'
int i = 97;  
char c = (char)i;  
```  

##4.13##
```Java    
public class Test {  

	public static void main(String[] args) {  
		char x = 'a';  
        char y = 'c';  
		
		// prints b  
        System.out.println(++x);
        
		// prints c because the increment is done after usage  		
		System.out.println(y++);

		// prints -2 beacuse there is an auto conversion to int before the subraction  
        System.out.println(x - y);
   	}

}
```

##4.14##
```Java  
// c will become a lower case character in the range a to z  
char c = (char)(97 + Math.random() * 26);  
```  

##4.15##
```Java  
System.out.println('a' < 'b');	// true  
System.out.println('a' <= 'A');	// false   
System.out.println('a' > 'b');	// false  
System.out.println('a' >= 'A');	// true  
System.out.println('a' == 'a');	// true
System.out.println('a' != 'b');	// true
```  

##4.16##
```Java
String s1 = "Welcome to Java";  
String s2 = "Programming is fun";  
String s3 = "Welcome to Java";  
```   
Assuming the above lines will cause the following expressions to become the value indicated in the comments.  
```Java  
s1 == s2	// false  
```  
```Java  
s2 == s3	// false  
```  
```Java  
s1.equals(s2)	// false
```  
```Java   
s1.equals(s3)	// true
```  
```Java   
s1.compareTo(s2)	// a positive int
```  
```Java   
s2.compareTo(s3) 	// a negative int  
```  
```Java   
s2.compareTo(s2)	// 0
```  
```Java   
s1.charAt(0)	// W
```  
```Java  
s1.indexOf('j')		// -1 
```  
```Java  
s1.indexOf("to")	// 8
```  
```Java	
s1.lastIndexOf('a')		// 14    
```  
```Java  
s1.lastIndexOf("o", 15)		// 9
```  
```Java  
s1.length()  // 15
```  
```Java  
s1.substring(5)		// me to Java
```  
```Java  
s1.substring(5, 11)  // me to   
```  
```Java  
s1.startsWith("Wel")  // true
```  
```Java  
s1.endsWith("Java")  // true
```  
```Java  
s1.toLowerCase()	// welcome to java  
```  
```Java  
s1.toUpperCase()	// WELCOME TO JAVA    
```  
```Java  
s1.concat(s2)	// Welcome to JavaProgramming is fun
```  
```Java  
s1.contains(s2)		// false
```  
```Java  
"\t Wel \t".trim()	// Wel  
```  

##4.17##
Suppose that s1 and s2 are two strings.  

The following are all examples of correct string manipulations in Java.  
```Java  
String s = "Welcome to Java";  
String s3 = s1 + s2;  
s1 == s2  
s1.compareTo(s2);  
int i = s1.length();  
```  
On the other hands so are the following all incorrect.  
```Java  
String s3 = s1 - s2;    
s1 >= s2  
char c = s1(0);  
char c = s1.charAt(s1.length());  
```  

##4.18##
```Java  
public class CheckPoint_04_18 {

	public static void main(String[] args) {
		System.out.print("a)\t");	System.out.println("1" + 1);
		System.out.print("b)\t");	System.out.println('1' + 1);
		System.out.print("c)\t");	System.out.println("1" + 1 + 1);
		System.out.print("d)\t");	System.out.println("1" + (1 + 1));
		System.out.print("e)\t");	System.out.println('1' + 1 + 1);

	}

}
```  
Above program will output:  
```  
a)    11
b)    50
c)    111
d)    12
e)    51
```  

##4.19##
```Java  
public class CheckPoint_04_19 {

	public static void main(String[] args) {
		String a = 1 + "Welcome " + 1 + 1;
	    String b = 1 + "Welcome " + (1 + 1);
	    String c = 1 + "Welcome " + ('\u0001' + 1);
	    String d = 1 + "Welcome " + 'a' + 1;
	    
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
```  
Above program will output:  
```  
1Welcome 11
1Welcome 2
1Welcome 2
1Welcome a1
```  

##4.20##
**(a)**
```Java  
boolean isEqual = s1.equals(s2);  
```    
**(b)**
```Java  
boolean isEqual = s1.equalsIgnoreCase(s2);  
```    
**(c)**
```Java  
int x = s1.compareTo(s2);  
```    
**(d)**
```Java  
int x = s1.compareToIgnoreCase(s2);  
```    
**(e)**
```Java  
boolean b = s1.startsWith("AAA");  
```    
**(f)**
```Java  
boolean b = s1.endsWith("AAA");  
```    
**(g)**
```Java  
int x = s1.length();  
```    
**(h)**
```Java  
char x = s1.charAt(0);  
```    
**(i)**
```Java  
String s3 = s1 + s2;  
```    
**(j)**
```Java  
String s3 = s1.substring(1);  
```    
**(k)**
```Java  
String s3 = s1.substring(1, 5);  
```    
**(l)**
```Java  
String s3 = s1.toLowerCase();  
```    
**(m)**
```Java  
String s3 = s1.toUpperCase();  
```    
**(n)**
```Java  
String s3 = s1.trim();  
```    
**(o)**
```Java  
int x = s1.indexOf('e');
```    
**(p)**
```Java  
int x = s1.lastIndexOf("abc");
```  

##4.21##
We will get the answer by adding the first numbers in Set1, Set3, and Set4:
```  
1 + 4 + 8 = 13
```  

##4.22##
The format specifier for outputting a boolean is %b.  

The format specifier for outputting a character is %c.  

The format specifier for outputting a decimal is %d.  

The format specifier for outputting a boolean is %f.  

The format specifier for outputting a string is %s.  

##4.23##
**(a)**    
```Java
System.out.printf("%5d %d\n", 1, 2, 3);
```
Erroneous code because there are three items to be printed but only two format specifiers.  

**(b)**    
```Java  
System.out.printf("%5d %f", 1);
```  
Erroneous code because there are two format specifiers but only one item to be printed.   

**(c)**    
```Java  
System.out.printf("%5d %f\n", 1, 2);  
```  
Erroneous code because an int item is combined with a float format specifier.  

**(d)**    
```Java  
System.out.printf("%.2f\n%0.3f\n", 1.23456, 2.34);   
```  
Erroneous because second format specifier tries to set the width to zero and this is not allowed.  

**(e)**    
```Java  
System.out.printf("%08s\n", "Java");  
```  
Erroneous because of the 0 in the format specifiers that need to be removed.  

##4.24##
```Java  
public class CheckPoint_04_24 {
	
	public static void main(String[] args) {
		System.out.println("(a)"); 
		System.out.printf("amount is %f %e\n", 32.32, 32.32);
	    System.out.println();
	    
	    System.out.println("(b)");
		System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
		System.out.println();
		    
		System.out.println("(c)");
		System.out.printf("%6b\n", (1 > 2));
		System.out.println();
		    
		System.out.println("(d)");
		System.out.printf("%6s\n", "Java");
		System.out.println();
		    
		System.out.println("(e)");
		System.out.printf("%-6b%s\n", (1 > 2), "Java");
		System.out.println();
		    
		System.out.println("(f)");
		System.out.printf("%6b%-8s\n", (1 > 2), "Java");
		System.out.println();
		    
		System.out.println("(g)");
		System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);
		System.out.println();
		    
		System.out.println("(h)");
		System.out.printf("%05d %06.1f\n", 32, 32.32);
	}

}
```
Above program will print the following (note that it was run on computer with Swedish locale settings for displaying numbers, might differ a bit on machines in other countries).  
```Java  
(a)
amount is 32,320000 3,232000e+01

(b)
amount is 32,33% 3,2320e+01

(c)
 false

(d)
  Java

(e)
false Java

(f)
 falseJava    

(g)
312 342 315 562,9

(h)
00032 0032,3
```  
