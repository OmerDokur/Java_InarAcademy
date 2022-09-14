package chapters.Chapter05;

public class Cp14 {

	public static void main(String[] args) {
		//Test Break
		
		int sum = 0;
		int number = 0;
		
		while (number <20) {
			number ++;
			sum += number;
			if (sum >= 160)
				break;
			
		}
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);

	}
	

}
