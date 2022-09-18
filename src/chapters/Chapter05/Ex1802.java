package chapters.Chapter05;

import java.util.Scanner;

public class Ex1802 {

	public static void main(String[] args) {
		//Display four patterns using loops
		
		System.out.print("Enter the number of lines:");
		  Scanner input = new Scanner(System.in);
		 
		  // get the total number of lines n.
		  int n = input.nextInt();
		 
		  // Loop through the lines from 1 to n (i=0 to n-1
		  System.out.println("Pattern B");
		  for (int i = 0; i < n; i++) {
		 
		 
		 
		   // Printing number increamentally from 1 to line number j
		   for (int j = 1; j <= n - i; j++) {
		    System.out.print(j + " ");
		   }
		   System.out.println();

	}

}
}
