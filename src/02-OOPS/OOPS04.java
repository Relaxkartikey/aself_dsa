class Student24 {
    String name;
    int age;


    // Normal Constructor
    Student24(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    Student24(Student24 s) {
        this.name = s.name;
        this.age = s.age;
    }
}


public class OOPS04  {
    public static void main(String[] args) {
        Student24 s1 = new Student24("Komal", 34);

        Student24 s2 = new Student24(s1);

        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}



/*
OOPS 04 — COPY CONSTRUCTOR

- Copy constructor creates a new object by copying
  values from an existing object.

Example:
Student4 s2 = new Student4(s1);

- The existing object is passed to the constructor.

Example:
Student4(Student4 s) {
    this.name = s.name;
    this.age = s.age;
}

this → new/current object
s    → existing object being copied

Remember:
Normal Constructor → gives values directly.
Copy Constructor   → copies values from another object.
*/