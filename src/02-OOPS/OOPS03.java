/*
OOPS 03 — CONSTRUCTORS

- Constructor is a special method used to initialize an object.
- It runs automatically when an object is created using 'new'.

Example:
Student s1 = new Student("Aman", 19);

- Constructor name = class name.
- Constructor has NO return type (not even void).
- Used to give initial values to an object.

Example:
Student(String name, int age) {
    this.name = name;
    this.age = age;
}

Remember:
new → creates object → constructor runs → object gets initialized.
*/



class Student5 {
    String name;
    int age;

    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OOPS03  {
    public static void main(String[] args) {

        Student5 s1 = new Student5("Komal", 34);

        System.out.println(s1.name);
    }
}