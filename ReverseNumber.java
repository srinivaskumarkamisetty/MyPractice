package practice;

import java.util.Scanner;

public class ReverseNumber {
	public Scanner scan;

	public ReverseNumber() {
		scan = new Scanner(System.in);
	}

	public int ScanNvalue() {
		System.out.println("Enter n value");
		int n = scan.nextInt();
		return n;
	}

	public int GetReverseValue(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}

	public int DisplayValue(int rev) {
		System.out.println(rev);
		return rev;
	}

	public boolean IsPalindrome(int n, int rev) {
		boolean status= (n == rev);
		return status;

	}
	public void DisplayPalindrome(boolean status) {
		if(status) 
			System.out.println("Is palindrome");
		
		else
			System.out.println("Is not palindrome");
	}

}
