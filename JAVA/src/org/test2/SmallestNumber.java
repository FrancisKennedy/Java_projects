package org.test2;

import java.util.ArrayList;
import java.util.List;

public class SmallestNumber {
	
	int giveArray[]= {3,2,5,8,9,6,4,7};
	
	private void findsmallnum() {
		int smallestnum=Integer.MAX_VALUE;
		
		for (int i=0;i<giveArray.length;i++) {
			
			if (giveArray[i]<smallestnum) {
				smallestnum=giveArray[i];
				}	
		}
		System.out.println("Smallest number is : "+smallestnum );
	}
	public static void main(String[] args) {
		SmallestNumber array=new SmallestNumber();
		array.findsmallnum();
		
		
			}
	}