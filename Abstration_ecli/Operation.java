package Abstration_ecli;

public class Operation implements Sum,Multiplication,Subtration,Division
{
	public void sum(int num1,int  num2)
	{
		System.out.println(num1+"  "+num2);
		System.out.println("Addition: "+(num1+num2));
	}
	public void mul(int num1,int  num2)
	{   
		System.out.println(num1+"  "+num2);
		System.out.println("Multiplication: "+num1*num2);
	}

	public void div(int num1,int  num2)
	{
		System.out.println(num1+"  "+num2);
		System.out.println("Division: "+num1/num2);
	}

	public void sub1(int num1,int num2)
	{
		int result = num1-num2;
		System.out.println(num1+"  "+num2);
		System.out.println("Subtration: "+result);
	}


}
