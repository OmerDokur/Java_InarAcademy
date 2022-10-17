package chapters.Chapter07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		  int[] number = new int[10];
		 
		  System.out.print("Enter 10 integers:");
		 
		  for (int i = 0; i < number.length; i++) {
		   number[i] = input.nextInt();
		  }
		 
		  for (int i = number.length - 1; i >= 0; i--) {
		   System.out.print(number[i] + " ");
		  }

	}

}
