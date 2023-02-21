package interviewprogrammes;

import java.util.Scanner;

public class Factorialvalue {

public static void main(String[] args) {
	
	int factor=1;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter number");
	int number=scan.nextInt();
	
	if(number<=0) {
		System.out.println("we cannot find factorial for Zero");
	}
	else {
		for(int counter=number;counter>=2;counter--) {
			factor=factor*counter;
		}
		System.out.println("factorialcount="+factor);
	}
	
	
}
	
}

