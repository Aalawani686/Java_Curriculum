package java_W1_D4;

public class Arrays_Template {

	public static void main(String[] args) {


		//We have already covered primitive variable types such as integers and characters
		//These variables store singular values, such as a number, letter, or symbol
		//What if we wanted to store multiple variables together in the same location?
		//This is what DATA STRUCTURES are used for
		//Think of data structures as even big variables that store smaller variables

		//The most basic type of data structure, and usually the most efficient is the ARRAY
		//The array is a linear data structure, meaning that the variables are stored similar to a line
		//The array can only hold one type of variable, but many instances of this variable type
		//Finally, the array's size can't be changed as so editing the array can prove intensive

		int[] array = new int[10];
		int[] array2 = new int[]{1, 2, 3, 4, 5};

		//In this example, we have created an array of integers
		//Notice that the common array notation uses square brackets
		//The instantiation, or the creation, of an array uses the NEW operator, similar to the String variable
		//Since the size of the array is immutable, or unchangeable, the size of the array or the elements are necessary

		//Every data structure must obviously have some sort of structure for the data
		//In the array, elements are stored in a linear fashion, in which each has a location number
		//This location number is referred to as the index and represents the elements' location

		int[] array3 = new int[]{1, 2, 3, 4, 5};
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
		System.out.println(array3[4]);
		
		//In this example, we have created an array with length 5, with the integer elements 1,2,3,4,5
		//To individually access the elements, place square brackets after the array name and insert the index
		//In Java, array indexes start at 0 rather than 1 and thus the 1st element -> index 0, 2nd -> index 1...
		
		//As usual, there is an easier way to access all the elements of an array than sifting through individually
		
		double[] array4 = new double[10];
		for(int i=0; i<array4.length; i++){
			array4[i] = Math.random();
			System.out.println("Index: " + i + " Value: " + array4[i]);
		}
		
		//In this example, we create an array with a set size of 10 rather than providing the elements themselves
		//We can use the ".length" attribute of an array to find its length, and use a for loop to reach that number
		//Remember, that since the indices start at 0, the last element will have an index of "array.length-1"
		//Thus, we iterate as long as i is less than the length, so that the loop stops at the last element at index "array.length-1"
		//As we go through the for loop, we access the ith position in the array and assign a random value
		//Finally, we can print both the index and the value at that index in the array
		

	}

}
