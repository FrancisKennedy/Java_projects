package org.test;

public class PalindromeNum {
	public static void main(String[] args) {
		int i=0,rev,num;
		int a=14341;
		num=a;
		while (a>0) {
			rev=a%10;
			i=i*10+rev;
			a=a/10;
		}
			if (num==i) {
				System.out.println("palindrome num");
			}
			else {
				System.out.println("not palindome num");
			}
			
			
		
		}
		}
	
		
	


