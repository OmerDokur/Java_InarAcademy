package chapters.Chapter02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//(Compute the volume of a cylinder) 
		//Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:
		//area = radius * radius * p
		//volume = area * length
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and the length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * 3.14159265359;
        double volume = area * length;

        System.out.println("The area is " + (int) area);
        System.out.println("The volume is " + (int) volume);
		
	}

}
