void main() {

    /*
Type Casting
- Convert one data type to another.

Implicit (Automatic)
byte → short → int → long → float → double

Explicit (Manual)
double → float → long → int → short → byte

Notes:
- Bigger → Smaller = Casting required
- Smaller → Bigger = Automatic
- Explicit casting may lose data
- Integer division removes decimals
- char stores ASCII values
*/

    int age = 22;

    double ageDouble = age;

    System.out.println(age);
    System.out.println(ageDouble);

    // explicit (big to small)

    double CGPA = 88.88;
    int newCGPA = (int) CGPA;
    System.out.println(newCGPA);


    // int divisions

    System.out.println(5 / 2);
    System.out.println(5 / 2.0);


    // ASCI value of char

    char letter = 'F';
    int aValue = letter;

    System.out.println(aValue);

    // ASCI to char (explicit)

    int ASCI = 68;
    char aChar = (char) ASCI;
    System.out.println(aChar);


    // data loss

    long num = 10000000000L;

    int x = (int) num;

    System.out.println(x);

}