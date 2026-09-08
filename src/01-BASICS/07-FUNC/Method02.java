/*
Method 02: Parameters

Parameters are inputs given to a method.

They allow the same method to work with
different values.
*/


void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

void main () {
    greet("John");
    greet("Jane");
    greet("Julie");
}