package Has_a;
class Viit
{
    private int rlnum;
    private String name;

    public int getRlnum() 
    {
        return rlnum;
    }

     public String getName()
    {
        return name;
    }

    public void setRlnum(int rlnum) 
    {
        this.rlnum = rlnum;
    }
   
    public void setName(String name) 
    {
        this.name = name;
    }

}
public class Student

    {
       
       public static void main(String[] args) 
       {
         Viit ob1 = new Viit();
         ob1.setName("MCA");
         ob1.setRlnum(1);
         System.out.println(ob1.getName());
         System.out.println(ob1.getRlnum());

         // course details
        System.out.println("Course Details");
        Course course1 = new Course();
        
        course1.setCourseId(1);
        course1.setCourseName("Java Programming");
        System.out.println(course1.getCourseId());
        System.out.println(course1.getCourseName());
       }
         
    }
