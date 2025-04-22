import java.util.*;
public class StackList {
    public static void main(String []args)throws Exception{

        Stack<Integer> num=new Stack<>();

        num.push(10);
        num.push(20);
        num.push(30);
        num.push(40);
        num.push(50);
        num.push(60);
        num.push(70);
        num.push(80);
        num.push(90);
        num.push(100);

        num.pop();
        int peekelement=num.peek();
        System.out.println(peekelement);

        int position=num.search(20);
        System.out.println(position);
        
        for(Integer number:num){
            System.out.println(number);
        }
    }
}
