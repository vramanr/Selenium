package test.basics;

public class DataTypes {

	public static void main(String[] args) {
		
		byte b = 10;
		short a = 11;
		int c = 24;
		long d = 25;
		float e = 1.0f;
		double f = 10.34;
		boolean g = true;
		String h = "Venkat";
		
		int Addition;
		Addition = a+b;
		System.out.println("Addition "+ Addition);
		long Sub;
		Sub = d-c;
		System.out.println("Sub "+ Sub);
		double Multiplication;
		Multiplication = e*f;
		System.out.println("Mul "+ Multiplication);
		double Division;
		Division = f/e;
		System.out.println("Div "+ Division);
		double Remainder;
		Remainder = a%b;
		System.out.println("Remainder "+ Remainder);
		System.out.println(a);
		System.out.println(b);
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);
		++a;
		--b;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
}
