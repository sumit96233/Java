package Unit01;
class Temp 
    {
        void f1()
            {
                System.out.println("From 1st Method");
            }
        
        void f2()
            {
                System.out.println("From 2nd Method");
            }
    }
public class Demo
    {
        public static void main(String[] args)

            {
                    Temp ob1 = new Temp();
                    ob1.f1();
                    ob1.f2();
                    
            }
          
    }
