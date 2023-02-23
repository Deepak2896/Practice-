import java.util.Scanner;

public class ATM {

	public static void main(String args[]) {

		int balance = 100000, withdraw, deposit;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Choose Option..");
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for EXIT");
		System.out.print("Choose the operation you want to perform:");

		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.print("Enter money to be withdrawn:");

			withdraw = sc.nextInt();

			if (balance >= withdraw) {

				balance = balance - withdraw;
				System.out.println("Please collect your money");
				System.out.println("Rest Balance :" + balance);

			} else {

				System.out.println("Insufficient Balance");
			}
			break;

		case 2:

			System.out.print("Enter money to be deposited:");

			deposit = sc.nextInt();

			balance = balance + deposit;
			System.out.println("Your Money has been successfully deposited");
			System.out.println("Updated Balane :" + balance);

			break;

		case 3:

			System.out.println("Balance : " + balance);
			break;

		case 4:

			System.out.println("Thank you For Using.....");
			System.exit(0);
		}
		sc.close();
	}

}
