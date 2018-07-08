package java_W1_D5;

public class Square extends Rectangle{
	
	//Inheritance in Java is similar to inheritance in real life
	//In inheritance, things are passed down from parent to offspring
	//In Java, the PARENT CLASS passes down its methods and attributes to the CHILD CLASS
	//Thus, the child class can access everything that the parent class has
	//Inheritance is useful in building off of similarly structured classes
	//We EXTEND the Square class off of the Rectangle class, because a square is a specialized rectangle

	public int side;
	
	Square(int _x, int _y, int _length) {
		
		super(_x, _y, _length, _length);

		x = _x;
		y = _y;
		side = _length;
		
		//The child class has its own constructor methods as it is a separate entity
		//However, it must fulfill one of the parent's constructor methods, as it depends on it for functionality
		//Use the SUPER function, along with parameter, to call one of the parent's constructor methods
		//In this case, we set both the "length" and "width" in Rectangle to "_length" to denote a Square
		
	}
	
	public int Perimeter() {
		System.out.println("In Square's Perimeter method");
		//We have included this to see the functionality of classes in inheritance
		
		return 4 * side;
	}
	

}
