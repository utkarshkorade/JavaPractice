import java.util.Scanner;
public class StringInput {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line for print");
        String wholeLine=sc.nextLine();
        System.out.println(wholeLine);
        System.out.println("Enter a word for print");
        String OnlyWord=sc.next();
        System.out.println(OnlyWord);
        System.out.println("Enter a char for print");
        String forchar=sc.next();
        char ch=forchar.charAt(0);
        System.out.println(ch);
       
    }
}
