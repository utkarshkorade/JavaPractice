class Commercial{
    private String name;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void calculateBill(int unit){
        System.out.println("name of the customer " + getName());
        System.out.println("Total Bill of the Commercial Customer " + unit*5);

    }

}
class Domestic extends Commercial{


    void calculateBill(int unit){

        System.out.println("name of the customer " + getName());
        System.out.println("Total Bill of the Domestic Customer " + unit*10);

    }
}

public class BillExample {
     public static void main(String[]args){
        Commercial cus1=new Commercial();

        cus1.setName("aadesh");
        cus1.calculateBill(10);

      Commercial dcus1=new Domestic();

        dcus1.setName("AAdeshInfoTech");
        dcus1.calculateBill(1000);
     }
}
