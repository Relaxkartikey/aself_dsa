/*
 STR05 — STRING CONCATENATION

 1. Concatenation means joining Strings together.
 2. The + operator joins Strings and other values.
 3. Java converts numbers to text when concatenating with a String.
*/



void main() {

    String firstName = "Kartikey";
    String lastName = "Sharma";

    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    int age = 22;
    System.out.println("Age: " + age);

    System.out.println("Value: " + 10 + 20);
    System.out.println(10 + 20 + " Value");
}