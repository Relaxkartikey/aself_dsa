/*
 STR03 — LENGTH AND CHARAT

 1. length() returns the number of characters in a String.
 2. charAt(index) returns the character at a given index.
 3. String indexing starts from 0.
 4. Last valid index = length() - 1.
*/

void main() {

    String name = "JAVA";

    System.out.println(name.length());
    System.out.println(name.charAt(0));
    System.out.println(name.charAt(2));

}