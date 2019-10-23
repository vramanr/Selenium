package test.basics;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the First number");
int Number1 ,Number2;
Scanner sc = new Scanner(System.in);
Number1 = sc.nextInt();
System.out.println("Enter the Second number");
Number2 = sc.nextInt();

if (Number1>Number2) {
	System.out.println("Number 1 "+Number1+" is greater");
}else if (Number1==Number2) {
	System.out.println("both are equal");
}else {
	System.out.println("Number 2 "+Number2+" is greater");
}


	}

}
