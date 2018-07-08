package java_W1_D5;

import java.awt.Color;

public class Rectangle {
	
	//This is our Rectangle class, and it serves as the parent to the Square class

	public Color color = Color.BLACK;
	public int x, y;
	public int length, width;
	
	Rectangle(int _x, int _y, int _length, int _width){
		 
		x = _x;
		y = _y;
		length = _length;
		width = _width;
		
	}

	public int Area() {
		System.out.println("In Rectangle's Area method");
		//We have included this to see the functionality of classes in inheritance
		
		return length * width;
	}

	public int Perimeter() {
		System.out.println("In Rectangle's Perimeter method");
		//We have included this to see the functionality of classes in inheritance
		
		return 2 * length + 2 * width;
	}
	
	
	
}
