package practice;

import java.util.Scanner;

public class AtmFuctionality {
	public static Scanner scan;
	private static int AccountBalance = 5000;
	private static int Password = 12345;
	private static String deposit = "Deposit";

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out.println("Enter password");
		int password = scan.nextInt();

		if (Password == password) {

			scan = new Scanner(System.in);

			System.out.println("Deposit or withdrawl");
			String Deposit = scan.nextLine();

			if (deposit == Deposit) {
				scan = new Scanner(System.in);
				System.out.println("Enter deposit amount");
				int amount = scan.nextInt();

				System.out.println(AccountBalance = AccountBalance + amount);
			} else
				scan=new Scanner(System.in);
				System.out.println("Enter withdrawl amount");
			int withdrawlamount = scan.nextInt();
			System.out.println(AccountBalance = AccountBalance - withdrawlamount);
		}

		else
			System.out.println("Invalid password");
	}
}
