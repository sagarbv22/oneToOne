package com.ineuron.ai;

public class Employee {
	
	private String empName;
	private String empId;
	private String empAddr;
	
	Account account;
	
	
	public Employee(String empName, String empId, String empAddr, Account account) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAddr = empAddr;
		this.account = account;
	}
	
	
	
	public void getEmpDetails() {
		
		System.out.println("Employee Details:");
		System.out.println("Employee name: "+empName);
		System.out.println("Employee Id: "+ empId);
		System.out.println("Employee Address: "+ empAddr);
		System.out.println("=============================");
		System.out.println("Employee Account details:");
		System.out.println("Account No: "+ account.acNum);
		System.out.println("Account holderName: "+ account.acHolderName);
		System.out.println("Account branch: "+ account.acBranch);
		
		
	}





	

}
