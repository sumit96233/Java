package Problems.Example02;

public class Emp 
{
    private String name;
    private int id;
    private double salary;
    Emp(String name,int id,double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public double getSalary() 
    {
        return salary;
    }
    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    void empDetails()
    {

        System.out.println("Name: "+getName());
        System.out.println("ID: "+getId());
        System.out.println("Salar: "+getSalary());
        System.out.println();
    }
    void calculateBonus()
    {
        double tempSalary = getSalary();
        double bouns = (tempSalary/100)*10;
        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getSalary());
        System.out.println("Bonus: "+bouns);
    }
    

    
}
