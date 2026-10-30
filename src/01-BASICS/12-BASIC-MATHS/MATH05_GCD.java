/*
MATH05 — GCD / HCF

IDEA:
Find the largest number that divides
both numbers exactly.

EXAMPLE:
a = 12, b = 18
GCD = 6

EUCLIDEAN ALGORITHM:
1. Find remainder: a % b
2. Move b into a.
3. Move remainder into b.
4. Repeat until b becomes 0.
5. The answer is a.

TIME: O(log(min(a, b)))
SPACE: O(1)
*/

void main () {

    int a = 12;
    int b = 18;

    while (b != 0) {

        int remainder = a % b;
        a = b;
        b = remainder;

    }
    System.out.println(a);
}