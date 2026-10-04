class Animal {
    String name;

    void eat() {
        System.out.println("Animal eating....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barking....");
    }
}

public class OOPS05 {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.name = "Tommy";
        d1.eat();
        d1.bark();
    }
}



/*
OOPS 05 — INHERITANCE

- Inheritance allows one class to use the
  properties and methods of another class.

- Parent class → class being inherited from.
- Child class  → class that inherits.

Syntax:
class Child extends Parent {
}

Example:
class Dog extends Animal {
}

- 'extends' is used for inheritance.

Child gets accessible properties and methods
from the parent class.

Remember:

Parent
  ↓
Child

Inheritance = "IS-A" relationship

Example:
Dog IS-A Animal.
*/