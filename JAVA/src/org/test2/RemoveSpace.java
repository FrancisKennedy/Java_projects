package org.test2;

public class RemoveSpace {
	public static void main(String[] args) {
		String str=" remove space ";
//		System.out.println(str.trim());
//		System.out.println(str.replaceAll("^[ \t]+|[ \t]+$", ""));
//		System.out.println(str.replaceAll("^[ \t]", ""));
//		System.out.println(str.replaceAll("[ \t]+$", ""));
		
		System.out.println(str.replaceAll("^[ \t]+|[ \t]+$",""));
		System.out.println(str.replaceAll("^[ \t]", ""));
		System.out.println(str.replaceAll("[ \t]+$", ""));
	}	
}