package Abstration;

abstract class a
{
    a()
    {
        System.out.println("happy");

    }
    public void fun1()
    {
        System.out.println("from method fun1 class: a");
    }
    public abstract void fun2();
}
public class Demo extends a
{
public static void main(String[] args) 
    {
        Demo ob1 = new Demo();
        ob1.fun1();
        ob1.fun2();

         
    }
    @Override
    public void fun2() 
    {
     System.out.println("abstract method");
    }

  
}
