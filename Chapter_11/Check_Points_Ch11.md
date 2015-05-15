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

## 11.6 ##
The no-arg constructor of a superclass will not be called if another constructor is called explicitly by the subclass.  

## 11.7 ##
It is not possible to override a method that is declared private in the superclass.  

## 11.8 ##
It is not possible to override a static method defined in a superclass.  

It is still possible to have another static method, with the same name, in a subclass but this method will not override the method in the superclass, it will hide it.  

This is a bit tricky read more [here](http://docs.oracle.com/javase/tutorial/java/IandI/override.html "here").  

## 11.9 ##
The keyword super is used to explicitly invoke the constructor of a superclass.  

## 11.10 ##
The keyword super in combination with the dot operator is used to invoke an overridden superclass method from a subclass.  
´´´Java  
super.method()  
´´´  

## 11.11 ##
A corrected version of the code for this checkpoint looks like this:  
```Java  
public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}

class B extends Circle {
	private double length;

	B(double radius, double length) {
		super(radius);
		this.length = length;
	}

	@Override
	public double getArea() {
		return super.getArea() * length;
	}
}
```  

## 11.12 ##
Method overloading means making multiple versions of a method based on differences in the signature.  

Method overriding means defining a new version of a method in a subclass of a superclass. Overridden methods have the same signature and return type as the original. 

## 11.13 ##
A method in a subclass that have the same signature, and same return type, as a method in its superclass is said to be overriden.  

## 11.14 ##
Having methods with the same signature but different return types in a subclass and its superclass is not allowed and will cause a syntax error.  

## 11.15 ##
A method in a subclass that have the same name as a method in its superclass but with different parameter types is said to be overloaded.  

## 11.16 ##
Using the @Ovveride annotation will take advantage of the compiler checking that makes sure that there is an actuall overriding of a method. This check will catch mistakes of misspelling a method name or not correctly matching the parameters.  

Another benefit is that this annotation functions as documentation, making the intention of the code easier to understand.  

## 11.17 ##
A good definition of polymorphism can be found in [The Java Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html "The Java Tutorials").
> The dictionary definition of polymorphism refers to a principle in biology in which an organism or species can have many different forms or stages. This principle can also be applied to object-oriented programming and languages like the Java language. Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class.  

When an method is overridden in subclass so is it up to the JVM to figure out at runtime which specific method to invoke. This concept is called dynamic binding.  

## 11.18 ##
Method matching is the process of deciding what version of an overloaded method to invoke. This is done at compile time by the compiler and the choice is based on the signature of the overloaded methods.  

Method binding is the process of finding the method to invoke when using inheritance. A method may be implemented in several subclasses. The JVM dynamically binds the implementation of the method at runtime, decided by the actual class of the object referenced by the variable.  

## 11.18 ##
It is (of course) possible to assign an array of type Object like this:  
```Java  
Object o = new Object[50];
```
Since all other classes inherits from Object so is it also possible to do assignments of the following kind:   
```Java  
Object[] o = new Integer[50];
```  
```Java  
Object[] o = new String[50];
```
It is on the other hand not possible to assign an primitive type to an Object variable this means that the following code will not compile.
```Java  
Object[] o = new int[50];	// Type mismatch: cannot convert from int[] to Object[]  
```  

## 11.24 ##
The following statement is true.     
> You can always successfully cast an instance of a subclass to a superclass.  

The following statement is false.  
> You can always successfully cast an instance of a superclass to a subclass.  

## 11.25 ##
**(a)**  
```Java  
(circle instanceof GeometricObject)		// true  
(object instanceof GeometricObject)		// true  
(circle instanceof Circle)				// true  
(object instanceof Circle)				// false  
```  

**(b)**  
The code will compile because cast from subclass to superclass is always allowed.  

**(c)**  
The code will compile but there will be runtime exception when executing the program.  

## 11.28 ##
Every object have both a toString and an equals method because these methods are defined in the class Object and all classes inherits from this class.  

Examples of how to invoke these methods:  
```Java  
object1.equals(object2)
```
```Java  
object1.toString()  
```  

The default versions of these methods are rather crude and should often be overridden in the subclass to get more useful versions.  
