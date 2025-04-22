import java.util.Scanner;
import java.util.*;

public class ScannerClassforinput {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of two Number::");

        int a=sc.nextInt();
        int b=sc.nextInt();

        char ch=sc.nextLine().charAt(0);

        String name=sc.nextLine();

        float mark=sc.nextFloat();

        System.out.println("The value are::"+a+" "+b);

        
    }
}
