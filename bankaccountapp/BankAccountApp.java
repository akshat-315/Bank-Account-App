package bankaccountapp;

import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) {
		String file = "C:\\\\Users\\\\Akshat Sharma\\\\Downloads\\\\NewBankAccounts.csv\\";
		
		
//		Checking c1 = new Checking("Akshat Sharma", "123456789", 1500);
//		c1.showInfo();
//		
//		System.out.println("********************");
//		
//		Savings s1 = new Savings("Prakhar Rao", "987654321", 2500);
//		s1.showInfo();
		
		//Read a CSV file then create new accounts based on that data
		List<String[]> newAccounts = utilities.CSV.read(file);		
		for(String[] account : newAccounts) {
			System.out.println("NEW ACCOUNT");
			System.out.println(account[0]);
			System.out.println(account[1]);
			System.out.println(account[2]);
		}
	}
}
