package com.calculator;

import java.util.Scanner;

import com.customExceptions.InvalidChoiceException;

public class Soluction {

	static Scanner sc=new Scanner(System.in);
	static int a;
	static int b;
	
	public static void acceptInputs() {
		System.out.println(" Enter 1st Number ");
		a=sc.nextInt();
		System.out.println(" Enter 2nd Number ");
		b=sc.nextInt();
	}
	
	public static void main(String[] args) {
	
		Calculator calculator=new CalculatorImpl();
		
		while(true) {
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		System.out.println("5:Exit");
		
		int choice=sc.nextInt();
		if(choice>=1 && choice<=4) {
			acceptInputs();
		}
		
		switch(choice) {
		case 1:
			System.out.println(calculator.addition(a, b));
			break;
		case 2:
			System.out.println(calculator.substraction(a, b));
			break;
		case 3:
			System.out.println(calculator.multiplication(a, b));
			break;
		case 4:
			System.out.println(calculator.Division(a, b));
			break;
		case 5:
			System.out.println("Thank You @!");
			System.exit(0);
		default:
			try {
				throw new InvalidChoiceException("Invalid choice, Please Enter Valid Choice !!!");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			break;
			
		}
		System.out.println("-------------------------------");
		}
	}

}
