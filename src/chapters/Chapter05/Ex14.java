package chapters.Chapter05;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//Compute the Greatest Common Divisor (GCD)
		
		System.out.println("Enter two integers: ");
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		//find the min.
		if (n2 < n1) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
			
		}
		
		for ( int d = n1; true ; d--) {
			if ( n1 % d == 0 && n2 % d == 0) {
				System.out.println("The GCD is: " + d);
				break;
			}
		}

	}

}
