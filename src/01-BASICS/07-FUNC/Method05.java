/*
Method 05: Pass by Value

Java passes arguments by value.
For primitive data types, the method gets a copy.

Syntax:
methodName(variable);

Example:
void change(int x) {
    x = 100;
}
*/


void change(int x) {
    x = 100;
}

void main () {
    int num = 10;
    change(num);

    System.out.println(num);
}