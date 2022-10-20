package chapters.Chapter07;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		final int MAX_NUMBER_OF_SCORE = 100;
		 
		  Scanner input = new Scanner(System.in);
		  int[] score = new int[MAX_NUMBER_OF_SCORE];
		  int sum = 0, avg = 0, n = 0;
		  System.out.print("Enter scores (End input with negative number):");
		  for (int i = 0; i < score.length; i++) {
		 
		   score[i] = input.nextInt();
		 
		   if (score[i] < 0) {
		    avg = sum / i;
		    break;
		   } else {
		    sum += score[i];
		    n++;
		   }
		  }
		 
		  int equal = 0, above = 0, below = 0;
		  for (int i = 0; i < n; i++) {
		   if (score[i] == avg) {
		    equal++;
		   } else if (score[i] > avg) {
		    above++;
		   } else {
		    below++;
		   }
		 
		  }
		 
		  System.out.println("The number of scores equal to average is " + equal);
		  System.out.println("The number of scores above average is " + above);
		  System.out.println("The number of scores below average is " + below);

	}

}
