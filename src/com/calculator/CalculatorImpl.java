package com.calculator;

import com.customExceptions.InvalidDenominatorException;

public class CalculatorImpl implements Calculator {

	@Override
	public String addition(int a, int b) {
		int sum=a+b;
		return "Sum of "+a+" & "+" b "+" is "+sum;
	}

	@Override
	public String substraction(int a, int b) {
		int sub =a-b;
		return  "Substraction of "+a+" & "+b+" is "+sub;
	}

	@Override
	public String multiplication(int a, int b) {
		int mul=a*b;
		return "Multiplication of "+a+" & "+b+" is "+mul;
	}

	@Override
	public String Division(int a, int b) {
		if(b!=0) {
			return "Division of "+a +" & "+b+ " is "+(a/b);
		}
		else {
			try {
				throw new InvalidDenominatorException(" Invalid Denominator ,  Please Enter Valid Denominator !!!");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return "";
		}
		
	}

}
