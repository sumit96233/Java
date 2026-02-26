package Problems.Problem04;

public class Book 
{
    String title;
    String author;
    double prcie;
    String isbn;

    Book(String title,String author,String isbn,double price)
    {
        this.title = title;
        this.author = author;
        this.prcie = price;
        this.isbn = isbn;
    }
    void display()
    {
        System.out.println("--------Books Details---------");
        System.out.println("Name: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.prcie);
        System.out.println();
        
    }
    void addDiscount(int discount)
    {
        
        if(discount>0)
        {
            double dis = (this.prcie/100)*discount;
            System.out.println("Old Price: "+this.prcie);
            System.out.println("Discount: "+dis);
            this.prcie-=dis;
            System.out.println("Title: "+this.title);
            System.out.println("New Price: "+this.prcie);
            
        }
        else
        {
            System.out.println("Please Enter Valid Discount");
        }
        System.out.println();
        

       
    }

    
    
}
