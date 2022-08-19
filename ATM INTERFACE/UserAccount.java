import java.text.DecimalFormat;
import java.util.Scanner;

public class UserAccount {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	

	public int getCustomerNumber() {
		return customerNumber;
	}

	

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	

	public int getPinNumber() {
		return pinNumber;
	}

	

	public double getCurrentBalance() {
		return currentBalance;
	}

	

	public double getSavingBalance() {
		return savingBalance;
	}

	

	public double calcCurrentWithdraw(double amount) {
		currentBalance = (currentBalance - amount);
		return currentBalance;
	}

	

	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}



	public double calcCurrentDeposit(double amount) {
		currentBalance = (currentBalance + amount);
		return currentBalance;
	}

	

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}

	

	public void getCurrentWithdrawInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.print("Enter the amount you want to withdraw from Current Account: ");
		double amount = input.nextDouble();

		if ((currentBalance - amount) >= 0) {
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account balance: " + moneyFormat.format(currentBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	

	public void getSavingWithdrawInput() {
		System.out.println("Savings Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Enter the amount you want to withdraw from Savings Account: ");
		double amount = input.nextDouble();

		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Savings Account balance: " + savingBalance + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	

	public void getCurrentDepositInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.print("Enter the amount you want to deposit in Current Account: ");
		double amount = input.nextDouble();

		if ((currentBalance + amount) >= 0) {
			calcCurrentDeposit(amount);
			System.out.println("New Current Account balance: " + moneyFormat.format(currentBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	

	public void getSavingDepositInput() {
		System.out.println("Savings Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Enter the amount you want to deposit in Savings Account: ");
		double amount = input.nextDouble();

		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Savings Account balance: " + moneyFormat.format(savingBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	
	public void getSavingTransfer() {
		System.out.println("Savings Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Enter the amount you want to Transfer: ");

		int amount = input.nextInt();

		if(amount > savingBalance) 
		
		System.out.println("Balance is insuficient");
		else {
			
		System.out.println("The amount has been transfered successfully");
		savingBalance = savingBalance - amount;
		System.out.println("New Savings Account balance: " + moneyFormat.format(savingBalance) + "\n");

		}
		System.out.println( "");
		

	}

	public void getCurrentTransfer() {
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.print("Enter the amount you want to Transfer: ");

		int amount = input.nextInt();

		if(amount > currentBalance) 
		
		System.out.println("Balance is insufficient");
		else {
			
		System.out.println("The amount has been transfered successfully!");
		currentBalance = currentBalance - amount;
		System.out.println("New Current Account balance: " + moneyFormat.format(currentBalance) + "\n");

		}
		System.out.println( "");
		

	}

	private int customerNumber;
	private int pinNumber;
	private double currentBalance = 0;
	private double savingBalance = 0;
}