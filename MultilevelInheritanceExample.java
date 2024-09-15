package Oopsjava;
// Base class
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate class inheriting from Animal
class Mammal extends Animal {
    public void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

// Derived class inheriting from Mammal
class Dog extends Mammal {
       public void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog dog = new Dog();

        // Call methods from different levels of inheritance
        dog.eat();     // Method from Animal class
        //dog.breathe(); // Method from Mammal class
        //dog.bark();    // Method from Dog class
        dog.bark();
    }
}
