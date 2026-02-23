package Problems.Exmaple03;

public class Bank 
{
    int accNum;
    String name;
    double balence;
    Bank(int accNum,String name,double balence)
    {
        this.accNum = accNum;
        this.name = name;
        this.balence = balence;
    }
    private void getBalence()
    {
        System.out.println("Balence: "+this.balence);
        

    }
    void depositeMoney(int amount)
    {
        if(amount>0)
        {
            this.balence+=amount;
            System.out.println(amount+" Credited");
            getBalence();
            System.out.println();
        }
        else
        {
            System.out.println("Enter Valid Details");
            System.out.println();
        }
    }
    void withDrawMoney(int amount)
    {
        if(amount>0 && amount<=this.balence)
        {
            this.balence-=amount;
            System.out.println(amount+" Debited From Your Account");
            getBalence();
            System.out.println();
        }
        else
        {
            System.out.println("Enter Valid Details");
            System.out.println();
        }
    }
    void details()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Balence: "+this.balence);
        System.out.println("Account Number: "+this.accNum);
        System.out.println();
    }

    
}
