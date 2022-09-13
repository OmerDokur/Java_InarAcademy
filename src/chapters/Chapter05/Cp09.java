package chapters.Chapter05;

public class Cp09 {

	public static void main(String[] args) {
		//nested loops
		
		int count = 0;
		for (int i = 0; i<3 ; i++) {
			for (int j = 0; j<3; j++) {
				for (int k=0; k<3 ; k++) {
					count++;
					System.out.println("count: " + count + " -i: " + i + " j: " + j + " k: " + k);
				}
			}
			
		}

	}

}
