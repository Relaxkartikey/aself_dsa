/*
==========================================================
                    JAVA OOPS NOTES
==========================================================

OOPS = Object-Oriented Programming
-----------------------------------
Programming approach based on Classes and Objects.

Main OOPS Topics:
1. Class & Object
2. this Keyword
3. Constructors
4. Copy Constructor
5. Inheritance
6. Polymorphism
7. Encapsulation
8. Abstraction
9. Interfaces
10. Access Modifiers
11. Packages
12. static Keyword


==========================================================
1. CLASS & OBJECT
==========================================================

CLASS:
- Blueprint/template for creating objects.
- Contains properties (variables) and behaviours (methods).

OBJECT:
- Instance of a class.
- Created using 'new'.

Example:
Student s1 = new Student();

Class  = Blueprint
Object = Actual instance
new    = Creates object

A class can create multiple objects, and each object
can have its own values.


==========================================================
2. THIS KEYWORD
==========================================================

- 'this' refers to the current object.

Main use:
When instance variable and parameter have the same name.

Example:
this.name = name;

this.name → current object's variable
name      → parameter

Example:
s1.setInfo("Aman", 19);

Inside setInfo():
this → refers to s1.

Remember:
this = current object


==========================================================
3. CONSTRUCTORS
==========================================================

- Constructor is a special method used to initialize objects.
- Runs automatically when an object is created using 'new'.

Rules:
- Constructor name = class name.
- Has NO return type, not even void.
- Used to give initial values to an object.

Example:
Student(String name, int age) {
    this.name = name;
    this.age = age;
}

Flow:
new → constructor runs → object initialized


==========================================================
4. COPY CONSTRUCTOR
==========================================================

- Creates a new object by copying values from
  an existing object.

Example:

Student s2 = new Student(s1);

Copy constructor:

Student(Student s) {
    this.name = s.name;
    this.age = s.age;
}

this → new/current object
s    → existing object being copied

Normal Constructor → receives values directly.
Copy Constructor   → copies values from another object.


==========================================================
5. INHERITANCE
==========================================================

- Allows one class to use properties and methods
  of another class.

Parent Class
     ↓
Child Class

Keyword:
extends

Example:
class Dog extends Animal {
}

Dog gets accessible members of Animal.

Types:
- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance
- Hybrid Inheritance

Java does NOT support multiple inheritance
through classes.

Remember:
Inheritance = IS-A relationship

Dog IS-A Animal.


==========================================================
6. POLYMORPHISM
==========================================================

Polymorphism = "Many Forms"

Two types:

1. Compile-time Polymorphism
   → Method Overloading

2. Runtime Polymorphism
   → Method Overriding


METHOD OVERLOADING:
- Same method name.
- Different parameters.

Example:
add(int, int)
add(int, int, int)


METHOD OVERRIDING:
- Child class provides its own version
  of a parent class method.

Example:
Animal → sound()
Dog    → sound()

Remember:

Overloading → Same class + different parameters
Overriding  → Parent-child + same method


==========================================================
7. ENCAPSULATION
==========================================================

- Wrapping data and methods together inside a class.
- Provides controlled access to data.
- 'private' is commonly used for data hiding.

Example:

private int balance;

Access through:
getBalance()
setBalance()

Flow:

private data
     ↓
getter / setter
     ↓
outside world

Remember:
Encapsulation = Data hiding + controlled access


==========================================================
8. ABSTRACTION
==========================================================

- Shows WHAT is needed while hiding HOW it works.

Achieved using:
1. Abstract Class
2. Interface

ABSTRACT CLASS:
- Declared using 'abstract'.
- Can contain:
  → Abstract methods
  → Normal methods
- Abstract method has no body.
- Child class must implement abstract methods.
- Cannot create object directly from abstract class.

Example:

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

Parent → WHAT is required
Child  → HOW it works

Remember:
Abstraction = WHAT, not HOW


==========================================================
9. INTERFACES
==========================================================

- Interface acts as a contract/rulebook.
- A class uses 'implements' to follow an interface.

Example:

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

Interface → defines the required behaviour.
Class     → provides the implementation.

Keywords:
Class → extends
Interface → implements

A class can implement multiple interfaces.


==========================================================
ABSTRACT CLASS vs INTERFACE
==========================================================

Abstract Class:
- abstract class
- Uses 'extends'
- Can have abstract + normal methods
- Can have instance variables
- Can have constructor
- A class can extend only ONE class

Interface:
- interface
- Uses 'implements'
- Mainly defines a contract
- Variables are constants by default
- No constructor
- A class can implement MULTIPLE interfaces

Remember:

Abstract Class → Common code + rules
Interface     → Contract / rules


==========================================================
10. ACCESS MODIFIERS
==========================================================

Access modifiers control who can access
classes, variables and methods.

1. public
   → Accessible from anywhere.

2. private
   → Accessible only inside the same class.

3. protected
   → Same package + child class.

4. default
   → Same package only.
   → No keyword is written.

Remember:

public    → Everywhere
protected → Package + Child
default   → Same Package
private   → Same Class


==========================================================
11. PACKAGES
==========================================================

- Package is a group/namespace used to organize
  related Java classes.

Helps:
→ Organize code
→ Avoid naming conflicts
→ Control package-level access

Create package:

package mypackage;

Use another package:

import mypackage.Student;

Remember:

package → tells which package the class belongs to.
import  → allows us to use a class from another package.


==========================================================
12. STATIC KEYWORD
==========================================================

- 'static' means the member belongs to the CLASS,
  not separately to each object.


STATIC VARIABLE:
- Shared by all objects.

Example:
static String college = "PIET";


STATIC METHOD:
- Can be called using class name.
- Does not require an object.

Example:
Calculator.add(10, 20);


STATIC BLOCK:
- Used for static initialization.
- Runs when the class is loaded.


Remember:

Normal variable → Each object has its own copy.
Static variable → One shared copy for the class.

object.member → normal
Class.member  → static


==========================================================
                  QUICK REVISION
==========================================================

Class       → Blueprint
Object      → Instance
this        → Current object
Constructor → Initializes object
Copy Constructor → Copies another object's values
Inheritance → Reuse from parent class
Polymorphism → Many forms
Encapsulation → Data hiding + controlled access
Abstraction → WHAT, hide HOW
Interface   → Contract
Access Modifiers → Control access
Package     → Organize classes
static      → Belongs to class / shared


==========================================================
                    END OF OOPS
==========================================================
*/