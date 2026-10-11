
package OOP.Inheritance;

// Parent class: Animal
// This class contains common methods that Dog and Cat can inherit.
class Animal {

    // Common method for eating
    public void eat() {
        System.out.println("Animals eat");
    }

    // Common method for sleeping
    public void sleep() {
        System.out.println("Animals sleep");
    }
}

// Child class: Dog
// Dog inherits the properties and methods of Animal using extends.
class Dog extends Animal {

    // Method overriding: Providing a specific implementation of eat()
    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }

    // Method overriding: Providing a specific implementation of sleep()
    @Override
    public void sleep() {
        System.out.println("Dog sleeps during the day");
    }

    // Dog's own method, which is not defined in the Animal class
    public void sound() {
        System.out.println("Dog barks!");
    }
}

// Child class: Cat
// Cat also inherits the methods of Animal.
class Cat extends Animal {

    // Method overriding: Providing a specific implementation of eat()
    @Override
    public void eat() {
        System.out.println("Cat drinks milk");
    }

    // Method overriding: Providing a specific implementation of sleep()
    @Override
    public void sleep() {
        System.out.println("Cat sleeps at midnight");
    }

    // Cat's own method
    public void sound() {
        System.out.println("Cat meows!");
    }
}

// Main class: Program execution starts from main()
public class AnimalHierarchy {

    public static void main(String[] args) {

        // Creating objects of the child classes
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        // Calling the overridden methods and Dog's own method
        System.out.println("--- Dog ---");
        d1.eat();
        d1.sleep();
        d1.sound();

        // Calling the overridden methods and Cat's own method
        System.out.println("\n--- Cat ---");
        c1.eat();
        c1.sleep();
        c1.sound();
    }
}
