# Checkpoint Answers Chapter 4 #
**4.1**  
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

**4.2**  
The argument for trigonometric methods is an angle in radians.  

**4.3**
```Java  
// convert 47 degrees to radians  
double angle = Math.toRadians(47);  
```  

**4.4**  
```Java  
// convert pi / 7 radians to degrees  
double angle = Math.toDegrees(Math.PI / 7);  
```  

**4.5**  
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

**4.6**  
There is one package that is automatically imported into any Java program, this package is called java.lang.  

One of the classes that belongs to the java.lang package is the Math class. This means that the Math methods can be used directly without the need for explicit import.  
 
**4.7**  
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
**4.8**  
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

**4.9**  
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

**4.10**  
```Java  
System.out.println('\\');	// prints \
System.out.println('"');	// prints "
```  

**4.11**  
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

**4.12**  
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

**4.13**
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

**4.14**  
```Java  
// c will become a lower case character in the range a to z  
char c = (char)(97 + Math.random() * 26);  
```  
