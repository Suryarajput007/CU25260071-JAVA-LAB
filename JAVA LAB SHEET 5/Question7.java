// Question 7: Animal → Dog → Puppy
package question7;

// Animal -> Dog -> Puppy   (multilevel inheritance)
class Animal { void eat()  { System.out.println("Animal eats."); } }
class Dog extends Animal { void bark() { System.out.println("Dog barks."); } }
class Puppy extends Dog  { void play() { System.out.println("Puppy plays."); } }

public class Question7 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.play();  // from Puppy
    }
}
