package com.juaracoding;

public class Staff {

	private String name,id;
	private Income income;
	
	public Staff(String name, String id, Income income) {
		super();
		this.name = name;
		this.id = id;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Income getIncome() {
		return income;
	}
	
	public double calculateNetIncome() {
		return income.getAmount()-income.getTotalTax();
	}
	
	public void displayStaffInfo() {
		System.out.println("===========STAFF INFO==========");
		System.out.println("NAMA : "+name);
		System.out.println("ID STAFF : "+id);
		System.out.println("===========STAFF INFO==========");
	}
	
	public void displayIncomeInfo() {
		System.out.println("===========INCOME INFO==========");
		System.out.println("INCOME TYPE : "+income.getIncomeType());
		System.out.println("AMOUNT : "+income.getAmount());
		System.out.println("TOTAL TAX : "+income.getTotalTax());
		System.out.println("NET INCOME : "+calculateNetIncome());
		System.out.println("===========INCOME INFO==========");
	}
	
}
