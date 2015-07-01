# Checkpoint Answers Chapter 17 #
## 17.1 ##
A text file can be thought of as a sequence of characters and a binary file can be thought of as a sequence of bits. 

Take for example the number 199 that will in a text file be stored as '1','9','9' but with each character coded according to some standard such as the Unicode standard or the ASCII standard.  

If 199 is stored as binary so will it instead be stored in some form of hex format possibly as 0xC7.  

## 17.2 ##
Common classes to use when reading or writing file data are Scanner and PrintWriter.  
```Java  
// Reading from temp.txt  
Scanner input = new Scanner(new File("temp.txt"));  
System.out.println(input.nextLine());  
input.close();  
```  
```Java  
// Writing to temp.txt  
PrintWriter output = new PrintWriter("temp.txt");  
output.print("Java 101");  
output.close();  
```  

## 17.22 ##
A File object is used to check if a file exists.  
```Java  
File sourceFile = new File("temp.bin");  
if (sourceFile.exists())  
	System.out.println("File temp.bin exists.");  
else  
	System.out.println("File temp.bin does not exist.");  
```  

## 17.23 ##
The read method will return -1 when the end of a file is reached.  
```Java  
if (r = input.read()) == -1)  
	System.out.println("No more data to read in the file.");  
```  
