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
