/*
OOPS 02 — THIS KEYWORD

- 'this' refers to the current object.

- It is mainly used when instance variables
  and method/constructor parameters have the same name.

Example:
this.name = name;

this.name → object's instance variable
name      → method/constructor parameter

Example:
s1.setInfo("Aman", 20);

Inside setInfo():
this → refers to s1.

Remember:
this = current object
*/


class Student2 {
    String name;
    int age;

    void setInfo(String name,int age){
        this.name=name;
        this.age=age;
    }

    void displayinfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}


class Student3 {
    String name;
    void displayinfo(){
        System.out.println("Name:"+name);
    }
    void showinfo(){
        this.displayinfo();
    }
}

public class OOPS02 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();

        s1.setInfo("aman",19);

        Student2 s2 = new Student2();

        s2.setInfo("Jat",8);

        s1.displayinfo();
        s2.displayinfo();

        Student3 s3 = new Student3();
        s3.name="ravan";
        s3.displayinfo();
        s3.showinfo();
    }
}


