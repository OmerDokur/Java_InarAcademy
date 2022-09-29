package chapters.Chapter06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		System.out.print("Enter the number of lines:");
		  Scanner input = new Scanner(System.in);
		 
		  // get the total number of lines n.
		  int n = input.nextInt();
		  displayPattern(n);
		 }
		 
		 public static void displayPattern(int n) {
		 
		  for (int i = 1; i <= n; i++) {
		   // printing spaces, 2 at a time from j=1 to j= n-i
		   for (int j = 1; j <= (n - i); j++) {
		         
		    //Using loop handle multiple digit number
		    //loop to find out the number of digit
		    //Number to printed on this row is (n-(j-1))
		    int numberOfDigit=0;
		    int remainder = n-(j-1);
		    while (remainder!=0) {
		     numberOfDigit++;
		     remainder /=10; 
		    }
		    //Print additional spaces-start at -1 to print a space between column 
		    for (int k = -1; k < numberOfDigit; k++) {
		     System.out.print(" ");
		    }
		     
		   }
		    
		   
		 
		   // Printing number decrementally from line number i to 1
		   for (int j = i; j >= 1; j--) {
		    System.out.print(j + " ");
		     
		   }
		   System.out.println();
	}

}
}
