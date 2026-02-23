package Polymorphism;

public class MethodOverloadingExample 
{
    public int multiply(int num,int num1)
    {
        System.out.println("call with two parameter");
        return num+num1;
    }

    public int multiply (int num,int num1,int num3)
    {
        System.out.println("call with three parameter");
        return num*num1*num3;
    }

    public int mu1(int num1,int num2)
    {
        System.out.println("integer call");
        return num1*num2;
    }
    public double mu1(double num1,double num2)
    {
        System.out.println("Double Call");
        return num1*num2;
    }


    
}
