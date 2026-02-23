package Has_a;

public class Test 

{
    public static void main(String[] args)
    
    {
        College ob1 = new College();
        ob1.setCid(1);
        ob1.setCname("VIIT");
        ob1.setCaddress("Vidya Nagari Baramati");
        ob1.setEmail("viitorg1122@gmail.com");
        ob1.setPinCode(431721);

        System.out.println(ob1.getCid());
        System.out.println(ob1.getCname());
        System.out.println(ob1.getEmail());
        System.out.println(ob1.getCaddress());
        System.out.println(ob1.getPinCode());
        
        
    }
    
}
