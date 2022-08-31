package chapters.Chapter04;

import java.util.*;

public class Cp04 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.next();
		char ch = input.charAt(0);
		
		if ('A' <= ch && ch <= 'Z') {
			System.out.println(ch + " uppercase letter ");
		} else if ('a'<= ch && ch <= 'z')
			System.out.println(ch + " lowercase letter ");
		else if ('0'<= ch && ch <= '9')
			System.out.println(ch + " number");
	}

}
