package jspiders;

public class CalculatorImpl implements Calculator{

	@Override
	public String add(int a, int b) {
		int sum=a+b;
		return "sum of "+a+" & "+b+" is "+sum;
	}

	@Override
	public String Sub(int a, int b) {
		
		return "Difference of "+a+" & "+b+" is "+(a-b);
	}

	@Override
	public String mul(int a, int b) {
		
		return "Product of "+a+" & "+b+" is "+(a*b);
	}

	@Override
	public String div(int a, int b) {
		if(b!=0) {
		return "Division of "+a+" & "+b+" is "+(a/b) ;
		}
		else {
			return "invalid Denominator";
		}
	}

	@Override
	public String displayErrorMessage() {
		
		return "Invalid choice, Please Enter Valid Choice !!!";
	}

}
