/*
MATH06 — LCM

IDEA:
Find the smallest positive number divisible
by both numbers.

EXAMPLE:
a = 4, b = 6
LCM = 12

FORMULA:
LCM(a, b) = (a / GCD(a, b)) * b

STEPS:
1. Find GCD using the Euclidean algorithm.
2. Calculate LCM using the formula.

TIME: O(log(min(a, b)))
SPACE: O(1)
*/


void main  () {
    int a = 4;
    int b = 6;

    int x = a;
    int y = b;

    while (b != 0) {
        int rem = a%b;
        a = b;
        b = rem;
    }

    int hcf = a;
    int lcm = (x/hcf)*y;
    System.out.println("LCM = "+lcm);

}