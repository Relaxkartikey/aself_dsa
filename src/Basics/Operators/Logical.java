void main() {

    /*
Logical Operators

&&  AND
||  OR
!   NOT

Rules:
&& -> True if BOTH conditions are true.
|| -> True if AT LEAST ONE condition is true.
!  -> Reverses the boolean value.

Returns: true / false
*/


    int age = 20;
    boolean hasLicense = true;

    System.out.println((age >= 18 && hasLicense));
    System.out.println((age < 18 || hasLicense));
    System.out.println(!(age >= 18));



}