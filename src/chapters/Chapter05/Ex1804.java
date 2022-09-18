package chapters.Chapter05;

import java.util.Scanner;

public class Ex1804 {

	public static void main(String[] args) {
		//Display four patterns using loops
		
		System.out.print("Enter the number of lines:");
		  Scanner input = new Scanner(System.in);
		   
		  //get the total number of lines n.
		  int n = input.nextInt();
		   
		  //Loop through the lines from 1 to n (i=0 to n-1)
		  System.out.println("Pattern C");
		  for (int i = 0; i < n; i++) {
		    
		   // printing spaces, 2 at a time from j=i to 0
		   for (int j = i; j>0; j--) {
		    System.out.print("  ");
		   }
		    
		   //Printing number increamentally from 1 to line number j
		   for (int j = 1; j <= n-i; j++) {
		    System.out.print(j + " ");
		   }
		   System.out.println();

	}
	}
}
