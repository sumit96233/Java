package interface_java.Example02;

public class Test implements I3,I2,I1
 {
    @Override
    public void fun3() 
    {
       System.out.println("Function 3");
        
    }
    @Override
    public void fun2() 
    {
       
         System.out.println("Function 2");
        
    }
    @Override
    public void fun1() 
    {
        System.out.println("Function 3");
        
    }
}
