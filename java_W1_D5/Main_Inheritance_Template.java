package java_W1_D5;

public class Main_Inheritance_Template {

	public static void main(String[] args) {

		Square square = new Square(3, 4, 6);
		//Here we have created a Square object with x = 3, y = 4, side = 6
		
		//Note that the Square class has the method "Perimeter()"
		//The Rectangle class has the methods "Perimeter()" and "Area()"
		//What happens if we call Square.Area() ??
		
		System.out.println(square.Area());
		
		//Since the Square method does not have and "Area()" method, it goes to the inherited Rectangle "Area()" method
		//This shows that objects can use attributes and methods from the classes they inherit from
		
		//However, both the Square and Rectangle have the "Perimeter()" method
		//What happens if we call Square.Perimeter() ??
		
		System.out.println(square.Perimeter());
		
		//If a child class and a parent class have their own examples of a unique method, the child class's method is use
		//In this example, the Square and Rectangle classes both have "Perimeter()" methods and so Square's is used
		//This type of inheritance is called POLYMORPHISM, and is vital to hierarchical object oriented programming
		//It allows specialized methods in child classes to use a common name and structure provided by the parent class
	}

}
