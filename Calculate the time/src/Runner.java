import java.util.ArrayList;

// Superclass: Animal
class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

// Subclass: Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass: Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Runner class to test
public class Runner {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        // Create 2 objects: 1 Dog and 1 Cat
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        // Add them to the ArrayList
        animals.add(dog1);
        animals.add(cat1);

        // Check each object's type using instanceof
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("This is a Dog!");
                animal.makeSound(); // Calls Dog's makeSound()
            } else if (animal instanceof Cat) {
                System.out.println("This is a Cat!");
                animal.makeSound(); // Calls Cat's makeSound()
            }
        }
    }
}
