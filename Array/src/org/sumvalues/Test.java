package org.sumvalues;

public class Test {
	public static void main(String[] args) {
		 int a[] = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
	int r = 0;
	//float f = 0;
  
      for (int i = 0; i<10; i++) {  
   	   r = r+a[i] ;
   	  //f = r/10;
      }

	   System.out.println("Array values  " + r); 
      float f = r/10f;
      
   	   System.out.println("Sum values of an array =  " + f); 
      
       
	

}
}
