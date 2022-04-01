package org.fastfood;

public class MainCourse extends SideDish {
	
	public MainCourse() {
		this(1000.75f);
		System.out.println("Non para constructor/Default");		
	}
	public MainCourse(String Non_veg) {
		
		System.out.println("String para constructor");	
		System.out.println("3: "+Non_veg);
	}
	public MainCourse(int Rice_Price) {
		this("Chicken Fried Rice");
		System.out.println("Int para constructor");	
		System.out.println("Rs:"+Rice_Price);
	}
	public MainCourse(String Veg, int Price) {
		this(250);
		System.out.println("String, Int para constructor");
		System.out.println("4: "+Veg+'\n'+"Rs:"+Price);
	}
	public MainCourse(float total) {
		this("veg fried rice",200);
		System.out.println('\n'+"Float para constructor");
		System.out.println("Total Amount = Rs:"+total+'\n');
	}
	public static void main(String[] args) {
		MainCourse mc = new MainCourse();
		
	}

}
