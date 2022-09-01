package chapters.Chapter03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter three edges of the triangle:");
		  double s1 = input.nextDouble();
		  double s2 = input.nextDouble();
		  double s3 = input.nextDouble();

		  if (s1+s2>s3 && s1+s3>s2 && s2+s3>s1) {
		   System.out.print("The perimeter is " + (s1 + s2 + s3));
		  }
		  else 
		  {
		    System.out.print("The input is invalid");
		    System.exit(0);
		  } 

	}

}
