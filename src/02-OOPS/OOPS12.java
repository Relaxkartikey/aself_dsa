class Student433 {

    String name;
    static String college = "PIET";

    Student433(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class OOPS12 {

    public static void main(String[] args) {

        Student433 s1 = new Student433("Aman");
        Student433 s2 = new Student433("Rahul");

        s1.display();
        s2.display();

        Student433.college = "Poornima";
        // s1.college = "Poornima"; (same result)

        s1.display();
        s2.display();
    }
}



/*
OOPS 12 — STATIC KEYWORD

- static means the member belongs to the CLASS,
  not separately to each object.

1. STATIC VARIABLE
- Shared by all objects of the class.

Example:
static String college = "PIET";

2. STATIC METHOD
- Can be called using the class name.
- Does not require an object.

Example:
Calculator.add(10, 20);

3. STATIC BLOCK
- Runs when the class is loaded.
- Used for static initialization.

Remember:

Normal variable → Each object has its own copy.
Static variable → One shared copy for the class.

object.member  → normal
Class.member   → static
*/