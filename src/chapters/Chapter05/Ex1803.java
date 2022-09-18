package chapters.Chapter05;

import java.util.Scanner;

public class Ex1803 {

	public static void main(String[] args) {
		//Display four patterns using loops
		
		System.out.print("Enter the number of lines:");
		  Scanner input = new Scanner(System.in);
		   
		  //get the total number of lines n.
		  int n = input.nextInt();
		 
		  //Loop through the lines from 1 to n
		  System.out.println("Pattern C");
		  for (int i = 1; i <= n; i++) {
		   // printing spaces, 2 at a time from j=1 to j= n-i 
		   for (int j = 1; j <= (n - i); j++) {
		    System.out.print("  ");
		   }
		    
		   //Printing number increamentally from 1 to line number j
		   for (int j = 1; j <= i; j++) {
		    System.out.print(j + " ");
		   }
		   System.out.println();

	}
	}
}
