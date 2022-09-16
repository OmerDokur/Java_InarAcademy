package chapters.Chapter05;

public class Ex23 {

	public static void main(String[] args) {
		//Demonstrate cancellation errors
		
		final int N = 50000;
		double sumLtoR = 0;
		double sumRtoL = 0;
		
		for ( int i = 1; i <=N; i++) {
			sumLtoR = sumLtoR + 1.0/i;
			sumRtoL = sumRtoL+1.0/(N-i+1);
		}
		
		System.out.println("Summation from left to right: " + sumLtoR);
		System.out.println("Summation from right to left: " + sumRtoL);

	}

}
