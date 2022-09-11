package weeks.week04;

public class ForLoop {

	public static void main(String[] args) {
		
		String s = "JavaFunnyMoments";
		
		int length = s.length();
		System.out.println(length);
		
		for(int i =0; i < length; i= i + 2) {
			System.out.print(s.charAt(i));
		}
		

	}
	

}
