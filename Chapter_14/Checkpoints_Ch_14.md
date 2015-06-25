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

## 14.9 ##
The naming convention that shall be used is as follows.  

The getter method is:  
```Java  
public int getAge()
```  
            
The setter method is:  
```Java  
public void setAge(int age)
```  
            
The property getter is
```Java  
public IntegerProperty ageProperty()
```  

## 14.12 ##
The border color of a node can be set by the use of a style. Here is an example of how to set the border color to red.  
```Java  
node.setStyle("-fx-border: red");  
```  
In i similar way so can the text color of some element be set to a color of choice.  
```Java  
text.setStyle("-fx-fill: red");
```  

## 14.13 ##
Elements such as pane, text, or button can be rotated.  

Rotation of a button 15 degrees counterclockwise is done in the following way.  
```Java  
button.setRotate(-15);  
```  

## 14.14 ##
There are various constructors or static methods that can be used to create a Color. The following constructor creates a Color with the specified red, green, blue, and opacity values.  
```Java  
Color(double red, double green, double blue, double opacity)  
```  
The following attempt to create a Color is incorrect because all parameters shall be in the range from 0.0 to 1.0.  
```Java  
new Color(1.2, 2.3, 3.5, 4)		// error
```  
Higher values supplied to the above constructor means lighter colors so when creating two colors, `c1 = new Color(0, 0, 0, 1)` and `c2 = new Color(1, 1, 1, 1)` so will c2 be lihter than c1.  

Invoking `c.darker()` will not change the color value in c, instead so will a new darker color object, based on c, be returned.  

## 14.15 ##
A Color object with a random color can be created in the following way.  
```Java  
new Color(Math.random(), Math.random(), Math.random(), 1)  
```  
## 14.16 ##
Setting the fill color of a circle can be achieved with either the setFill method or the setStyle method.  
```Java  
c.setFill(Color.BLUE)
c.setStyle("-fx-fill: blue")
```  
## 14.17 ##
Creation of a Font object with font name Courier, size 20, and weight bold.  
```Java  
font("Courier", FontWeight.BOLD, 20)  
```  

## 14.18 ##
The available fonts on a system can be found with `Font.getFamilies()` that return a list of strings for font names.  

## 14.19 ##
An Image is created from a URL like this.
```Java  
new Image(URL)  
```  
An Image is created from a file name in a similar way.  
```Java  
new Image(filename)   
```
  
## 14.20 ##
An ImageView can be created from an Image, or directly from a file or a URL.  
```Java  
new ImageView(image)  
```  

## 14.21 ##
An Image can be set to multiple ImagViews, but one ImageView can only be displayed on time.  

## 14.22 ##
The pane types Pane, StackPane, FlowPane, GridPane, BorderPane, HBox and VBox have identical methodology for adding nodes.  
```Java  
pane.getChildren.add(node)  
```  
The BorderPane is a special case, the methods setTop, setBottom, setLeft, setRight, and setCenter shall be used when adding nodes to this type of pane.  

A node is removed from a pane in the following way.  
```Java  
pane.getChildren().remove(node)  
```  
## 14.28 ##
Example code that shows how to rotate a text.  
```Java  
Text text = new Text("Checkpoint 14.28");  
StackPane pane = new StackPane();  
pane.getChildren().add(text);  
text.setRotate(15);  
```  
