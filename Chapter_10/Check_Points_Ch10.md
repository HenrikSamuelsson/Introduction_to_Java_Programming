# Checkpoint Answers Chapter 10 #
## 10.1 ##
The Loan class would not be made immutable just by removing the setter methods. The getLoanDate method would still return a reference to an object and this reference could be used to change parts of the Loan class.  

## 10.2 ##
The BMI class is immutable. There are no setter methods, and there is only possible to get references to String objects which is a type of object that is immutable.
