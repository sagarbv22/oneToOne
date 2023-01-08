package com.ineuron.ai;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac = new Account("Ac125367d", "Sagar", "Biligere");
		
		Employee em = new Employee("Sagar", "egt1345", "Bpura", ac);
		
		em.getEmpDetails();
		

	}

}
