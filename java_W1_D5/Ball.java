package java_W1_D5;

import java.awt.Color;

public class Ball {
	
	//Java is special because it is known as an Object Oriented Programming Language
	//An OBJECT is essentially a special variable that the developer can define
	//Objects have attributes (variables that describe the object) and methods (actions of the object)
	//For example, a car object would have the attributes "color" and "speed" and the method "drive"
	
	//A class is simply a blueprint of an object and defines the properties and behaviors of the object
	
	public Color color = Color.RED;
	public int x, y;
	public int radius;
	
	//These are known as the class's attributes, or the necessary variables that come with each object created
	
	Ball(){ 
		System.out.println("I am in the constructor method #1.");
		
		//This is the CONSTRUCTOR METHOD, a necessary method in each object class created
		//The Constructor Method is executed when the object is created
		//Note that the Constructor Method must be the name of the class and does not use "public" or "static"
		
	}
	Ball(int myX){
		x = myX;
		System.out.println("I am in the constructor method #2.");
		
		//Just like all methods, if the Constructor Method has different parameters, it is a unique one
		//This means that an object can have multiple Constructor Methods depending on what parameters the developer passes
		
	}
	Ball(int myX, int yourY){
		x = myX;
		y = yourY;
		System.out.println("I am in the constructor method #3.");
		
		//We set the parameters into our global attributes as they can be accessed from any part of the class
		
	}

	public int getRadius() {
		return radius;
		
		//Each class has its own methods too, necessary actions that each object must have
		
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Color getColor() {
		return color;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
