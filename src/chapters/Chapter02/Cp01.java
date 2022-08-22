package chapters.Chapter02;
  import java.util.Scanner;

       public class Cp01 {

	 
		public static void main(String[] args) {
			
			//shows the entered number
			
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = keyboard.nextInt();
			System.out.println("Your number=" + number);
		}
}

