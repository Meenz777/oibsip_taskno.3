import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MainMenu extends UserAccount {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	

	public void getLogin() throws IOException {
		int x = 1;

		do {
			try {
				
				data.put(123456789, 1234);
				data.put(123456780, 1230);

				System.out.println("Welcome to the ATM Interface Project!");

				System.out.print("Enter your Customer ID: ");
				setCustomerNumber(menuInput.nextInt());

				System.out.print("Enter your Pin Number: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
				x = 2;
			}
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Your customer id and/or password do not match!!" + "\n");
		} while (x == 1);
	}

	

	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("1 - Current Account");
		System.out.println("2 - Savings Account");
		System.out.println("3 - Exit");
		System.out.print("Choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getCurrent();
			break;

		case 2:
			getSaving();
			break;

		case 3:
			System.out.println("Thank You for using our ATM service. Hope you have a good day!");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}

	

	public void getCurrent() {
		System.out.println("Current Account: ");
		System.out.println("1 - View Account Balance");
		System.out.println("2 - Withdraw Money");
		System.out.println("3 - Deposit Money");
		System.out.println("4 - Transfer Money");
		System.out.println("5 - Quit");
		System.out.print("Choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Current Account Balance: " + moneyFormat.format(getCurrentBalance()) + "\n");
			getAccountType();
			break;

		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCurrentDepositInput();
			getAccountType();
			break;

		case 4:
			getCurrentTransfer();
			getAccountType();
			break;

		
		case 5:
			System.out.println("Thank You for using our ATM service. Hope you have a good day!");
			break;
			

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getCurrent();
		}
	}

	

	public void getSaving() {
		System.out.println("Savings Account: ");
		System.out.println("1 - View Account Balance");
		System.out.println("2 - Withdraw Money");
		System.out.println("3 - Deposit Money");
		System.out.println("4 - Transfer Money");
		System.out.println("5 - Quit");
		System.out.print("Choice: ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Savings Account Balance: " + moneyFormat.format(getSavingBalance()) + "\n");
			getAccountType();
			break;

		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		case 4:
			getSavingTransfer();
			getAccountType();
			break;

		case 5:
			System.out.println("Thank You for using our ATM service. Hope you have a good day!");
		

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getSaving();
		}
	}

	int selection;
}