package chapters.Chapter06;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter an integer:");
		  int number = input.nextInt();
		 
		  System.out.print("The reversal is " + reverse(number));
		 
		 }
		 
		 public static int reverse(int number) {
		  int reverse = 0;
		  int digit;
		 
		  do {
		   digit = number % 10;
		   reverse = reverse * 10 + digit;
		   number /= 10;
		  } while (number != 0);
		 
		  return reverse;

	}

}
