package chapters.Chapter05;

public class Ex24 {

	public static void main(String[] args) {
		//Sum a series
		
		double sum = 0;
		
		for ( int i = 13; i <=9799; i+=22) {
			sum += i;
		}
		System.out.println("Sum of the series is: " + sum );

	}

}
