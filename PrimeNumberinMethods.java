package practice;

import java.util.Scanner;

public class PrimeNumberinMethods {
	public Scanner scan;

	public int ScanNvalue() {
		scan = new Scanner(System.in);
		System.out.println("Enter N value");
		int n = scan.nextInt();
		return n;
	}

	public int Displayfactors(int n) {
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 ){
				System.out.println(i);
				factors++;
			}

		}
		return factors;
	}

	public int Displayfactorscount(int n, int factors) {
		System.out.println("factors for"+n+ "  is  " +factors);
		return factors;

	}
	public boolean isPrime(int factors) {
		return factors==2;
	}
	public void NumberType(int n,String Type) {
		System.out.println(n+"is"+Type);
	}
public static void main(String[] args) {
PrimeNumberinMethods number=new PrimeNumberinMethods();
int n=number.ScanNvalue();
int factors=number.Displayfactors(n);
int factorscount=number.Displayfactorscount(n, factors);
boolean status=number.isPrime(factorscount);
if(status) {
	System.out.println("n is prime");}
else
	System.out.println("n is not prime");
}

}
