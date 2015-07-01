# Checkpoint Answers Chapter 16 #
## 16.1 ##
A label with a node but without a text is created in a two step process. First create Label with the no-arg constructor, then set the labels graphic property to a node.  

## 16.2 ##
The following code shows how to adjust the label so that it is placed on the right of its node.  
```Java  
label.setContentDisplay(ContentDisplay.LEFT);  
```  

## 16.3 ##
Usage of `\n` makes it possible to divide a label text into multiple lines.  

## 16.4 ##
It is possible to underline a text in a label by setting an underline property.  
```Java  
label.setunderLine(true);  
```  

## 16.5 ##
A button with a text (Left) and a node (in this case an image) is created in the following way.  
```Java  
Button btLeft = new Button("Left", new ImageView("left.gif"));  
```  
The class Button is a subclass of Labeled so Button can invoke all the methods in Labeled.  

## 16.6 ##
The `getPane()` method and the member `Text` in Listing 16.2 are declared as protected because they are intended to be used in subclasses later on in the book.  

## 16.7 ##
The method `setOnAction(handler)` is used to set a handler for processing a button-clicked action.  

