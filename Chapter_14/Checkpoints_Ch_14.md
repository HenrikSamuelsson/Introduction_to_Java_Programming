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

The instruction `Application.launch(args)` is needed in development environments with limited support for JavaFX. This can be replaced by `launch(args)`, because the JavaFX main class is a subtype of Application.  

## 14.4 ##
The output of the program in this exercise is:  
```  
launch application  
Test constructor is invoked  
start method is invoked  
```  

## 14.5 ##
There are some different constructors that can be used to create a Scene.  

Creation of a Scene for a specific root Node.  
```Java  
Scene(Parent root)
```

Creation of a Scene for a specific root Node with a specific size.  
```Java  
Scene(Parent root, double width, double height)  
```  

See the documentation for more examples of constructors for creation of Scene instanses.  

A Scene is set on a Stage by invoking a member method called:  
```  
setScene(Scene value)  
```  

A circle is placed in a Scene by first placing the circle in a pane. This pane can then be placed in the Scene.  

## 14.6 ##
A pane is a form of container for content called nodes.  

A node is a component that have a visual representation and can hence be displayed in a GUI.  

A node can be placed into a pane:
```Java  
pane.getChildren().add(node)  
```  

It is not possible to place a Shape or ImageView into a Scene. These must be placed on for example a pane and this pane can then be placed in the Scene.  

A control or a pane can be place into a scene when constructing a Scene using `new Scene(Parent, width, height)` or `new Scene(Parent)`. Parent is the superclass for Control and Pane.  

## 14.7 ##
There are several constructor variants that can be used to create a Circle.
```Java  
Circle()	// creates an empty instance
Circle(double radius)	// specified radius   
Circle(double centerX, double centerY, double radius)	// specified position and radius  
Circle(double x, double y, double r, Paint fill)	// specified position, radius and fill
Circle(double radius, Paint fill)	// specified radius and fill  
```  
The methods for setting the center of a Circle instance is:    
```Java  
void setCenterY(double value)
```  
The method for setting the radius of a Circle instance is:
```Java  
void setRadius(double value)    
```  
The method for setting the stroke color of a Circle instance is:
```Java  
public final void setStroke(Paint value)      
```  
The method for setting the fill color of a Circle instance is:  
```Java  
public final void setFill(Paint value)      
```  
## 14.8 ##
A binding property is used to bind with a source object. Any changes to the source will be reflected in the bound target.  

A binding property is an instance of of the interface Property.  

A source object is an instance of the inteface  ObservableValue.  

The binding object types for int, long, float, double, and boolean are IntegerProperty, LongProperty, DoubleProperty, and BooleanProperty.  

The classes Integer and Double are not subtypes of ObservableValue. Hence, they cannot be used as a source object in a binding.  
