package chapters.Chapter03;

import java.util.Scanner;

public class Cp03 {

	public static void main(String[] args) {
		//SimpleIfDemo
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
		
		int number = input.nextInt();
		
		if(number%5==0) {
			System.out.print("HiFive");	
		}
		if(number%2==0) {
			System.out.print("HiEven");
		}
		
			
	}

}
