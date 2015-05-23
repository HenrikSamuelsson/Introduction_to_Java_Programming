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
```Java  
super.method()  
```

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
Using the @Override annotation will take advantage of the compiler checking that makes sure that there is an actual overriding of an existing method. This check will catch mistakes of misspelling a method name or not correctly matching the parameters.  

Another benefit is that this annotation functions as documentation, making the intention of the code easier to understand.  

## 11.17 ##
A good definition of polymorphism can be found in [The Java Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html "The Java Tutorials").
> The dictionary definition of polymorphism refers to a principle in biology in which an organism or species can have many different forms or stages. This principle can also be applied to object-oriented programming and languages like the Java language. Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class.  

When an method is overridden in subclass so is it up to the JVM to figure out at runtime which specific method to invoke. This concept is called dynamic binding.  

## 11.18 ##
Method matching is the process of deciding what version of an overloaded method to invoke. This is done at compile time by the compiler and the choice is based on the signature of the overloaded methods.  

Method binding is the process of finding the method to invoke when using inheritance. A method may be implemented in several classes part of an inheritance chain. The JVM dynamically binds the implementation of the method at runtime, decided by the actual class of the object referenced by the variable.  

## 11.19 ##
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
(circle instanceof Circle)			// true  
(object instanceof Circle)			// false  
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

## 11.30 ##
**(a)**
Creation of an ArrayList for storing double values:  
```Java  
ArrayList <Double> doubleList = new ArrayList<>();
```  

**(b)**  
Append an on object to a list:
```Java  
doubleList.add(5.0);
```  

**(c)**  
Insert an object at the beginning of the list:
```Java  
doubleList.add(0, 1.0);	// index 0 is the start of the list
```  

**(d)**  
Number of objects in the list:
```Java  
doubleList.size();    
```  

**(e)**  
Removal of a given object in the list:
```Java  
doubleList.remove(5.0);	// removes the first occurence found of 5.0 in the list
```  

**(f)**  
Removal of the last element in the list:
```Java  
doubleList.remove(doubleList.size() - 1);
```  

**(g)**  
Check whether a given element is in the list:
```Java  
doubleList.contains(1.0);	// checks if the number 1.0 is in the list
```  

**(h)**  
Retrieve an object at a specified index in the list:   
```Java  
doubleList.get(0);	// returns what the first element in the list is
```  

## 11.31 ##
There are multiple issuses with the below code.
```Java  
ArrayList<String> list = new ArrayList<>();
list.add("Denver");
list.add("Austin");
list.add(new java.util.Date());
String city = list.get(0);
list.set(3, "Dallas");
System.out.println(list.get(3));
```  
A Date object is attempted to be added to the ArrayList, this will not work because the list is setup to hold String objects.  

Index 3 is attempted to be set to Dallas but it will not be possible since the list only holds two elements when this statement is executed at runtime.  

An attempt to get the element at index 3 is done. This will not work because there is no element at this location when this statement is executed at runtime.  

## 11.33 ##
What happens is that the method with the signature    
```Java  
remove(int index)  
```  
is called with the argument 1. This will remove the value at index 1, the value 2 is stored here so this will be removed.  

If instead the value 1 shall found int the list and be removed so can the method with the signature  
```Java  
remove(Object)
```   
be called by writing like this
```Java  
remove(new Integer(1));
```  

## 11.34 ##
```Java  
ArrayList<Double> list = new ArrayList<>();
list.add(1);
```  
The above code will not work because the add function takes an Double Object as argument but an int is provided. There is no auto boxing from int to Double so the code will not compile.  

The code can be fixed by writing like this
```Java  
list.add(1.0);
```  
or like this  
```Java  
list.add(new Double(1));  
```  

## 11.35 ##
The asList method does not support primitive types and there is no autoboxing for arrays. This is why the code from the book does not work. A corrected version is shown below.  
```Java  
Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};  
ArrayList<Integer> list = new ArrayList<(Arrays.asList(array));  
```  

## 11.36 ##
The max method in the Collections class can not be used with an array as argument. The array need to be converted to an ArrayList that is an type allowed to be used as an argument.  
```Java  
Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
ArrayList<Integer> list = new ArrayList<(Arrays.asList(array));
System.out.println(java.util.Collections.max(list));
```  

## 11.37 ##
A class can by default access another class in the same package, but classes outside of the package will not be able to access it by default. This means that if this is the desired level of visibility so shall the accessibility modifier simply be omitted.  

## 11.38 ##
The keyword protected is used as an accessibility modifier to setup so that a class in a different package cannot access the class, but its subclasses in any package can access it.  

## 11.39 ##
If the question marks are replaced by blanks, can class B be compiled? Yes, default access means visibility between classes in the same package.  
    
If the question marks are replaced by private, can class B be compiled? No, private means that the int called i and the method called m can only be used from within the class.  

If the question marks are replaced by protected, can class B be compiled? Yes, B inherits from A so B can used protected members from A.  

## 11.40 ##
If the question marks are replaced by blanks, can class B be compiled? No, B is not in the same package as A so if i and m from class A will not be visible to B if default access is set.  

If the question marks are replaced by private, can class B be compiled? No, i and m will not be visible outside of class A if they are set to private.  
 
If the question marks are replaced by protected, can class B be compiled? Yes, B inherits from A so there is no problem to access protected variables in A.  

## 11.41 ##
The keyword final is used to prevent classes from being extended. It is also used to prevent methods form being overridden.  

## 11.42 ##
**(a)**  
True.  

**(b)**  
False, only true if the subclass extends the class with the protected members.  

**(c)**  
True.  

**(d)**  
True.  

**(e)**  
False.  

**(f)**  
False.  


