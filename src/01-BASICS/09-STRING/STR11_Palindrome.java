/*
 STR11 — PALINDROME

 1. A palindrome reads the same forwards and backwards.
 2. Examples: "madam", "level", "121".
 3. Reverse the String.
 4. Compare the original and reversed Strings using equals().
*/



void main() {

    String word = "yes";
    String reveresed = "";
    for (int i= word.length()-1; i>=0; i--) {

        reveresed += word.charAt(i);

    }

    if (word.equals(reveresed)) {
        System.out.println("Palindrome");
    } else  {
        System.out.println("Not Palindrome");
    }

}