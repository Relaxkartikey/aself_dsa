
/*
========================================
MATH02 — SUM OF DIGITS
========================================

IDEA:
Add all digits of a number.

EXAMPLE:
n = 5832

5832 % 10 = 2   -> sum = 2
5832 / 10 = 583

583 % 10 = 3    -> sum = 5
583 / 10 = 58

58 % 10 = 8     -> sum = 13
58 / 10 = 5

5 % 10 = 5      -> sum = 18
5 / 10 = 0

ANSWER: 18

IMPORTANT:
n % 10 -> gets the last digit.
n / 10 -> removes the last digit.
sum += digit -> adds digit to sum.

TIME: O(d)
SPACE: O(1)

d = number of digits.
========================================
*/

void main () {
    int n = 5832;
    int sum = 0;

    while (n > 0) {
        int lastDigit = n % 10;
        sum += lastDigit;
        n /= 10;

    }

    System.out.println(sum);
}
