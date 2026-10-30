/*
 STR06 — STRING COMPARISON

 1. Use equals() to compare String CONTENTS.
 2. Use equalsIgnoreCase() to ignore uppercase/lowercase.
 3. == compares object references, not String contents.
 4. compareTo() compares Strings lexicographically.
*/


import java.sql.SQLOutput;

void main () {

    String a = "Java";
    String b = "Java";
    String c = new String("Java");


    System.out.println(a.equals(b));
    System.out.println(a.equals(c));

    System.out.println(a.equalsIgnoreCase("JAVA"));

    System.out.println(a == c);
    System.out.println("Apple".compareTo("Banana"));
}