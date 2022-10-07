package chapters.Chapter06;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		System.out.print("Enter a number:");
		  Scanner input = new Scanner(System.in);
		  long n = input.nextLong();
		  System.out.println("\nThe square root of " + n + " is " + sqrt(n));
		 
		 }
		 
		 public static double sqrt(long n) {
		  double lastGuess = 1, nextGuess = 1;
		  int nOfG = 0;
		 
		  do {
		   lastGuess = nextGuess;
		   nextGuess = (lastGuess + (n / lastGuess)) / 2;
		   nOfG++;
		   System.out.println("Guess " + nOfG + " is " + nextGuess);
		  } while (Math.abs(lastGuess - nextGuess) > 0.0001);
		 
		  return nextGuess;

	}

}
