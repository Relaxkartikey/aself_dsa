
/*
MATH03 — REVERSE A NUMBER

Example:
Original: 1234
Reversed: 4321

Logic:
1. Get last digit using n % 10.
2. Add it to reverse.
3. Remove last digit using n / 10.

Formula:
reverse = reverse * 10 + digit

Time: O(d)
Space: O(1)
d = number of digits.
*/

void main () {
    int n = 1234;
    int reversed = 0;
    while (n > 0) {

        int digit = n % 10;
        n = n / 10;
        reversed = reversed * 10 + digit;

    }
    System.out.println(reversed);
}