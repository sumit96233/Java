package Overriding.Problem02;

public class Car extends Vehicle
{
    @Override 
    void start()
    {
        System.out.println("Child Method Satrt");
        super.start();

    }
    
}
