package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array1 = {"abcd", "efgh", "ijkl", "mnopq", "rstu"};
		
		//2. print the third element in the array
		System.out.println(array1[2]);
		
		//3. set the third element to a different value
		array1[3] = "NOTijkl";
		
		//4. print the third element again
		System.out.println(array1[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println(array1[i] + " ");
		}
		
		//6. make an array of 50 integers
		int[] ints = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for(int i = 0; i < ints.length; i++)
		{
			int j = r.nextInt(10);
			ints[i] = j;
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int low = 9;
		for(int i = 0; i < ints.length; i++)
		{
			if(ints[i] < low)
			{
				low = ints[i];
			}
		}
		System.out.print(low + " ");
		
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < ints.length; i++)
		{
			System.out.print(ints[i]);
		}
		
		//10. print the largest number in the array.
		int high = 0;
		for(int i = 0; i < ints.length; i++)
		{
			if(ints[i] > high)
			{
				high = ints[i];
			}
		}
		System.out.print(" " + high);
	}
}
