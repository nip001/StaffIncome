package com.juaracoding;

import java.util.Scanner;

public class StaffIncomeReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukan nama staff = ");
		String name = sc.next();
		System.out.print("Masukan id staff = ");
		String id = sc.next();
		System.out.print("Masukan income type staff = ");
		String incomeType = sc.next();
		System.out.print("Masukan income amount staff = ");
		double amount = sc.nextDouble();
		System.out.print("Masukan tax staff = ");
		double tax = sc.nextDouble();
		
		
		Income in = new Income(incomeType, amount, tax,0.0);
		Staff st = new Staff(name, id, in);

		st.displayStaffInfo();
		st.displayIncomeInfo();
		
	}

}

