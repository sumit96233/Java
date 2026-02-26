package LambdaExpression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Prob03 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(79);
        list.add(23);
        list.add(60);

        
        System.out.println("List Etration Using Lambda Expression");
        list.forEach(n-> {if(n%2==0) System.out.print(n+" ");});
        System.out.println();
        Runnable r = () -> System.out.println("hellow lambda");
        r.run();
        Predicate<String> isLong = str -> str.length()>5;
        System.out.println(isLong.test("Sumit Thakare"));
        Function<Integer,Integer> sqr = n-> n*n;
        System.out.println(sqr.apply(10));

        
    }
    
}
