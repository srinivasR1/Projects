package jspiders;

import java.util.Scanner;

public class Solution {
	static Scanner sc=new Scanner(System.in);
	static int a;
	static int b;
	static	void  acceptInput() {
		System.out.println("Enter 1st Number");
		a=sc.nextInt();
		System.out.println("Enter 2nd Number");
		b=sc.nextInt();
	}


	public static void main(String[] args) {

		Calculator calc=new CalculatorImpl(); // Abstraction->Upcasting

		while(true) {
			System.out.println("1:Addition\n2:substraction\n3:Multiplication");
			System.out.println("4:Division\n5:Exit");
			int choice=sc.nextInt();
			if(choice>=1 && choice<=4) {
				acceptInput();
			}


			switch (choice) {	// INFINITE LOOP
			case 1:
				System.out.println(calc.add(a, b));
				break;
			case 2:
				System.out.println(calc.Sub(a, b));
				break;
			case 3:
				System.out.println(calc.mul(a, b));
				break;
			case 4:
				System.out.println(calc.div(a, b));
				break;
			case 5:
				System.out.println("Thank You @!");
				System.exit(0);	// WE ARE TERMINATING

			default:
				System.out.println(calc.displayErrorMessage());
				break;
			}
			System.out.println("-------------------------------");


		}

	}
}
