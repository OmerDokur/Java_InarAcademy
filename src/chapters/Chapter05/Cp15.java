package chapters.Chapter05;

public class Cp15 {

	public static void main(String[] args) {
		//Test Continue
		
		int sum = 0;
		int number = 0;
		
		while (number <20) {
			number ++;
			
			if (number == 10 || number == 11)
				continue;
			sum += number;
			
		}
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);

	}

}
