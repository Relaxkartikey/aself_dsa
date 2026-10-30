/*
 STR09 — CHARACTER COUNT

 1. Use a loop to visit each character.
 2. charAt(i) gets the character at index i.
 3. Use if to check a character.
 4. Increase count whenever a match is found.
*/


void main() {

    String word = "programming";
    int count = 0;

    for (int i = 0; i < word.length(); i++) {

        if (word.charAt(i) == 'm') {
            count++;
        }
    }

    System.out.println("Count: " + count);
}
