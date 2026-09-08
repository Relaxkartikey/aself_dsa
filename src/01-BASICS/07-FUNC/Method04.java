/*
Method 04: Parameters + Return Values

A method can take input through parameters
and return a result.

Input → Method → Output
*/


int multiply(int a, int b){
    return a*b;
}

void main() {
    int result = multiply(10, 20);
    System.out.println(result);
    System.out.println(multiply(10, 30));
}