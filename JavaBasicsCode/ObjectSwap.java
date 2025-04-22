
class Number{
    int value;
    Number(int value){
        this.value= value;
    }
}
class ObjectSwap{
    public static void Swap(Number a,Number b){
        int temp;
        temp=a.value;
        a.value=b.value;
        b.value=temp;
    }
    public static void main(String []args){
        Number Number1=new Number(10);
        Number Number2=new Number(20);

        System.out.println("Before Swap");
        System.out.println(Number1.value+"     "+ Number2.value);

        Swap(Number1,Number2);
        System.out.println("After Swap");
    System.out.println(Number1.value+"     "+ Number2.value);
    }
}
/* 
 class ObjectSwap{

    public static void main(String [] args){
        int number1=10;
        int number2=20;
        System.out.println("Before swap");
        System.out.println(number1 + "  " + number2);
       /*  //this is using 3rd veriable 
        int temp;
        temp=number1;
        number1=number2;
        number2=temp;*/

        /*by using addition  
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2; */

        /* this is using multilication and division 
        number1=number1*number2;
        number2=number1/number2;
        number1=number1/number2; */

        /*using &&-OR gate */ 

       /*  number1=number1

        System.out.println("After swap");
        System.out.println(number1 + "  " + number2);
    }
 } */
 