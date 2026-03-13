package Map.GetterAndSettersProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logic ob1 = new Logic();
        ArrayList<Student> result = new ArrayList<>();
        ArrayList<ArrayList<Student>> metaResult = new ArrayList<>();

        System.out.println("######## Enter Student Details ########");
        System.out.print("Enter Number Of Students: ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++)
        {
            System.out.println("Student No: "+i);
            System.out.print("Enter Your Name: ");
            String name = sc.next();
            System.out.print("Enter Your College Name: ");
            sc.nextLine();
            String clgname = sc.nextLine();
            System.out.print("Enter Your Age: ");
            int age = sc.nextInt();
            System.out.println();
            result = ob1.m1(age, name, clgname);
            metaResult.add(result); 
        }
    
         ob1.display(metaResult);

        

    }
}
