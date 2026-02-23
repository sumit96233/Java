package Has_a;

public class Demo 
{
    public static void main(String[] args) 
    {
        Address ad = new Address();
        ad.setAreaName("Marathwada");
        ad.setCityName("Nanded");
        Student2 s1 = new Student2();
        s1.setName("Sumit");
        s1.setRlNum(64);
        s1.setAdr(ad);
        System.out.println(s1.getRlNum());
        System.out.println(s1.getName());
        System.out.println(s1.getAdr().getAreaName());
        System.out.println(s1.getAdr().getCityName());
       
    }
    
}
