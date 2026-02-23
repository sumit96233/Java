package Has_a;

public class BankAccount 
{
    private int accountNumber;
    private float balence;

    public int getAccountNumber() 
    {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
    public float getBalence() 
    {
        return balence;
    }

    public void setBalence(float balence) 
    {
        if(balence>0)
        this.balence += balence;
        else
        System.out.println("Enter Valid amonut");
    }

    public void withdraw(float balence) 
    {
        if(balence>0 && balence<=this.balence)
        {
            this.balence -= balence;
        }
        else
        {
            System.out.println("Enter Valid Amount");
        }
            
    }


}
