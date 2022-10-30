package chapters.Chapter07;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  int[] numbers = new int[10];
		 
		  System.out.print("Enter 10 integers to exclude from:");
		 
		  for (int i = 0; i < numbers.length; i++) {
		   numbers[i] = input.nextInt();
		  }
		 
		  System.out.println("List of 100 random numbers:");
		  for (int i = 0; i < 100; i++) {
		   System.out.println(getRandom(numbers));
		 
		  }
		 
		 }
		 
		 public static int getRandom(int... numbers) {
		 
		  int getRandom = 0;
		  boolean flag = true;
		 
		  // Loop until random number in not an argument list
		  while (flag) {
		   getRandom = intRandom(1, 54);
		   // Assuming that the random number is not in arg list
		   flag = false;
		   // Test the assumption
		   for (int i : numbers) {
		    // If assumption is false, reset flag to true to generate new
		    // random number
		    if (getRandom == i) {
		     flag = true;
		     break;
		    }
		   }
		  }
		 
		  return getRandom;
		 }
		 
		 // Generate random integer between upper and lower bound
		 public static int intRandom(int lowerBound, int upperBound) {
		  return (int) (lowerBound + Math.random()
		    * (upperBound - lowerBound + 1));

	}

}
