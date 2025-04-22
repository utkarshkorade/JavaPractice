// Base class
 class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

// Derived class Dog overriding the sound method
 class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat overriding the sound method
 class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

 class MethodOverriding {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.sound();  // Dog barks
        myCat.sound();  // Cat meows
    }
}
