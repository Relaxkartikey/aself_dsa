/*
Method 07: Method Overloading

Same method name + different parameters.

The parameters can differ by:
- Number
- Type
- Order

Syntax:
int add(int a, int b) { ... }
int add(int a, int b, int c) { ... }

Example:
add(10, 20);
add(10, 20, 30);
*/


// Important ⚠️
//You cannot overload methods by changing only the return type.


int add(int a, int b){
    return a + b;
}

int add(int a, int b, int c){
    return a + b + c;
}



// another example

void print(int x) {
    System.out.println("Interger: " + x);
}

void print(String x) {
    System.out.println("String: " + x);
}



void main(){
    System.out.println(add(1,2));
    System.out.println(add(4,5, 6));

    print(10);
    print("Hello World");
}






