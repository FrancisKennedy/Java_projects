package org.emp;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Employee Details ");
		System.out.print("EmpId: ");
		int empId = s.nextInt();
		System.out.print("EmpName: ");
		String empName = s.next();
		System.out.print("EmpEmail: ");
		String empEmail = s.next();
		System.out.print("Phone Number: "); 
		double empPhoneno = s.nextDouble();
		System.out.print("Salary: ");
		double empSalary = s.nextDouble();
		System.out.print("EmpGender: ");
		String empGender = s.next();
		System.out.print("EmpCity: "); 	
		String empCity = s.next();	
		System.out.println("EmpId: " + empId);
	
		s.close();
	}

}
