void main() {
    /*
Basics.Operators.Assignment Operators

=   Assign
+=  Add & Assign
-=  Subtract & Assign
*=  Multiply & Assign
/=  Divide & Assign
%=  Modulus & Assign

Shortcut:
a += b  →  a = a + b
a -= b  →  a = a - b
*/


    int a = 10;

    System.out.println("Initial Value : " + a);

    a += 5;
    System.out.println(a);

    a -= 3;
    System.out.println(a);

    a *= 2;
    System.out.println(a);

    a /= 4;
    System.out.println(a);

    a %= 3;
    System.out.println(a);

    // they are same as
    a = a + 5;
    System.out.println(a);
}