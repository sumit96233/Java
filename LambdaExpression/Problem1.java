package LambdaExpression;
interface Add
{
    int addition(int a,int b);
}
interface Mul
{
    int multiply(int a,int b);
}
interface FuncInterface
{
    void abstractFun(int x);

    default void normalFunc()
    {
        System.out.println("hellow from normal function");
    }
}
public class Problem1
{
    public static void main(String[] args) 
    {

        Add add = (a,b)->a+b;
        int result = add.addition(2,4);
        System.out.println(result);
        Mul ob1 = (a,b)->a*b;
        int re1 = ob1.multiply(3, 4);
        System.out.println(re1);
        
       

            
                   
        

        
    }
    
}
