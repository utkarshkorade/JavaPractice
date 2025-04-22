import java .util.*;
public class HashSet2 {
    public static void main(String []args){

        HashSet<Integer> hs= new HashSet<>();

        hs.add(100);
        hs.add(200);
        hs.add(10);
        hs.add(20);
        hs.clear();
        hs.add(1000);
        hs.add(20000);
        hs.add(100000);
        hs.add(201);
        hs.remove(200);
        hs.remove(1000);
        
        System.out.println(hs);
        
        for (Integer count : hs) {

            System.out.println(count);
            
        }
    }
}
