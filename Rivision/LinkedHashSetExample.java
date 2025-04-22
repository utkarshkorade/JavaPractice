import java.util.*;
public class LinkedHashSetExample {
    public static void main(String []args){

        LinkedHashSet<Integer> lh=new LinkedHashSet<>();

        lh.add(100);
        lh.add(500);
        lh.add(7000);
        lh.remove(100);
        
        for(Integer number:lh){

            System.out.println(number);
        }
    }

}
