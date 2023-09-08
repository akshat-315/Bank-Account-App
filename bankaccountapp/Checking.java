package bankaccountapp;

public class Checking extends Account{
	//List the properties specific to a checking account
	private long debitCardNumber;
	private int debitCardPIN;
	
	//Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate(){
		rate = getBaseRate() * 0.15;
	}
	
	private void setDebitCard() {
		debitCardNumber = (long)(Math.random() * Math.pow(10, 12));
		debitCardPIN = (int)(Math.random() * Math.pow(10, 4));

	}
	
	//List any methods specific to the checking account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Checking Account features" + 
				"\nDebit CardNumber: " + debitCardNumber + 
				"\nDebit Card Pin: " + debitCardPIN
				);
	}
	
}
