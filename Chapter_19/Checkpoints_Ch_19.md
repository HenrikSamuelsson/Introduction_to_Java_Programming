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
