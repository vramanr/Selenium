package test.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int Factorial = 1,Number;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		Number = sc.nextInt();
				
	for (int i=1;i<=Number;i++) {
		Factorial=Factorial*i;
		
	}
	System.out.println("Factorial of Given Number is :" +Factorial);
	}
}
