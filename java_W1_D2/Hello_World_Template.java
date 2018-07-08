package java_W1_D2;

public class Hello_World_Template {

	public static void main(String[] args) {
		//The main method is where all java programs start.
		
		//Create COMMENTS using double forward slash marks
		//Create Multi-Line Comments using /* (Multi-Line Comment) */
		/*Here is and example of
		 * a Multi-Line comment
		 */

		System.out.println("HI");
		//This is Java's print function. It is extremely basic but heavily used to output data to the console	
		
		int number = 3;
		//The INT variable type holds integer number values. e.g. -1, 3, 5, -103
		
		boolean isCool = true;
		//The BOOLEAN variable type holds conditional values. e.g. true, false
		//Booleans are important in order for the program to make decisions as it runs
		
		float decimal = (float) 3.14;
		//The FLOAT variable type holds decimal number values. e.g. -1.2, 4.5, 3.141
		//To create a float, the number must be CAST to the float variable type
		//Casting is used to convert values between similar variable types
		
		double decimal2 = 3.141592653;
		//The DOUBLE variable type holds decimal number values that are too long to be floats.
		//e.g. -71.243434, 3434.53535, 5553.167841
		
		char letter = 'C';
		//The CHAR variable type holds singular symbols, including alphabetical letters.
		//e.g. a, b, r, $, ^, <, *
		
		//The variable types listed above are a few examples of PRIMITIVE VARIABLES
		//Primitive Variables are the most basic data types available in Java
		//Primitive Variables are defined by Java itself and not the developer
		
		String sentence = new String("Catalyst Coding");
		//The STRING variable type holds more than one character or symbol
		//Strings are NOT primitive variables as they can be distinct entities
		//These variables are known as OBJECTS. We will cover them later in the program
		
		System.out.println(number);
		System.out.println(isCool);
		System.out.println(decimal);
		System.out.println(decimal2);
		System.out.println(letter);
		System.out.println(sentence);
		
		
		
		
	}

}
