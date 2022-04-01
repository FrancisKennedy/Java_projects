package org.fastfood;

public class SideDish {
	public SideDish() {
		this(300);
		System.out.println("Non para constructor/Default");
		System.out.println('\n'+"***Main Course***"+'\n');
	}
	public SideDish(String Nonveg_sidedish) {
		this("Gobi manchurian",200);
		System.out.println("String para constructor");
		System.out.println("2: "+Nonveg_sidedish);
	}
	public SideDish(int Price) {	
		this("Grill");
		System.out.println("Int para constructor");
		System.out.println("Rs:"+Price);
	}	
	public SideDish(String veg_sidedish,int Price) {
		System.out.println("***Side Dish***"+'\n');
		System.out.println("String , Int para constructor");
		System.out.println("1: "+veg_sidedish+'\n'+"Rs:"+Price);
	}
	
}	


