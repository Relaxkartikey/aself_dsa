/*
 STR10 — REVERSE A STRING

 1. Start from the last character.
 2. Move backwards using i--.
 3. Add each character to a new String.
 4. The final String contains the reversed text.
*/



void main() {

    String word = "JAVA";
    String reversed = "";


    for (int i= word.length()-1; i>=0; i--) {

        reversed = reversed + word.charAt(i);
    }

    System.out.println("Original: " + word);
    System.out.println("Reversed: " + reversed);

}