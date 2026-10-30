/*
 STR08 — STRING METHODS

 1. toUpperCase()  → converts to uppercase.
 2. toLowerCase()  → converts to lowercase.
 3. trim()         → removes spaces from the beginning and end.
 4. contains()     → checks if text exists.
 5. startsWith()   → checks the starting text.
 6. endsWith()     → checks the ending text.
 7. replace()      → replaces characters or text.
*/


void main() {

    String word = " Java Programmnig";
    System.out.println(word.toUpperCase());
    System.out.println(word.toLowerCase());
    System.out.println(word.trim());

    System.out.println(word.contains("Java"));
    System.out.println(word.startsWith(" Java"));
    System.out.println(word.endsWith(" "));

    System.out.println(word.replace("Java", "Python"));

}