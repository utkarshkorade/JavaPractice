public class Constructor {
    
    public int stuid;
    public String name;

        //this is non-parameter constructor;
        // Constructor(){
        //     System.out.println("The constructor is called ::");
        // }

       
        //this is a parameterrized constructor
            
       
        Constructor(int id,String Name){
            stuid=id;
            name=Name;
            System.out.println("CALLED");
        }
        Constructor(Constructor s){

            System.out.println("copy called::");
        }
         public static void main(String[] args) {

            Constructor obj1= new Constructor(1000,"aadeshhhhh");
            Constructor obj2= new Constructor(obj1);
            int a=10;
            int b=50;
            System.out.println(-(a-b)*1);
                
        }
}
