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
