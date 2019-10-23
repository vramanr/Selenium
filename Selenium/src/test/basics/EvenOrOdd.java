package test.basics;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the First number");
int Number1;
Scanner sc = new Scanner(System.in);
Number1 = sc.nextInt();

if (Number1%2 == 0) {
	System.out.println("The Number is Even");
}
else {
	System.out.println("The Number is Odd");
}


	}

}
