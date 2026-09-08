/*
Method 09: Method Revision

Methods can:
- Take parameters
- Process data
- Return a value

Syntax:
returnType methodName(parameters) {
    return value;
}

Example:
int square(int n) {
    return n * n;
}
*/

// Practice examples go below.


boolean isPositive(int n) {
    return n >= 0;
}

int findMax(int a, int b) {
    return Math.max(a, b);
}

int findMaximun(int a, int b) {
    int max = a;

    if (max > b) {
        max = a;
    } else {
        max = b;
    }

    return max;
}

void main() {
    System.out.println(isPositive(10));
    System.out.println(isPositive(-11));
    System.out.println(isPositive(-12));
    System.out.println(findMax(3,5));
    System.out.println(findMaximun(3,5));
}


/*

Method
 │
 ├── Parameters → input
 │
 ├── Processing → work
 │
 └── Return → output


void       → gives nothing back
int        → gives an int back
boolean    → gives true/false back


Primitive → value is copied
Array/Object → reference value is copied
Same name + different parameters → overloading
 */