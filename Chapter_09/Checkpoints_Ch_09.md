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
The problem with the code in this checkpoint is that an object is constructed with a default constructor that takes no arguments. But there is no such constructor for the class A.  

There is always a default constructor, that takes no arguments, as long as we do not provide any constructor of our own. But as soon as we add one or more constructors in the code so is this default constructor removed.  

## 9.13 ##
Member variables of type boolean get the default value false so the code in this checkpoint will result in the output:  
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

## 9.16 ##
The class Date and the class Random are included in the java.util package.    

The class Point2D is included in the javafx.geometry package.  

The class System and the class Math are included in the java.lang package.  

Note that there are different versions of the above classes from different versions of Java so it is possible to find more or less similar classes with the same names in other packages.  

## 9.17 ##
Suppose that we have a class called F that looks like this:  
```Java  
public class F { 
	int i:
	static String s;
    
	void imethod() {
	}

	static void smethod() {
	}
```  
Then suppose that we have f that is an instance of F. The following statements are then legal:
```Java  
System.out.println(f.i);
System.out.println(f.s);
f.imethod();
f.smethod();
System.out.println(F.s);
F.smethod();
```  
But the following statements are illegal because instance members cannot be used without an actual  instance of the class.  
```Java  
System.out.println(F.i);  
F.imethod();
```  

## 9.18 ##
```Java  
public class Test { 
	int count; 
	
	public static void main(String[] args) { 
		// ...
	}
	
	public int getCount() { 
		return count;
	}
	 
	public static int factorial(int n) { 
		int result = 1;
		for (int i = 1; i <= n; i++)
  			result *= i; 
	return result;
	}

}
```  

## 9.19 ##
It is not possible to invoke an instance method or reference an instance variable from a static method.  

It is possible to invoke a static method or reference a static variable from an instance method.  

There are two problems with the code from this checkpoint. First problem is that method1 cannot be invoked inside main becaus main is static and method1 is not defined as static. Second problem is that c is not accessible from method2 because c is not static. 

(There is a third problem regarding that the class Circle is not defined or imported but we ignore this.)  
  
## 9.20 ##
An accessor method is used to get private data from from an object.  

A mutator method is used to set private data in an object.  

The naming convention for accessor methods is getDataFieldName for non-boolean values and isDataFieldName for boolean values.  

The naming convention for mutator method is setDataFieldName.  

## 9.21 ##
Benefits of encapsulation:  
- The fields of a class can be made read-only or write-only.  
- A class can have total control over what is stored in its fields.  
- The users of a class do not know how the class stores its data. A class can change the data type of a field and users of the class do not need to change any of their code.  

## 9.22 ##
There is no problem with the code from this checkpoint. It is possible to access the private variable because it is done from within the class.  

## 9.23 ##
Primitive types are copied when passed as a parameter to a method. This means that the method that takes the value will work with a copy and there can be an original value that is guaranteed to be unaltered no matter what the method does with the parameter.  

Reference types are not copied when passed as a parameter to a method. Instead so will a reference to the location in the memory be copied and given as parameter to the method. This reference is then used inside the method to look up the object. This means that if the method writes to the object so will these changes affect the object also in the scope outside of the method.  

The output of the program in this checkpoint will look like this:  
```  
count 101
times 0
```  
The myCount object is sent as a reference and will be altered also outside of the method but times is copied and the changes will not be noticed outside of the method.  

## 9.24 ##
Output:  
```  
After swap1: circle1 = 1.0 circle2 = 2.0  
After swap2: circle1 = 2.0 circle2 = 1.0  
```  
The method called swap1 does not work as intended. This is because the swap is done on references to the circle objects that are copies of the references outside of the method. This means that the swap works inside the method but the original references used when printing afterwards have not been swapped.  

## 9.25 ##
**(a)**  
```  
a[0] = 1 a[1] = 2
```  
Pass by value so no swap outside of the method.  
  
**(b)**  
```  
a[0] = 2 a[1] = 1
```  
The parameter will be a reference to the array so will swap also outside of the method.  

**(c)**  
```  
e1 = 2 e2 = 1
```  

**(d)**  
```  
t1's i = 2 and j = 1
t2's i = 2 and j = 1
```  
The member i is static so it is shared between all T instances and increased each time an instance is created. The member j is unique for each instance.  

## 9.26 ##
**(a)**  
```  
null
```  
A new Date instance is created in m1 but date outside of m1 is never set to reference this variable.  

**(b)**  
```  
1234567
```  
Almost the same situation as in part (a). There are two different references called date that will reference two different Date instances.  

**(c)**  
```  
7654321
```  
There is only one Date instance this time and it is altered in m1.  

**(d)**  
```  
1234567
```  
Again two different references variables, both called date. The one local to m1 is set to null in m1 but this will not affect the one outside in main.  

## 9.26 ##
The problem with the code in this checkpoint is that no Date instances are being created. All that is created is an array that can be used to store 10 dates. The first element in the array is then accessed but it will be null since there is nothing there yet.  

## 9.28 ##
There are three requirements that must be met for a class to be immutable:  
1. All data fields shall be private.
2. There can not be any mutator methods for the data fields.
3. No methods is allowed to return a reference to a data field that is mutable, because this reference could be use to make changes.   

## 9.29 ##
A class where all the data field are private and of primitive types, and the class does not contain any setter methods, implies that the class is immutable.  

## 9.30 ##
The following class is not immutable.  
```Java  
public class A {
	private int[] values;
	
	public int[] getValues() {
		return values;
	}
}
```  
The reason for the class not being immutable is that the method getValues returns a reference that can be used to alter the content of the member variable called values.  

## 9.31 ##
The output will be:  
```
i + j is 23
k is 2
j is 0
```
The first line of output will use the variable i from main and the local variable j that is 2. The plus will in this case be interpreted as string concatenation instead of arithmetic addition.  

The second line of output is based on the i from main and the static class variable called j.  

The third line of output is based on the static class variable called j.  

## 9.32 ##
Within an instance method or a constructor, this is a reference to the current object — the object whose method or constructor is being called. You can refer to any member of the current object from within an instance method or a constructor by using this.  

## 9.33 ##
There are some problems with the following code:  
```Java
public class C {
	private int p;
	
	public C() {
		System.out.println("C's no-arg contstructor invoked");
		this(0);
	}
	
	public C(int p) {
		p = p;
	}
	
	public void setP(int p) {
		p = p;
	}
}  
```
A constructor call must be the first statement in a constructor. There are two assignments where p is assigned to p which have no effect.  

A corrected version of the code looks like this:    
```Java  
public class C {
	private int p;
	
	public C() {
		this(0);
		System.out.println("C's no-arg contstructor invoked");
	}
	
	public C(int p) {
		this.p = p;
	}
	
	public void setP(int p) {
		this.p = p;
	}
}
```  
Another strange thing with this class is that p is never ever used for anything buts lets ignore this and move on in life.  

## 9.34 ##
The problem is that m2 tries to set the member called id by using the class directly. This will not work since we must use an instance of the class instead of the class itself.  

The code would work if the member id was declared as static. But then it would only be one id for all instances which is probably not the intention.
