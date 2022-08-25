package chapters.Chapter02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//(Population projection)
        //Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years. 
		//Use the hint in Programming Exercise 1.11 for this program. The population should be cast into an integer.
		
		long newPop = 0, current = 312032486;
		  int time;
		  int birth, death, immigrant;
		 
		  Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the number of years:");
		  int v = input.nextInt();
		 
		  for (int i = 1; i <= v; i++) {
		   // Convert time to second
		   time = i * 365 * 24 * 60 * 60;
		   // Calculating population increase/decrease in each case
		   birth = time / 7;
		   death = time / 13;
		   immigrant = time / 45;
		   // calculate new population
		   newPop = current + birth - death + immigrant;
		 
		  }
		 
		  System.out.println("The population in " + v + " years is " + newPop);

	}

}
