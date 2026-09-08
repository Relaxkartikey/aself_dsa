/*
Method 06: Java References

For objects/arrays, the value passed to a method is
a copy of the reference.

Syntax:
methodName(array);

Example:
void change(int[] arr) {
    arr[0] = 100;
}
*/


void change(int[] arr) {
    arr[0] = 101;
}

void main() {
    int[] numbers = {1,2,3};

    change(numbers);

    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
}