// Question 4: Animal → Dog
package question4;

// Animal
//   ↓
//  Dog
class Animal {
    void eat()   { System.out.println("Animal is eating."); }
    void sleep() { System.out.println("Animal is sleeping."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog is barking."); }
}

public class Question4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();    // inherited
        d.sleep();  // inherited
        d.bark();   // own
    }
}
