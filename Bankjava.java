package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class Bankjava {
	public Scanner scan;
	private int AccountBalance = 5000;
	private int Password = 12345;

	private int Scanpassword() {
		scan = new Scanner(System.in);
		System.out.println("Enter password");
		int password = scan.nextInt();
		return password;

	}

	private int DisplayAccountBalance(int password) {
		if (this.Password == password) {
			System.out.println(AccountBalance);
		} else
			System.out.println("invalid password");
		return AccountBalance;
	}

	private int Deposit() {
		System.out.println("Enter deposit amount");
		int amount = scan.nextInt();
		return amount;

	}

	private int accountbalance(int password, int amount) {
		if (this.Password == password) {
			System.out.println(AccountBalance = AccountBalance + amount);
		} else {
			System.out.println("invalidpassword");
		}
		return AccountBalance;
	}

	private int Withdrawl() {
		System.out.println("Enter withdrawl amount");
		int withdrawlamount = scan.nextInt();
		return withdrawlamount;
	}

	private int accountBalance(int password, int withdrawlamount) {
		if (this.Password == password) {
			System.out.println(AccountBalance = AccountBalance - withdrawlamount);
		} else {
			System.out.println("invalidpassword");
		}
		return AccountBalance;

	}

	public void AccountBalance() {
		int pass = this.Scanpassword();
		int balance = this.DisplayAccountBalance(pass);
		int amount = this.Deposit();
		int TotalBalance = this.accountbalance(pass, amount);
		int withdrawl = this.Withdrawl();
		int Totalbalance = this.accountBalance(pass, withdrawl);

	}
}