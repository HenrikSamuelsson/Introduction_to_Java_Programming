# Checkpoint Answers Chapter 4 #
**4.1**  
**(a)**  
```  
Math.sqrt(4)   // 2.0  
```  
**(b)**  
```  
Math.sin(2 * Math.PI)    // -2.4492935982947064E-16  
```  
**(c)**  
```  
Math.cos(2 * Math.PI)    // 1.0  
```  
**(d)**
```  
Math.pow(2, 2)    // 4.0  
```  
**(e)**  
```  
Math.log(Math.E)   // 1.0  
```  
**(f)**  
```  
Math.exp(1)    // 2.718281828459045  
```  
**(g)**  
```  
Math.max(2, Math.min(3, 4))    // 3  
```  
**(h)**  
```  
Math.rint(-2.5)    // -2.0  
```  
**(i)**  
```  
Math.ceil(-2.5)    // -2.0  
```  
**(j)**  
```  
Math.floor(-2.5)    // -3.0   
```  
**(k)**  
```  
Math.round(-2.5f)   // -2  
```  
**(l)**  
```  
Math.round(-2.5)    // -2  
```  
**(m)**  
```  
Math.rint(2.5)    // 2.0  
```  
**(n)**  
```  
Math.ceil(2.5)    // 3.0  
```  
**(o)**  
```  
Math.floor(2.5)    // 2.0  
```  
**(p)**  
```  
Math.round(2.5f)    // 3  
```  
**(q)**  
```  
Math.round(2.5)    // 3    
```  
**(r)**  
```  
Math.round(Math.abs(-2.5))   // 3  
```  

**4.2**  
The argument for trigonometric methods is an angle in radians.  

**4.3**
```Java  
// convert 47 degrees to radians  
double angle = Math.toRadians(47);  
```  

**4.4**  
```Java  
// convert pi / 7 radians to degrees  
double angle = Math.toDegrees(Math.PI / 7);  
```  

**4.5**  
**(a)**  
```Java  
int i = 34 + (int)(Math.random() * 22);  
```  
**(b)**  
```Java  
int j = (int)(Math.random() * 1000);
```  
**(c)**  
```Java  
double k = 5.5 + (int)(Math.random() * 50);  
```  

**4.6**  
There is one package that is automatically imported into any Java program, this package is called java.lang.  

One of the classes that belongs to the java.lang package is the Math class. This means that the Math methods can be used directly without the need for explicit import.  
 
**4.7**  
```Java  
Math.log(Math.exp(5.5));    // evaluates to 5.5  
```  
```Java  
Math.exp(Math.log(5.5));    // evaluates to 5.5  
```		
```Java  
Math.asin(Math.sin(Math.PI / 6));    // evaluates to 0.5235987755982988 = pi / 6  
```  
```Java  
Math.sin(Math.asin(Math.PI / 6));    // evaluates to 0.5235987755982988 = pi / 6  
```  
