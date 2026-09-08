void main() {

/*
+----------+---------------+--------------+--------------------------+
| Type     | Size          | Example      | Use                      |
+----------+---------------+--------------+--------------------------+
| byte     | 1 byte        | 120          | Small integers           |
| short    | 2 bytes       | 20000        | Medium integers          |
| int      | 4 bytes       | 100000       | Most common integer      |
| long     | 8 bytes       | 9999999999L  | Very large integers      |
| float    | 4 bytes       | 12.5f        | Decimal (less precision) |
| double   | 8 bytes       | 12.5         | Decimal (default)        |
| char     | 2 bytes       | 'A'          | Single character         |
| boolean  | JVM-dependent | true         | True / False             |
+----------+---------------+--------------+--------------------------+
*/

    byte a = 120;
    short b = 1200;
    int c = 645433;
    long d = 120043244000000L;
    float e = 1200.0f;
    double g = 1200.0;
    char f = 'D';
    boolean h = true;



    System.out.println(a + " " +  b + " " + c + " " + d  + " " + e + " " + f + " " + g + " " + h);


}