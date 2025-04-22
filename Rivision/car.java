public class car {

    public
    String comname;
    String Model;
    int number;
    int capacity;

   //1 //non parameterized constructor
    // car(){

    //     System.out.println(" Welcome ");
    // }
    
    //2 //parameterized constructor----

    car(String carname,String Modelname,int carnumber,int carcapacity){

        comname=carname;
        Model=Modelname;
        number=carnumber;
        capacity=carcapacity;

        System.out.println("Car name is"+" "+comname);
        System.out.println("Car Model is"+" "+Model);
        System.out.println("Car number is"+" "+number);
        System.out.println("Car seating capacity is is"+" "+capacity);

    }

    //3 //copy constructor
    car(car s){
      this.comname=s.comname;
      this.Model=s.Model;
      this.number=s.number;
      this.capacity=s.capacity;
        System.out.println("Car name is"+" "+comname);
        System.out.println("Car Model is"+" "+Model);
        System.out.println("Car number is"+" "+number);
        System.out.println("Car seating capacity is is"+" "+capacity);
    }
    //  void printcarinformation(){

    //     System.out.println("Car name is"+" "+comname);
    //     System.out.println("Car Model is"+" "+Model);
    //     System.out.println("Car number is"+" "+number);
    //     System.out.println("Car seating capacity is is"+" "+capacity);


    // }

    public static void main(String[] args) {
        car car1=new car("Mercedes","GLE 220d",3108,4);
        // car1.printcarinformation();
        car car2=new car(car1);
    }
}
