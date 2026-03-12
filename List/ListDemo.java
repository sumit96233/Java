package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo 
{
    
    public static void main(String[] args) 
    {
       ArrayList< ArrayList<String>> india = new ArrayList<>();
        ArrayList<String> mahashtra = new ArrayList<>();
        ArrayList<String> uttarPradesh = new ArrayList<>();
        uttarPradesh.add("City1");
        uttarPradesh.add("City2");
        uttarPradesh.add("City3");
        mahashtra.add("Baramati");
        mahashtra.add("Nanded");
        india.add(mahashtra);
        india.add(uttarPradesh);
        for(ArrayList<String> s : india)
        {
            System.out.println(s.getClass().getName());
            for (String c1 : s) {
                System.out.println(c1); 
            }
        }
        
        
        
    }
}
