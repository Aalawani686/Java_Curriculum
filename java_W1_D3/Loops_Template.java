package java_W1_D3;

public class Loops_Template {

	public static void main(String[] args) {
		
		int a = 0;
		a += 1;
		//adds one to a
		
		//Let's say that we wanted to add 1 to a 7 more times
		//We could do it like this
		
		a += 1;
		a += 1;
		a += 1;
		a += 1;
		a += 1;
		a += 1;
		a += 1;
		
		//However, this is redundant and can be accomplished in a much easier fashion
		//Loops allow the program to repeat processes for a certain amount of times
		
		//The FOR loop is a loop in which the amount of looping is a set number defined by the developer
		//The syntax for the "for" loop is as follows
		
		for(int i=0; i<7; i++){
			a += 1;
		}
		
		//In this for loop, we create an ITERATOR integer i, that we continuously add 1 to (i++)
		//Essentially, once the iterator i reaches 7, the loop no longer is entered
		//Thus, the loop is executed 7 times, for when i = 0,1,2,3,4,5,6
		
		//The other main type of loop is the WHILE loop
		//The while loop does not have a set number of looping
		//The while loop executes as long as a boolean condition is met
		
		int b = 0;
		
		while(b < 7){
			b++;
		}
		
		//This loop executes 7 times as well, up till the point which b stores the value 8
		
		//Two more important features of loops are the BREAK and CONTINUE keywords
		//Break forces an exit from the loop, while Continue forces a skip to the next loop
		
		int c = 0;
		
		for(int i=0; i<7; i++){
			c += 1;
			if(c > 1 && c < 3){
				continue;
			}
			if(c > 5){
				break;
			}
			System.out.println(c);
		}
		
		//In this example, c should ideally be printed out from the values 1 to 7
		//However, when c is equal to 2, "continue" is used
		//Although this does not end the loop, skips everything after it in that instance of the loop
		//The "break" keyword is used after c > 5 and the loop is exited
		//For these reasons, the only values printed out are 1, 3, 4, 5
		
		
	}

}
