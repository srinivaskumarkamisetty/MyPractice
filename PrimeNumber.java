package practice;

import java.util.Scanner;

public class PrimeNumber {
	
	public static Scanner scan;
public static void main(String[] args) {
	int factors=0;
		scan=new Scanner(System.in);
		System.out.println("Enter n value");
		int n= scan.nextInt();
		
		
		
	
		for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.println(i);
			factors++;
		}}
		if(factors==2) {
			System.out.println("Is prime");}
		else {
			System.out.println("is not prime");}
		}
		}
			
		
		
	
	


