package chapters.Chapter02;
import java.util.Scanner;

public class Cp02 {
	public static void main(String[] args) {
		//area formula of a circle
		
		Scanner input = new Scanner(System.in);
		
		double radius;
		double area;
		
		System.out.print("The radius of the circle: ");
		
		radius= input.nextInt();
	    
		area = radius*radius* 3.14;
		
		System.out.println("Area of the Circle: " +area);
		
	}

}

