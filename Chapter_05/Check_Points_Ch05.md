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

**5.8**  
```Java  
for (int i = 0; i < 10; ++i) {  
	sum += i;
}
```  
```Java  
for (int i = 0; i < 10; i++) {  
	sum += i;
}
```  
The above two loops will result in the same value in sum. This is so because the control variable i will have identical value, when used in the loop-continuiation-condition, regardless of ++i or i++ is used to increment i.  

**5.9**  
The three parts usually present in a for loop control section are  
1. Initial action used to initialize control variables.  
2. Loop continuation condition that controls if the body of the loop will run or not, will usually be based on the control variables.  
3. After iteration action which usually will alter the value of the control variable.  

A loop that prints the numbers for 1 to 100:  
```Java  
for (i = 1; i <= 100; i++) {
	System.out.println(i);
}
```  

**5.10**  
```Java  
import java.util.Scanner;

public class CheckPoint_05_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, sum = 0, count;
		for (count = 0; count < 5; count++) {
			number = input.nextInt();
			sum += number;
		}
		System.out.println("sum is " + sum);
		System.out.println("count is " + count);
	}
	
}
```  
The program in this check point will sum integers until the control variable in the loop reaches the value five 5. This means that if the input to the program is  
```
2 3 4 5 0  
```  
so will the output be  
```  
sum is 14  
count is 5
```  

