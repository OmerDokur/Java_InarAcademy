package chapters.Chapter04;

import java.util.*;

public class Cp05 {

	public static void main(String[] args) {
		//character class
		
		Character ch1;
		char ch2 = 'G';
		
		System.out.println(Character.isLowerCase(ch2));
		
		System.out.println("isDigit('a') is "+ Character.isDigit('a'));
		System.out.println("isLetter('a') is "+ Character.isLetter('a'));
		System.out.println("isLowerCase('a') is "+ Character.isLowerCase('a'));
		System.out.println("isUpperCase('a') is "+ Character.isUpperCase('a'));
		System.out.println("toLowerCase('T') is "+ Character.toLowerCase('T'));
		System.out.println("toUpperCase('q') is "+ Character.toUpperCase('q'));
		
        
	}

}
