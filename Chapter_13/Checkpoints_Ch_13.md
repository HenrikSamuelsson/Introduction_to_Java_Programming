# Checkpoint Answers Chapter 13 #
## 13.1 ##
**(a)**
```Java    
class A {
	abstract void unfinished() {
	}
}
```  
Not legal code because an abstract method have a body. Another problem is that A is not abstract but it contains an abstract method.  

**(b)**  
```Java
public class abstract A {
	abstract void unfinished();
}
```
Not legal because the first use of the abstract keyword is misplaced, shall be placed before the keyword class.   

**(c)**  
```Java
class A {
	abstract void unfinished();
}
```
Not legal, the class must be abstract if the method shall be abstract.  

**(d)**  
```Java
abstract class A {
	protected void unfinished();
}
```
Not legal since there is no body for the non abstract method.  

**(e)**  
```Java  
abstract class A {
	abstract void unfinished();
}
```  
Legal code.
  
**(f)**  
```Java  
abstract class A {
	abstract int unfinished();
}
```   
Legal code.

## 13.2 ##
Abstract classes prevents a developer from instantiating the base class, because a developer has marked it as having missing functionality.  

It also provides compile-time safety so that you can ensure that any classes that extend your abstract class provide the bare minimum functionality to work, and you don't need to worry about putting stub methods that inheritors somehow have to magically know that they have to override a method in order to make it work.  

