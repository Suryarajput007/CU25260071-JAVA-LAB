// Question 10: Animal → Dog and Cat
package question10;

//        Animal
//        /    \
//      Dog    Cat      (hierarchical inheritance)
class Animal { void eat()  { System.out.println("Animal eats."); } }
class Dog extends Animal { void bark() { System.out.println("Dog barks."); } }
class Cat extends Animal { void meow() { System.out.println("Cat meows."); } }

public class Question10 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat(); d.bark();
        c.eat(); c.meow();
    }
}
