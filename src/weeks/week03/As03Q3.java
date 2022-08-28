package weeks.week03;

import java.util.Scanner;

public class As03Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter for-digit number: ");
		int number= input.nextInt();
		// number = 1235
		int d4 = number / 1000; //d4 =1
		int remaining= (number % 1000); //remaining=345
		int d3 = remaining / 100; //d3= 3
		remaining = (number % 100); //remaining=45
		int d2 = remaining /10; //d2=4
		int d1= remaining % 10;  //d1=5
		
		System.out.println("Reverse number: "+ d1 + d2 + d3 +d4);
		
		

	}

}
