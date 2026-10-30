
/*
MATH04 — PALINDROME NUMBER

IDEA:
A number is a palindrome if it stays
the same when reversed.

EXAMPLES:
121  -> 121 -> Palindrome
123  -> 321 -> Not a palindrome

LOGIC:
1. Store the original number.
2. Reverse the number.
3. Compare original and reversed.

TIME: O(d)
SPACE: O(1)
d = number of digits.
*/

void main() {
    int n = 121;
    int original = n;
    int reverse = 0;

    while (n > 0) {
        int digit = n % 10;
        reverse = reverse * 10 + digit;
        n = n / 10;
    }

    if (original == reverse) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not a palindrome");
    }
}
