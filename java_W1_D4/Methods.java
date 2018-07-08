package java_W1_D4;

public class Methods {

	public static void main(String[] args) {
		
		//So far, all of our code has been in the main method
		//What if we have a complex set of instructions that we need to execute multiple times?
		//Coding repetitively is not efficient, especially in the main method
		//We need to be able to split our code into smaller tasks and delegate them to external entities
		//These external smaller tasks are perfect in METHODS, subprograms that are separate smaller blocks of code
		//Refer to the public method "doSomething" to understand more about a method
		
		double random = doSomething(5, 6);
		System.out.println(random);
		
		//Calling a method only requires the method name along with the necessary parameters
		//Once the method is executed, the return value takes the place of the method call
		//This return value can be stored in a variable and used for later needs
		
	}
	
	public static double doSomething(int max){
		
		//Here is our first method
		//Note that it has multiple parts, "public", "static", "double", "doSomething", and "int max"
		//For now, keep methods "public" as it allows external programs to access the method
		//For now, keep methods "static" as it allows them to be used without a creation of an object (more on this later)
		//The RETURN type is the next part of the method and defines what the method returns back to the main program
		//Return types can be any type of variable, and can also be "void" if no return values is desired
		//The final necessary part of the method structure is the method name, which is used to call the method
		//Methods can also have parameters, such as "double number"
		//PARAMETERS are necessary variables that the main program passes to the method
		//Methods can have any number of parameters
		//IF A METHOD DOES NOT HAVE EXACTLY THE SAME COMPONENTS (NAME, PARAMETERS, RETURN TYPE), IT IS NOT THE SAME METHOD
		
		return max * Math.random();
		
		//Our method takes in a max number value and returns a random double value less than that number
		//Math.random returns a value between 0 and 1 and thus return value can never be greater than the max
		
	}
	
	public static double doSomething(int min, int max){
		
		//Although this method has the same name as the first one, the parameters are different
		double middle = 0;
		if (min >= max){
			return 0;
		}
		while(middle >= max || middle <= min){
			middle = max * Math.random();
		}
		
		
		
		return middle;
		
	}

}
