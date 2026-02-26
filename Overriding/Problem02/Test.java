package Overriding.Problem02;

public class Test 
{
    public static void main(String[] args) 
    {
      Vehicle ob1 ;
      ob1 = new Vehicle();
      ob1.start();
      ob1 = new Car();
      ob1.start();
        
    }
    
}
