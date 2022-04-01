package org.sumvalues;

public class SumValue {
	public static void main(String[] args) {
		 int a[] = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
	int r = 0;
  
      for (int i = 0; i<10; i++) {  
   	   r = r+a[i];
      
      

	   System.out.println("Array values  " + a[i]); 
      }
   	   System.out.println("Sum values of an array =  " + r); 
      
       
	

}
}

