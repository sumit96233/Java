package Map.Problem01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Test {
    public static void main(String[] args) {
        Set01 ob1 = new Set01();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.forEach(x->System.out.println(x));
        Set<Integer> new_set = new HashSet<>(nums);
        System.out.println(new_set);
    }
    
}
