package myStrings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string : ");
		String input = sc.next();
		String reverse = "";
		
		for(int i=input.length()-1; i>=0; i--) {
			
			reverse = reverse+input.charAt(i);
			
		}
		if(input.equals(reverse)) {
			System.out.println("Given string is a palindrome....");
		}
		else {
		System.out.println("Given string is not a palindrome....");
		}
	}

}
