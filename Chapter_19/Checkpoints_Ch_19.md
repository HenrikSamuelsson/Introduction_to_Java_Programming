# Checkpoint Answers Chapter 19 #
## 19.1 ##
**(a)**  
The below code will compile, but will fail at runtime.
```Java  
ArrayList dates = new ArrayList();
dates.add(new Date());
dates.add(new String());
```  

**(b)**  
The below code will not compile. The compiler will spot that a String is added to a list of Date objects.
```Java  
ArrayList<Date> dates =
new ArrayList<>();
dates.add(new Date());
dates.add(new String());
```  
## 19.4 ##
The generic definition for `java.lang.Comparable` in the Java API.
```Java  
package java.lang;  

public interface Comparable<T> {
	public int compareTo(T o) { }
}
```  

## 19.6 ##
A generic class can have multiple generic parameters.  

## 19.8 ##
A generic method is declared by placing the generic type immediately after the keyword static in the method.  

Example:  
```Java  
public static <T> void print(T[] list) {
	for (int i = 0; i < list.length; i++)
		System.out.print(list[i] + " ");
	System.out.println();
}
```  
A generic method can be invoked just like a regular method. The compiler will figure out the actual type.  

Example:  
```Java  
String[] strings = {"London", "Paris", "New York", "Austin"};  
print(strings);  
```  

## 19.9 ##
A bounded generic type specifies that the accepted generic types must be subclasses of a given class.  

