package test.basics;

import java.util.Scanner;

public class IfConditionForCheckPositiveNagativeZero {

	public static void main(String[] args) {

		int Number;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		Number= sc.nextInt();
		if (Number <0) {
			System.out.println("Number is Negative");
		}else if(Number==0)
		{
			System.out.println("Number is Zero");
		}else
		{
			System.out.println("Number is Positive");
		}
		
	}

}
