void main() {



    /*
Overflow & Underflow

Overflow  : Value exceeds maximum limit.
Underflow : Value goes below minimum limit.

Result:
- Values wrap around instead of giving an error.

Useful Constants:
Integer.MAX_VALUE
Integer.MIN_VALUE
*/

/*
+---------+--------+---------------------------+----------------------------+
| Type    | Size   | Minimum Value             | Maximum Value              |
+---------+--------+---------------------------+----------------------------+
| byte    | 1 Byte | -128                      | 127                        |
| short   | 2 Byte | -32,768                  | 32,767                     |
| int     | 4 Byte | -2,147,483,648           | 2,147,483,647              |
| long    | 8 Byte | -9,223,372,036,854,775,808L | 9,223,372,036,854,775,807L |
| float   | 4 Byte | ~1.4E-45                | ~3.4028235E38              |
| double  | 8 Byte | ~4.9E-324               | ~1.7976931348623157E308    |
| char    | 2 Byte | 0 ('\u0000')            | 65,535 ('\uffff')          |
| boolean | JVM    | false                   | true                       |
+---------+--------+---------------------------+----------------------------+
*/

    System.out.println("Byte Max    : " + Byte.MAX_VALUE);
    System.out.println("Byte Min    : " + Byte.MIN_VALUE);

    System.out.println("Short Max   : " + Short.MAX_VALUE);
    System.out.println("Short Min   : " + Short.MIN_VALUE);

    System.out.println("Int Max     : " + Integer.MAX_VALUE);
    System.out.println("Int Min     : " + Integer.MIN_VALUE);

    System.out.println("Long Max    : " + Long.MAX_VALUE);
    System.out.println("Long Min    : " + Long.MIN_VALUE);

    System.out.println("Float Max   : " + Float.MAX_VALUE);
    System.out.println("Float Min   : " + Float.MIN_VALUE);

    System.out.println("Double Max  : " + Double.MAX_VALUE);
    System.out.println("Double Min  : " + Double.MIN_VALUE);

    System.out.println("Char Max    : " + (int) Character.MAX_VALUE);
    System.out.println("Char Min    : " + (int) Character.MIN_VALUE);

    System.out.println("Boolean     : " + Boolean.TRUE + " / " + Boolean.FALSE);


    byte a = 120;
    a += 9;
    System.out.println(a);


}