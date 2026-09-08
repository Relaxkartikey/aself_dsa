/*
Method 08: Practice

Methods can take parameters and return values.

Syntax:
returnType methodName(parameters) {
    return value;
}

Example:
int add(int a, int b) {
    return a + b;
}
*/

boolean isEven(int num) {
    return num % 2 == 0;
}

void main () {

    System.out.println(isEven(3));
    System.out.println(isEven(4));

}
