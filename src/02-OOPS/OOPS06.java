/*
OOPS 06 — POLYMORPHISM

Polymorphism = "many forms".

Two types:

1. Compile-time Polymorphism
   → Method Overloading

   Same method name + different parameters.

   Example:
   add(int, int)
   add(int, int, int)


2. Runtime Polymorphism
   → Method Overriding

   Child class provides its own version
   of a parent class method.

   Example:
   Animal → sound()
   Dog    → sound()  (overrides it)

Remember:

Overloading  → same class, different parameters.
Overriding   → parent-child classes, same method.
*/



class Calculator{   // Method Overloading


    int add (int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}

class Animal1 {
    void sound(){
        System.out.println("Roar....");
    }
}

class Dog1 extends Animal1 {

    @Override
    void sound() {
        System.out.println("Barking...");
    }
}


public class OOPS06
{
    public static void main(String[] args)
    {
        Calculator c = new Calculator();

        System.out.println(c.add(1,2,3));
        System.out.println(c.add(3,4));

        Dog1 d = new Dog1();
        d.sound();
        Animal1 a = new Animal1();
        a.sound();

    }
}