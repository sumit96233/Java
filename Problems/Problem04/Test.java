package Problems.Problem04;

public class Test 
{
    
    public static void main(String[] args) 
    {
        Book ob1 = new Book("Java Programming", "Mr. Pravin Bagal","java",500);
        ob1.display();
        ob1.addDiscount(10);
        Book ob2 = new Book("Basic Of Cyber Security", "Dr. Manyank Sir","cyber",500);
        Book ob3 = new Book("Software Engineering", "Mr. Anil Shrivastav ","SE",500);
        Book ob4 = new Book("Sham Chi Aii", "Mr. Sumit thakare","sm",500);
        ob2.display();
        ob3.display();
        ob4.display();
    }
    
}