Read more at: [StackExchange - Why should I declare a class as an abstract class?](http://programmers.stackexchange.com/questions/96947/why-should-i-declare-a-class-as-an-abstract-class)  

## 13.3 ##
**(a)**  
An abstract class can be used just like a non-abstract class except that you cannot use the new operator to create an instance from the abstract class.  

**(b)**  
An abstract class can be extended.  

**(c)**  
A subclass of a non-abstract superclass can be abstract.  

**(d)**  
A subclass can override a concrete method in a superclass to define it as abstract.  

**(e)**  
An abstract method cannot be static.  

## 13.4 ##
There will be an attempt, at runtime, to create a Double object out of an Number object. But this will not work because the Number object is in based on an Integer object.  

## 13.5 ##
The code from this checkpoint will fail at runtime because a Double object is attempted to be stored where an Integer object is supposed to be stored.  

## 13.6 ##
```Java  
public class Test {
	public static void main(String[] args) {
 		Number x = 3;
 		System.out.println(x.intValue());
		System.out.println(x.doubleValue());
 	}
}
```  
The above code will output:  
```  
3  
3.0  
``` 
 
## 13.7 ##
The problem with the code in this checkpoint is that x is of type Number and the method compareTo(Integer) is undefined for the type Number.  

## 13.8 ##
This checkpoint is about the same code that was discussed in checkpoint 13.7. The problem with the code is now tried to be fixed with a cast. There is however a mistake made when introducing the cast. A corrected working version can be seen below.  
```Java  
public class Test {
	public static void main(String[] args) {
		Number x = new Integer(3);
		System.out.println(x.intValue());
		System.out.println(((Integer) x).compareTo(new Integer(4)));
	}
}
```  
## 13.9 ##
It is not possible to create an Calendar object using the Calendar class. This is so because Calendar is an abstract class.  

## 13.10 ##
The add method in the Calendar class is abstract.  

## 13.11 ##
A calendar set to the current time can be created in the following way.  
```Java  
Calendar calendar = new GregorianCalendar();  
```  

## 13.12 ##
```Java  
// c is a Calendar instance  
c.get(Calendar.YEAR)	// get the year  
c.get(Calendar.MONTH)	// get the month  
c.get(Calendar.DATE)	// get the date  
c.get(Calendar.HOUR)	// get the hour  
c.get(Calendar.MINUTE)	// get the minute  
c.get(Calendar.SECOND)	// get the second  
```  

## 13.13 ##
Suppose A is an interface. It is then **not** possible to create an instance using `new A()`.  

## 13.14 ##
Suppose A is an interface. It is then possible to declare a reference variable x with type A.  
```Java  
A x;	// valid code  
```  

## 13.15 ##
**(a)**  
```Java  
interface A {
	void print() { };
}
```  
The above interface is not correct because the (implicitly) abstract member method have an body.  

**(b)**  
```Java  
abstract interface A extends I1, I2 {
	abstract void print() {};
}
```  
The above interface is not correct for exactly the same reason as in (a). Note A can extend I1 and I2 assuming that these are them self interfaces.   

**(c)**  
```Java  
abstract interface A {
	print();
}
```  
The above interface is not correct because the return type of the method is missing.  

**(d)**  
```  
interface A {
	void print();
}  
```  
The above is a valid interface.  

## 13.16 ##
The problem with the code is that the public specifier is missing. The class B shall look like this:  
```Java  
public class B implements A {
	public void m1() {
		System.out.println("m1");
	}
}
```  
All methods defined in an interface are public. This means that when a class implements the interface so must all methods be declared public. The visibility cannot be reduced afterwards.  

## 13.17 ##
If a class implements Comparable so can the object of the class invoke the compareTo method.  

## 13.18 ##
The correct method header for the compareTo method in the String class is:
```Java  
public int compareTo(String o)  
```  

## 13.19 ##
```Java  
Integer n1 = new Integer(3);  
Object n2 = new Integer(4);  
System.out.println(n1.compareTo(n2));  
```  
The above code will not compile because the method compareTo(Integer) in the type Integer is not applicable for the arguments (Object).  

## 13.20 ##
By implementing the Comparable interface for a class so can objects of the class be passed to a method that requires a Comparable type. This would not be possible by just implementing a member method called compareTo.    

## 13.21 ##
The code in this checkpoint will not work because the class tries to use the sort method but this will only work if the compareTo method from the Comparable interface is present. Having the class Person implement the Comparable interface would fix the problem.  

## 13.22 ##
A precondition for for invocation of the `clone()` method to clone an object is that the class of the object implement the interface `java.long.Cloneable`.  

The `Date` class implements `Cloneable`.  

## 13.24 ##
The object called `date1` is a shallow copy of the object `date`. The object called `date2` is on the other hand a deep copy of `date`.

This means that `date == date1` will evaluate to true but `date == date2` will evaluate to false. 

`date.equals(date2)` will evaluate to true.  

The output of the code in this checkpoint will hence be:  
```
true  
false  
true    
```  

## 13.25 ##
`list1` is just a shallow copy of `list` so any changes made to `list` will affect the content of `list1`.  

`list2` is a deep copy of `list` constructed by cloning `list`. Following changes of `list` will hence not affect `list2`.

Output when running the code from this checkpoint will be:  
```  
true
false
list is [New York, Atlanta]
list1 is [New York, Atlanta]
list2.get(0) is New York
list2.size() is 1
```  

## 13.26 ##
The problem is that `clone()` is not visible when y shall be defined.  

Override `clone()` and make it public, and have the class `GeometricObject` implement `Java.lang.Cloneable` to fix this problem.  

## 13.27 ##
One major advantage with interfaces is that a class can can only inherit from one superclass but it can extend multiple interfaces.  

Say that we have the interfaces:
- AirConditioning  
- Light  
- Door  
- Lock  
- Radio  
- Speedometer  

Then assume that we have the classes House, Car, Bicycle. All these classes could then possible implement several of the above interfaces but likely not all. A Bicycle will for example probably have a lights and a lock but not a door.  

Interfaces makes it possibly to bind things that are less tightly bound to an Object. Things that can be applied in multiple different situations.  

## 13.28 ##
An abstract class is a class that is declared with the keyword abstract, it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be sub-classed.  

An interface is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.  

Stole this part from the [The Java Tutorials - Abstract Method and Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html) that discusses the differenses between intefacees and abstract classes.  
> Abstract classes are similar to interfaces. You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation. However, with abstract classes, you can declare fields that are not static and final, and define public, protected, and private concrete methods. With interfaces, all fields are automatically public, static, and final, and all methods that you declare or define (as default methods) are public. In addition, you can extend only one class, whether or not it is abstract, whereas you can implement any number of interfaces.  

## 13.29 ##
**(a)**  
An interface is compiled into a separate bytecode file.  
**(b)**  
An interface can not have static methods.  
**(c)**  
An interface can extend one or more interfaces.  
**(d)**  
An interface cannot extend an abstract class.  
**(e)**  
An abstract class can extend an interface.  

## 13.30 ##
A rational number with the value -2 / 6 = -1 / 3 is created. The numerator is -1 and the denominator is 3. The integer representation will be truncated to 0. The double representation will be -0.333333333...

The output of the code in this checkpoint will be:  
```  
-1  
3  
0  
0.333333333333  
```  
## 13.31 ##
The problem is that r2 is of type Object and this type of class does not have a method called compareTo.  

## 13.32 ##
The problem is that the parameter for the compareTo method is of the wrong type. Shall be of type Rational but r1 is of type Object.  



