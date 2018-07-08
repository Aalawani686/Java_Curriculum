package java_W1_D3;

public class Conditional_Statements_Template {

	public static void main(String[] args) {
		
		//In the earlier segment, we covered primitive variable types
		//Conditional Statements use boolean operators to allow the program to make decisions
		
		boolean conditional = true;
		//In this case, the conditional value "true" is assigned to the boolean variable "conditional"
		
		//The IF statement is a conditional statement that checks whether boolean conditions are met.
		
		if(conditional == true){
			System.out.println("The condition is met");
		}
		
		//Conditional Operators
		// == equal to           != not equal to
		// < less than    		  > greater than
		// <= less than or equal to
		// >= greater than or equal to
		
		//Conditional statements can even include the comparison of variables that are not boolean
		
		int a = 13, b = 15, c = 22;
		
		if(a > b){
			if(a > c){
				System.out.println("a is the biggest");
			}
		}
		
		//In this example, we check if a is greater than both b and c with nested if statements
		//An easier method is to use && (AND) or || (OR) to see if multiple conditions are met
		
		if(a > b && a > c){
			System.out.println("Only prints if a is greater than BOTH a and c");
		}
		
		if(a > b || a > c){
			System.out.println("Only prints if a is greater than AT LEAST ONE of a or c");
		}
		
		//In Java, it is possible to stack conditional statements, so that multiple checks happen
		
		int d = 13;
		if(d > 100){
			System.out.println("d is greater than 100");
		}
		else if(d > 50){
			System.out.println("d is greater than 50 but less than 100");
		}
		else if(d > 10){
			System.out.println("d is greater than 10 but less than 50");
		}
		else{
			System.out.println("d is less than 10");
		}
		
		//In this conditional stack, the program first checks if the number is greater than 100
		//If this condition is met, it skips of the conditional statements
		//However, if the condition is not met, the program checks if the next conditional statement is met
		//REMEMBER, the program will only execute one of the 4 conditional statements.
	}

}
