# Checkpoint Answers Chapter 5 #
**5.1**  
The condition count < 100 is always true at point A.  

The condition count < 100 can be both true and false at point B.  

The condition count < 100 is always false at point C.  

**5.2**  
The problem with initializing guess to zero is that the number that shall be guessed will sometimes be zero. This will cause the while to not even run one iteration and the player will never get to guess the number.  

**5.3**  
**(a)**  
The loop body will be run an infinite number of times. There will be no output because i is 1 all the time.

**(b)**  
The loop body will be run an infinite number of times. There will be no output because i is 1 all the time.

**(c)**  
The loop body will be run nine times and the output will be:  
```Java  
3  
5  
7  
9  
```  

**5.4**  
The variable max will hold the largest number entered and number will hold the last number entered so the output will be:  
```Java  
max is 5  
number 0  
```  

**5.5**  
This program will start with x equal to 80000000 and x is then increased by one again and again until it overflows after reaching 2147483647, x will be -2147483648 after the overflow. The while loop will now terminate and the output will be:  
```Java  
x is -2147483648  
```  

**5.6**  
The program in this check point will take numbers as input and keep track of the biggest number in the variable called "max". The last entered number is stored in the variable called "number".  

The output when running the program with the input  
```
2 3 4 5 0  
```  
will be:  
```  
max is 5  
number 0  
```   

**5.7**  
A do-while loop will always execute the body of the loop at least one time, this is not true for a while loop.  

The code from the check point rewritten using a do-while loop:  
```Java  
Scanner input = new Scanner(System.in);
int sum = 0;
int number;
do {
	System.out.println("Enter an integer (the input ends if it is 0)");
	number = input.nextInt();
	sum += number;
} while (number != 0);
```  
