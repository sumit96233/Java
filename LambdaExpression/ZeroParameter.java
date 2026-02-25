package LambdaExpression;
// zero parameter lambda function
interface Zparameter
{
    void fun1();
}

// single  parameter lambda function
interface Sparameter
{
    void fun1(int num);
    
}

// multi parameter lamba funtion

interface Mparamter
{
    void fun2(int a,int b);
    void fun3(int c);
}
public class ZeroParameter 
{
    public static void main(String[] args) 
    {
        Zparameter ob1 = () ->
        {
            System.out.println("Zero Parameter  Lambada Expression Call");
        };
        ob1.fun1();
        Sparameter ob2 = (a)-> System.out.println(a*a);
        ob2.fun1(10);

        Mparamter ob3 = (a,b)->
        {
            System.out.println("from multivalued lambda expression");
            System.out.println(a*b);
        };
        ob3.fun2(10, 20);
        ob3.fun3(4);
    }
    
}
