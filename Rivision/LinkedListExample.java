import java.util.*;
public class LinkedListExample {
    
    public static void main(String []args)throws Exception{

       LinkedList<Integer> ll=new LinkedList<>();
       
       ll.add(100);
       ll.add(200);
       ll.add(300);
       ll.add(300);
       ll.add(400);
       ll.add(500);
       ll.add(600);
       ll.add(700);
       ll.add(800);
       ll.add(900);
       ll.add(1000);
    //    ll.add(200);

        ll.removeLast(); //this is used for remove last........

        ll.addLast(100000); //this is used for add last.....
       ll.set(1,900);

    for (Integer num : ll) {
        
        System.out.println(num);

    }

    }
}
