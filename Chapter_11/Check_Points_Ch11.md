# Checkpoint Answers Chapter 11 #
## 11.1 ##
A subclass is usually not a subset of a superclass. Subclasses will usually add functionality and details that are not present in the superclass thus extending the superclass.  

## 11.2 ##
The keyword extends is used when defining a subclass.  

For example:  
```Java  
public class MountainBike extends Bicycle {
	
	// ...
	// ...
	// ...

}
```  

## 11.3 ##
Single inheritance means that a class may only inherit from one particular class.  

Multiple inheritance is a feature of some object-oriented computer programming languages in which an class can inherit characteristics and features from more than one  parent class.  

Multiple inheritance is not supported by the Java programming language.  

## 11.5 ##
The syntax for calling a superclass constructor that takes no parameters is:  
```Java  
super();  
```  
The syntax with parameters is:  
```Java  
super(parameter list);  
```  
This will cause a call to a constructor with matching parameter list in the superclass.

Invocation of a superclass constructor must be on the first line in the subclass constructor.  

It is possible to omit the explicit call of a superclass constructor. The compiler will in this case insert a call to the no-argument superclass constructor.  
