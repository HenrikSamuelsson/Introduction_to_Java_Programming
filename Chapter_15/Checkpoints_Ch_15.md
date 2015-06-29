# Checkpoint Answers Chapter 15 #
## 15.1 ##
An event source object is an object that can fire an event. 

An event object holds information about an event.  

The relationship between a source object and an event is that the event is an object created by the source.  

## 15.2 ##
Button is a subclass of Node, therefore, it can fire all the events that Node can fire. Among the event that can be fired are MouseEvent, KeyEvent, and ActionEvent.  

## 15.24 ##
A timer is setup that will launch a redraw of the ball every 50 ms. The ball is moved a small distance on each redraw.  

## 15.25 ##
The direction of the ball is reversed by multiplying the control variables dx and dy by -1.  

## 15.26 ##
Pressing the mouse button while on the ball pane will cause the animation to pause. The animation is paused until the mouse button is released.  

## 15.27 ##
```Java  
ballPane.requestFocus();  
```  
The above line of code is taken from the BounceBallControl class in the book. The purpose of this line is to set focus on this node and that this node's top-level ancestor become the focused window. This is necessary for receiving events when the arrow up-key and arrow down-key are pressed.  

## 15.28 ##
```Java  
animation.setCycleCount(Timeline.INDEFINITE);  
```  
The above line of code is taken from the BallPane class in the book. It sets the Timeline animation to be repeated for an indefinite number of times. Without this line so would the animation only be repeated once.  
