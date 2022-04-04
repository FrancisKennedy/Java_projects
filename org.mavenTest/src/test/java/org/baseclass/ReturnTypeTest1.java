package org.baseclass;


	public class ReturnTypeTest1 {
		   public int add() { // without arguments
		      int x = 30;
		      int y = 70;
		      int z = x+y;
		      return z;
		   }
		   public static void main(String args[]) {
		      ReturnTypeTest1 test = new ReturnTypeTest1();
		      int add = test.add();
		      System.out.println("The sum of x and y is: " + add);
		   }
		}
