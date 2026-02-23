// 🔵 Practice Problem 4 (Real-World Style)
// 👉 Problem: Person HAS-A BankAccount
// 1️⃣ BankAccount class
// accountNumber
// balance
// Method: deposit(double amount)
// Method: withdraw(double amount)
// 2️⃣ Person class
// personName
// BankAccount account
// 3️⃣ Demo
// Create account
// Assign to person
// Deposit money        
// Withdraw money
// Print final balance
package Has_a;

public class BankDemo 
{
    public static void main(String[] args) 
    {
        // Bank Information for person 1
        BankAccount ob1 = new BankAccount();
        ob1.setAccountNumber(10);
        ob1.setBalence(2000);

        // information for person1
        Person p1 = new Person();
        p1.setAccount(ob1);
        p1.setName("Sumit");

       
        System.out.println(p1.getName());
        System.out.println(p1.getAccount().getBalence());
        p1.getAccount().withdraw(500);
        System.out.println(p1.getAccount().getBalence());

        // balence and account inforamtion for person2
        BankAccount ob2 = new BankAccount();
        ob2.setAccountNumber(100);
        ob2.setBalence(5000);
        Person p2 = new Person();
        p2.setAccount(ob2);
        p2.setName("Patil");

        System.out.println();

        System.out.println("Person 2 ------------------------");
        System.out.println(p2.getName());
        System.out.println(p2.getAccount().getBalence());
        p2.getAccount().withdraw(500);
        System.out.println(p2.getAccount().getBalence());

  
    }
    
}
