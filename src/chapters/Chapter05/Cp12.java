package chapters.Chapter05;

public class Cp12 {

	public static void main(String[] args) {
		//Harc Hesaplama
		
		double harc = 10_000;
		
		int yil = 0;
		
		while (harc <20_000) {
			harc *= 1.07;
			yil++;
			
		}
		
		System.out.printf(yil + " yil sonra harc: %.2f olacaktir." , harc);

	}

}
