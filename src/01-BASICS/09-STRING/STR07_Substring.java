/*
 STR07 — SUBSTRING

 1. substring() extracts part of a String.
 2. substring(start) → start index to the end.
 3. substring(start, end) → start index to end - 1.
 4. The end index is EXCLUSIVE (not included).
*/


void main() {

    String word = "Programming";

    System.out.println(word.substring(2, 4));
    System.out.println(word.substring(0, 4));
    System.out.println(word.substring(3, 7));
    System.out.println(word.substring(3));

}
