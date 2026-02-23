package Problems.Exmaple03;

public class Test 
{
    public static void main(String[] args) 
    {
      Bank user1 = new Bank(101,"Sumit Thakare",5000);
      Bank user2 = new Bank(102,"Kedar Kute",7000);
      Bank user3 = new Bank(103,"Aasif Shaikh",10000);
      user1.details();
      user1.depositeMoney(1000);
      user1.details();
      user1.withDrawMoney(3000);
      user2.details();
      user3.details();
    }
    
}
