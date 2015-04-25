# Checkpoint Answers Chapter 9 #
## 9.1 ##
Objects of the same type are defined using a common class. A class is a template, blueprint, or contract that defines what an object’s data fields and methods will be.  

An object is an instance of a class. It is possible to create many instances of a class.  

## 9.2 ##
A class is defined by the use of the class keyword followed by the name of the class. For example:
```Java  
public class MyClass {  
	// constructors, class variables, and methods goes here  
}  
```  

## 9.3 ##
A reference variable for an object is declared by the use of the class name followed by the name of the object. For example:  
```Java  
MyClass mc;  
```  

## 9.4 ##
The new keyword in combination with a class constructor is used to create an object. For example:  
```Java  
MyClass mc = new MyClass();  
```  

## 9.5 ##
Constructors are special methods that are used to create objects of an class.  

An ordinary method will have a return type but constructors does not, not even void.  

## 9.6 ##
A default constructor, is provided automatically only if no constructors are explicitly defined in the class.  

## 9.7 ##
The member access operator, also known as the dot-operator, is used to access data fields or invoke methods on an object.  

## 9.8 ##
An anonymous object does not have any reference variable referencing it. These type of objects have short life time and will go away immediately after doing its assigned task.  

## 9.9 ##
A NullPointerException will occur when trying to use a reference that points to no location in memory (null) as though it were referencing an object.  

## 9.10 ##
An array is an object. An array can hold elements that are themself objects. The default values of elements in an array will be the same as the data fields of ordinary objects:
- 0 for numeric primitive types  
- false for boolean  
- '\u0000' for char  
- null for elements that are objects  

## 9.11 ##
**(a)**
```Java  
public class ShowErrors {

	public static void main(String[] args) {
		ShowErrors t = new ShowErrors(5);
	}

}
```
This code is incorrect because there is no constructor available that takes an int.  

**(b)**
```Java  
public class ShowErrors {

	public static void main(String[] args) {
		ShowErrors t = new ShowErrors();
		t.x();
	}

}
```
This code is incorrect because there is no member method called x in the ShowErrors class.

**(c)**
```Java  
public class ShowErrors {

	public void method1() {
		Circle c;
		System.out.println("What is radius " + c.getRadius());
		c = new Circle());
	}

}
```
This code will cause a NullPointerException at runtime because c is used in the print statement before it is created.

**(d)**
```Java  
public class ShowErrors {

	public static void main(String[] args) {
		C c = new C(5.0);
		System.out.println(c.value);
	}
	
}

class C {
	int value = 2;
}
```
This code is incorrect because the class C have no constructor that takes a double as argument.  

## 9.12 ##
The problem with the code in this check point is that an object is constructed with a default constructor that takes no arguments. But there is no such constructor for the class A.  

There is always a default constructor, that takes no arguments, as long as we do not provide any constructor of our own. But as soon as we add one or more constructors in the code so is this default constructor removed.  

## 9.13 ##
Member variables of type boolean get the default value false so the code in this check point will result in the output:  
```
false  
```  

## 9.14 ##
A Date object is created like this:  
```Java  
java.util.Date date = new java.util.Date();  
```  

The current time (including the date) can be displayed by the use of the toString method: 
```Java  
System.out.println(date.toString());
```  

## 9.15 ##
A Point2D is created by using a constructor that takes an x-coordinate and a y-coordinate, like this:
```Java  
double x = 4.0;  
double y = 5.5;  
Point2D p = new Point(x, y);  
```  

There is a member method called distance in the Point2D class that can be used to get the distance between two points.  
```Java  
double d = p1.distance(p2));	// get distance between p1 and p2
```  

There is a member method called midpoint in the Point2D class that can be used to get the point between two points.  
```Java  
Point2D mp = p1.midPoint(p2)); 
```  
