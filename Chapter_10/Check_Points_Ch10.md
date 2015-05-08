# Checkpoint Answers Chapter 10 #
## 10.1 ##
The Loan class would not be made immutable just by removing the setter methods. The getLoanDate method would still return a reference to an object and this reference could be used to change parts of the Loan class.  

## 10.2 ##
The BMI class is immutable. There are no setter methods, and there is only possible to get references to String objects which is a type of object that is immutable.

## 10.3 ##
The relationship among classes is often divided into four different groups based on characteristics of the relation. The name of these groups are:  
1. Inheritance  
2. Aggregation  
3. Association  
4. Composition  

## 10.4 ##
Aggregation implies a relationship where the child can exist independently of the parent. Example: Class (parent) and Student (child). Delete the Class and the Students still exist.  

Composition implies a relationship where the child cannot exist independent of the parent. Example: House (parent) and Room (child). Rooms don't exist separate to a House.  

Association is a weaker form of relationship that indicates that a class uses another class by parameter or return type.  

## 10.5 ##
The UML notation for aggregation is an unfilled diamond symbol at the owner (aggregation) class. Composition is indicated in the same way but with a filled diamond symbol.  

## 10.6 ##
Aggregation and composition are closely related. Hence so are they usually not differentiated in the book. Both are called composition for simplicity.  

## 10.7 ##
A wrapper class is one of eight classes provided in the java.lang package to provide object methods for the eight primitive types. Wrapper classes are used to represent primitive values when an Object is required. All of the primitive wrapper classes in Java are immutable.  

## 10.10 ##
An Integer is created that will have the value 3. The value is then printed so 3 will be printed. The value 3 is then compared to 4 which will return -1. The result of the comparison is then also printed.  

The printed output will hence be:  
```  
3  
-1  
```
  
## 10.11 ##
No extra parameter means that the number will be interpreted as a decimal number. Extra parameter in the form of 10 also means that decimal interpretation. Extra parameter in the form of 16 means that the number will be interpreted as being written with hexadecimal base.  
```   
10  
10  
16  
11  
11  
17  
```  

## 10.12 ##
Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. 

The opposite automatic conversion of an object of a wrapper type to its corresponding primitive value is called unboxing.

The following are all valid examples of autoboxing and unboxing:  
```  
Integer x = 3 + new Integer(5);
Integer x = 3;
Double x = 3.0;  
int x = new Integer(3);
int x = new Integer(3) + new Integer(4);
```  
This example is not valid because the types does not match up in the correct way:    
```  
Double x = 3;  
```  
But it can be fixed by introduction of a cast:  
```  
Double x = (double) 3;   
```  

## 10.13 ##
A cast will be used to convert the double into an int int the first print, the decimal part will be truncated away.

3.5 is less than 4.5 so the compareTo method will return -1.

The output will hence be:  
```  
3  
-1  
```

## 10.14 ##
The output will be:  
```  
x is 3  
y is 7  
z is 10  
```  

## 10.15 ##
Assume the we create strings in the following way:  
```Java  
String s1 = "Welcome to Java";  
String s2 = s1;  
String s3 = new String("Welcome to Java");  
String s4 = "Welcome to Java";  
```  
The results of the following expressions is indicated by comments in the code.  
```Java  
s1 == s2	// true, both variables will reference the same object  
s1 == s3	// false, same content but not the same objects  
s1 == s4	// true, an interned string
s1.equals(s3)	// true
s1.equals(s4)	// true
"Welcome to Java".replace("Java", "HTML")	// Welcome to HTML
s1.replace("o", "T")	// WelcTme tT Java
s1.replaceAll("o", "T")	// WelcTme tT Java
s1.replaceFirst("o", "T")	// WelcTme to Java
s1.toCharArray()	// an array holding the characters in the string "Welcome to Java"
```  

## 10.14 ##
There are two ways to create a String:  
```Java  
String s = "Welcome to Java";
```
```Java  
String s = new String("Welcome to Java");
```  
The first one is better because it creates an interned String that will be shared if more strings with the same value are created later on. This will save memory and be faster because using the new operator is expensive.  

## 10.26 ##
The main difference between StringBuffer and StringBuilder is that StringBuffer is synchronized and StringBuilder is not.   

This means that StringBuilder will be faster but it can not be used if two or more threads needs to share it.  

