/*
Method 03: Return Values

A return value is the result a method gives back.

returnType tells what type of value the method returns.

return sends the result back to the caller.
*/


int square(int n){
    return n*n;
}

void main () {

    int result = square(10);
    System.out.println(result);
}