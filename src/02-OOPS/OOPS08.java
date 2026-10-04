/*
OOPS 08 — ABSTRACTION

- Abstraction means hiding unnecessary implementation
  details and showing only important functionality.

- In Java, abstraction can be achieved using:
  1. Abstract class
  2. Interface

ABSTRACT CLASS:
- Declared using 'abstract'.
- Can contain abstract and normal methods.
- Abstract method has no body.
- Child class must implement the abstract method.
- We cannot create an object of an abstract class.

Example:

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

Remember:
Abstraction = What to do, while hiding how it is done.
*/



/*
OOPS 08 — ABSTRACTION doubt Solved

- Abstraction = showing WHAT is needed and hiding HOW it works.

- Abstract class is declared using 'abstract'.

- An abstract class can have:
  → Abstract methods (no body)
  → Normal methods (with body)

- Abstract method tells the child:
  "You MUST provide this method."

Example:
abstract void sound();

Dog decides HOW:
void sound() {
    System.out.println("Dog is Barking");
}

- Parent → defines WHAT is required.
- Child  → defines HOW it works.

- We cannot create an object of an abstract class.

Example:
Animal a = new Animal();  // ❌
Dog d = new Dog();        // ✅

Remember:
Abstraction = WHAT, not HOW.

Example:
Animal → "Every animal must have sound()"
Dog    → "My sound() = Bark"
Cat    → "My sound() = Meow"
*/



abstract class Animal23 {

    abstract void sound();


    void eat() {
        System.out.println("Animal is eating....");
    }
}



class Dog23 extends Animal23 {

    @Override
    void sound() {
        System.out.println("Dog is Barking....");
    }

}


public class OOPS08 {
    public static void main(String[] args) {
        Dog23 d = new Dog23();

        d.sound();
        d.eat();
    }
}