package interviewprogrammes;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int number1=scan.nextInt();
		
		System.out.println("Enter 2nd Number");
		int number2=scan.nextInt();
		
		
		System.out.println("initial values "+number1+" and "+number2);
		
		number1=number1+number2;  //number1=5+7=12
		                          
		number2=number1-number2;  //number2=12-7=5
		
		number1=number1-number2;  //number1=12-5=7;
		
		System.out.println("Swap values "+number1+" and "+number2);
	}
}
