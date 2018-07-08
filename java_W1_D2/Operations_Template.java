package java_W1_D2;

public class Operations_Template {

	public static void main(String[] args) {
		
		//We have covered most of the primitive variable types, both numbers, characters, and booleans
		//In this section, we will cover how to manipulate primitive variable types in Java
		
		int A = 1;
		int B = 2;
		
		// Can be written like this
		int C=1, D=2;
		
		double AA = 1.5;
		double BB = 2.5;
		
		//Basic math can be done using numerical variable types, including integers, floats and doubles.
		System.out.println(A + B);
		System.out.println(C - D);
		
		System.out.println(AA + BB);
		
		//Mathematical operations can also be carried out across variables of different types
		System.out.println(A + AA);
		
		//CASTING is a tool used to convert variable types
		//BEWARE, data values can change when using casting
		System.out.println((int)(AA));
		
		//Mathematical operations in Java
		// + addition            * multiplication
		// - subtraction         / division
		// ++ add one            -- subtract one
		// += add value          -= subtract value
		// *= multiply by value  /= divide by value
		// % remainder (modulo)
				
		
		//Some operations can also be applied to some non-integer variable types, including Strings
		
		String first = "Catalyst";
		String second = "Coding";
		String text = "My favorite decimal is: ";
		
		System.out.println(first + " " + second);
		
		System.out.println(text + (A + AA));
		
	}

}
