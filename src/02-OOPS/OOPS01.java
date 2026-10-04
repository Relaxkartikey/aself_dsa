class Student {
    String name;
    int age;

    void displayinfo ()  {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class OOPS01 {
    public static void main(String[] args) {


        Student s1 = new Student();

        s1.name = "aman";
        s1.age = 20;
        s1.displayinfo();
        Student s2 = new Student();
        s2.name = "ram";
        s2.age = 30;
        s2.displayinfo();
    }
}


/*
OOPS 01 — CLASS & OBJECT

- OOP = Object-Oriented Programming.

- Class = Blueprint/template for creating objects.
- Object = Instance of a class.

- Class contains:
  → Properties (variables)
  → Behaviours (methods)

- Object is created using:
  ClassName obj = new ClassName();

- 'new' creates an object.

- Multiple objects can be created from one class.
- Each object can have its own values.

Example:
Student s1 = new Student();
Student s2 = new Student();

- public class OOPS01
  → OOPS01 is the class name.
  → Public class name should match the file name.

- main():
  public static void main(String[] args)
  → Starting point of the traditional Java program.
*/