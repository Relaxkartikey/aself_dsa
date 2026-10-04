interface Animal43 {
    void sound();
}

class Dog43 implements Animal43 {
    @Override
    public void sound() {
        System.out.println("Dog is Barking....");
    }
}

public class OOPS09
{
    public static void main(String[] args)
    {
        Dog43 d = new Dog43();
        d.sound();
    }
}



/*
OOPS 09 — INTERFACE

- Interface = a contract/rulebook for a class.

- A class uses 'implements' to follow an interface.

Example:

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

- Interface tells WHAT a class must do.
- Implementing class decides HOW to do it.

- Class → extends another class.
- Class → implements an interface.

Remember:
Interface = Contract
implements = follows the contract
*/


/*
ABSTRACT CLASS vs INTERFACE

Abstract Class:
- Declared using 'abstract class'.
- Class uses 'extends'.
- Can have abstract + normal methods.
- Can have instance variables.
- Can have a constructor.
- A class can extend only ONE class.

Interface:
- Declared using 'interface'.
- Class uses 'implements'.
- Mainly defines a contract/rules.
- Variables are constants by default.
- Cannot have a constructor.
- A class can implement MULTIPLE interfaces.

Remember:
Abstract Class → common code + rules
Interface     → mainly rules/contract

extends    → class → class
implements → class → interface
*/
