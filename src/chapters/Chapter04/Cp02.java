package chapters.Chapter04;

import java.util.Scanner;

public class Cp02 {

	public static void main(String[] args) {
		//triangle angle calculation
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Enter three points: ");
		
		double x1= keyboard.nextDouble();
		double y1= keyboard.nextDouble();
		double x2= keyboard.nextDouble();
		double y2= keyboard.nextDouble();
		double x3= keyboard.nextDouble();
		double y3= keyboard.nextDouble();
		
		//compute three sides
		double a = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		double b= Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double c= Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		//compute three angles
		double A= Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
		double B=Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
		double C=Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));
		
		//display results
		System.out.println("Angle 1: " + (int)(A*100)/100.0);
		System.out.println("Angle 2: " + (int)(B*100)/100);
		System.out.println("Angle 3: " + (int)(C*100)/100);
		
		
		

	}

}
