package weeks.week03;

import java.util.Scanner;

public class As03Q1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter your servise year: ");
		int year = input.nextInt();
		System.out.print("Enter your salary: ");
		int salary = input.nextInt();
		
		if (year>5) {
			double bonus = salary * 0.05;
			System.out.print("Your bonus amount is "+ bonus);
			
			
		}
		else {
			System.out.println("Your bonus amount is 0 .");
		}

	}

}
