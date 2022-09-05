package chapters.Chapter04;

public class Cp12 {

	public static void main(String[] args) {
		//startsWith-endsWith-contains
				String str1 = "Welcome to Java";
				System.out.println(str1.startsWith("We"));
				System.out.println("Welcome to Java".startsWith("we"));
				System.out.println("Welcome to Java".endsWith("va"));
				System.out.println("Welcome to Java".contains("to"));
				System.out.println("Welcome to Java".contains("To"));

	}

}
