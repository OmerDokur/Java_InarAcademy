package chapters.Chapter03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month and year: ");
		
		int month = input.nextInt();
		int year = input.nextInt();
		
		String months= " ";
		int days = 0;
		
		switch (month) {
		case 1:
			months = "January";
			break;
		case 2:
			months = "Febuary";
			break;
		case 3:
			months = "March";
			break;
		case 4:
			months = "April";
			break;
		case 5:
			months = "May";
			break;
		case 6:
			months = "June";
			break;
		case 7:
			months = "July";
			break;
		case 8:
			months = "August";
			break;
		case 9:
			months = "September";
			break;
		case 10:
			months = "October";
			break;
		case 11:
			months = "November";
			break;
		case 12:
			months = "December";
			break;
			
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		/*case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;*/
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				days = 29;
				break;
			}
			days = 28;
			break;
			default:
				days=30;
		}
		System.out.println("Entered your month and year: "+ months+ " " + year + " is "+ days+ " days.");

	}

}
