package org.testMeth;

public class Poly extends Meth {
	public void over() {
		System.out.println("5%");
		
	}
	public void savings() {
		System.out.println("12%");
	}
	public void arg(String CustomerName,char Gender ) {
		System.out.println( "Customer Name "+CustomerName +'\n'+"Gender "+ Gender);
	}
	public static void main(String[] args) {
		Poly p = new Poly();
		p.arg("Keny", 'm');
		
		p.over();
		p.savings();
		
	}

}
