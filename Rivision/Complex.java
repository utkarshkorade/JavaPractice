import java.util.Scanner;
public class Complex {

    public static int sum(int a ,int b){
        int sum=a+b;
        return sum;
    }

    public static int Difference(int a,int b){

        int difference=a-b;

        return difference;
    }

    public static int multiplication(int a,int b){
        
        int multiplication=a*b;

        return multiplication;
    }
    public static void main(String[]arg){

        Scanner reader=new Scanner(System.in);

        System.out.println("Enter two number::");

        int number1=reader.nextInt(); //20

        int number2=reader.nextInt(); //10

        System.out.println("the sum of the number = "+" "+sum(number1,number2));

        System.out.println("the difference of the number = "+" "+Difference(number1,number2));

        System.out.println("the multiplication of the number = "+" "+multiplication(number1,number2));
    }

}
