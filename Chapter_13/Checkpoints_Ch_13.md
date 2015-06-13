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
