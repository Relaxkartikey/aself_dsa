/*
 STR01 — STRING BASICS

 1. String stores text (sequence of characters).
 2. Use double quotes (" ") for String.
 3. char stores a single character using single quotes (' ').
 4. + joins Strings; this is called concatenation.
 5. Strings are immutable: their contents cannot be changed
    after creation. Reassigning a variable is allowed.
*/

void main() {

    String name = "Kartikey";
    String language = "Java";
    String city = "Jaipur";

    System.out.println("My name is " + name);
    System.out.println("I am learning " + language);
    System.out.println("I live in " + city);
}