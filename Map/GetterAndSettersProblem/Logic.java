package Map.GetterAndSettersProblem;

import java.util.ArrayList;

public class Logic {
   public ArrayList<Student> m1(int age,String college,String name)
	{
		Student s = new Student();
		s.setAge(age);
		s.setCollge(college);
		s.setName(name);
		ArrayList<Student> s1 = new ArrayList<Student>();
		s1.add(s);
		return s1;
		
	}

    // to display object details
    public void display( ArrayList<ArrayList<Student>> metaResult )
    {
        System.out.println("########    Student Details   ########");
        for(ArrayList<Student> record : metaResult)
        {
            for(Student s: record)
            {
                System.out.println(s.getName()+" "+s.getCollge()+" "+s.getAge());
            }
            System.out.println();
        }
		
    }
    
}
