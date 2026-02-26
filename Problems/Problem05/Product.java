package Problems.Problem05;

public class Product 
{
    String name;
    static int tempid=1;
    double price;
    int quantity;
    int id;
    
    Product(String name,double price,int qn)
    {
        if(price>=0 && qn>0)
        {
        this.name = name;
        this.id = tempid;
        this.price = price;
        this.quantity= qn;
        Product.tempid++;
        }
        else
        {
            System.out.println("Please Enter Valid Details");
        }
       
    }
    
    void display()
    {
        System.out.println("----------Product Details--------");
        System.out.println("Product ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
        System.out.println("Quantity: "+this.quantity);
        double total = price*quantity;
        System.out.println("Total: "+total);

    }

    
}
