package org.test;

import java.util.Scanner;

public class PalindromStrings {
	public static void main(String[] args) {		
		String str="",str2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string / int to check if it is a palindrome");
		str2= scan.nextLine();
		int length = str2.length();
		for (int i = length-1; i >=0; i--) {
			str=str+str2.charAt(i);
					
		}
		if (str2.equals(str)) {
			System.out.println("This string is a palindrome");
		}
		else {
			System.out.println("This is not a palindrome");
		}
		
		
	}

}
