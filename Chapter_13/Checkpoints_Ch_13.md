# Checkpoint Answers Chapter 13 #
## 1 ##
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

Read more at:[stackexchange - Why should I declare a class as an abstract class?](http://programmers.stackexchange.com/questions/96947/why-should-i-declare-a-class-as-an-abstract-class)  
