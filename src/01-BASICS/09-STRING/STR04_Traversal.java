/*
 STR04 — STRING TRAVERSAL

 1. Traversal means visiting each character one by one.
 2. Use a for loop to traverse a String.
 3. length() gives the total number of characters.
 4. charAt(i) gets the character at index i.
*/


void main() {

    String word = "JAVA";

    for (int i = 0; i < word.length(); i++) {
        System.out.println(word.charAt(i));
    }
}