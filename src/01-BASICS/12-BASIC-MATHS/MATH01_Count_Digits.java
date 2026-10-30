/*
MATH01 — COUNT DIGITS

Idea:
Count the number of digits in an integer.

Logic:
1. Initialize count = 0.
2. While n > 0:
   - Divide n by 10.
   - Increase count by 1.
3. Print count.

Example:
n = 5832

5832 -> 583 -> 58 -> 5 -> 0

Answer: 4 digits

Important:
n / 10 removes the last digit (integer division).
count++ increases the digit count by 1.

Time Complexity: O(d)
Space Complexity: O(1)

d = number of digits.
*/



void main() {
    int n = 5832;
    int count = 0;

    while (n > 0) {
        n = n / 10;
        count++;
    }

    System.out.println(count);
}
