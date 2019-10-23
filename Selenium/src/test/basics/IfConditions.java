package test.basics;

import java.util.Scanner;

public class IfConditions {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter the Age for Eligibility of Vote");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("You are eligible for voting");
		} else {
			System.out.println("You are minor");
		}
		
		
	}
}
