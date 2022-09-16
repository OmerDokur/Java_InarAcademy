package chapters.Chapter05;

public class Ex13 {

	public static void main(String[] args) {
		
		int n = 1;
		
		while (Math.pow(n, 3) <= 12000) {
			n++;
		}
		n--;
		
		System.out.println("The n is " + n);
		System.out.println("The n^3 is " + Math.pow(n, 3));

	}

}
