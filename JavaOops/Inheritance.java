// Parent class
public class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class Dog inherits from Animal
public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

 class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Inherited method: Animal is eating
        dog.bark();  // Dog-specific method: Dog is barking
    }
}

