// Question 13: Animal Sound Overriding
package question13;

class Animal {
    void makeSound() { System.out.println("Animal makes a sound."); }
}
class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Dog says: Woof! Woof!"); }
}
class Cat extends Animal {
    @Override
    void makeSound() { System.out.println("Cat says: Meow! Meow!"); }
}

public class Question13 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();   // runtime polymorphism
        Animal c = new Cat();
        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}
