# Checkpoint Answers Chapter 14 #
## 14.1 ##
The initial version of the GUI library was known as the Abstract Windows Toolkit (AWT). Maps Java code to each operating system's real GUI system. Limited to lowest common denominator among the supported system's.  

After AWT came another version called Swing. Paints all GUI components by itself instead of relying on the underlying operating system. 

Swing is now being replaced by a third version called JavaFX. JavaFX aims to be better suited for today's systems with for example multi-touch support.  

## 14.2 ##
Some reasons for that this book does not teach AWT or Swing:  
1. JavaFX is considered to be the easiest to learn for beginners.  
2. JavaFX is well designed, based around solid object oriented thinking.  
3. JavaFX is the GUI library is the one that is being actively developed by Oracle. Swing will not get any further updates.  

## 14.3 ##
A JavaFX main class is defined by extending the Application class.  
```Java  
public class MyJavaFX extends Application  
```  
The signature of the start method in the application class is:  
```Java  
public void start(Stage primaryStage)
```  
A Stage is a construct that functions as a base window for JavaFX content. An application can have multiple Stages.

A Stage object called primary stage is automatically created by the JVM when the application is launched.

A Stage object is displayed by invoking the show method.    
```Java  
Stage stage = new Stage();  
  
// ...  
// setup of the stage here  
// ...  

stage.show();  
```  
It is possible to prevent the user from resizing a stage.
```Java  
stage.setResizable(false);  
```  

The instruction `Application.launch(args)` is needed in development environmens with limited suppord for JavaFX. This can be replaced by `launch(args)`, because the JavaFX main class is a subtype of Application.  
