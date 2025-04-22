
class Animal{  //parent class
    String name;
    
    void Animal(String animalname){
      animalname=name;  
    }
    void run(){

    System.out.println(name+" is running");
    }
    void jump(){
        System.out.println(name+" is jumping");
    }
}
//child claSS
class Dog extends Animal{
    // 
    void Byting(){
        System.out.println("dog is byting::");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog mydog=new Dog();
        mydog.name="tommy";
        mydog.run();
        mydog.jump();
    }
    
}
