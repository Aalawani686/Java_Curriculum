package java_W1_D5;

import java.awt.Color;

public class Main_Objects_Template {

	public static void main(String[] args) {

		Ball ball1 = new Ball();
		//This should print out "I am in the constructor method #1" as it executes that constructor
		
		Ball ball2 = new Ball(100);
		//This should print out "I am in the constructor method #2" as it executes that constructor
		
		Ball ball3 = new Ball(100, 200);
		//This should print out "I am in the constructor method #3" as it executes that constructor
		
		//Objects are created using the NEW Operator
		//The syntax for object creation is (<object type> <object name> = new <class constructor>)
		//The right side of each line is different because when creating the object, we can call any constructor
		//Remember that although each Ball object is a copy of the Ball class, they are all separate entities
		//Also remember that the number of parameters determines which Constructor Method is executed
		
		ball1.color = Color.BLUE;
		
		//Each object is essentially a copy of the class and has its own attributes and variables that we can access
		//Similar to how we changed the value of primitive variables, we can manipulate aspects of objects
		//For examples, we can set the ball's color to blue even though in the class it was defined as red
		//This is because the color variable in the Ball class is public, and with each object, we can edit it
		
		System.out.println(ball2.getX());
		
		//This is an example of using an object's methods, in this case the "getX()" method
		//Object Methods allow the developer to delegate tasks to the objects themselves
		//In this case, we are returned the X position value of ball2 which we can later use to move the ball
		
		ball3.setX(200);
		
		
	}

}
