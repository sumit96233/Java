package Problems.Example01;

public class Student
{
    String name;
    int rlNum;
    char grade;
    Student(String name,int rollNum,char grade)
    {
        this.name =name;
        this.rlNum = rollNum;
        this.grade = grade;
        
    }
    void display()
    {
        System.out.println();
        System.out.println("Student Details---------");
        System.out.println("Student Name: "+this.name);
        System.out.println("Roll Number: "+this.rlNum);
        System.out.println("Grade: "+this.grade);
    }
     void updateGrade(char grade)
    {
        System.out.println();
        System.out.println("Upgrade Grade Module");
        this.grade = grade;
        System.out.println("Student Details After updating Grade");
        display();

    }

    
}
