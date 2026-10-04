/*
ARRAY 03 — UPDATING ARRAY ELEMENTS

- We can change an existing array value using its index.

Syntax:
array[index] = newValue;

Example:
int[] numbers = {10, 20, 30, 40};

numbers[2] = 100;

Before:
10  20  30  40
        ↑
       [2]

After:
10  20  100  40

Remember:
array[index] = value;
→ replaces the old value at that index.
*/


void main() {
    int[] marks = {10,20,30,40,50};
    marks[2] = 33;
    marks[3] = 44;
    marks[4] = 55;
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);
}