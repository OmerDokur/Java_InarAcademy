package chapters.Chapter04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter an ASCII code:");
		  int s = input.nextInt();
		 
		  System.out.print("The character for ASCII code " + s + " is "
		    + (char) s);

	}

}
