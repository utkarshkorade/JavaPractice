//  class ThreadExample extends Thread {
//     public void run(){
//         System.out.println("thread is start running");

//     }
// }
// public class Test{
//     public static void main(String[]args){
//         ThreadExample thread=new ThreadExample();
//         thread.start();
    
        
//     }
// }
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class HelloWorld {
    int number;
    String name;
    void info(){
        System.out.println(number);
        System.out.println(name);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        HelloWorld e1=new HelloWorld();
        System.out.println("Enter a number::");
        e1.number=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a name ::");
        e1.name=sc.nextLine();
        e1.info();
    }
}
class Dog extends HelloWorld{
    
    public static void main(String []args){
        Dog d1=new Dog();
        d1.number=100;
        d1.name="happy";
        d1.info();
    }
}