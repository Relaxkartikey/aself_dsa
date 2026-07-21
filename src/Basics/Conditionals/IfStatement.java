void main() {


    /*
If Statement

Syntax:
if(condition){
    // code
}

Note:
- Executes only if condition is true.
- Condition must return boolean.
- No else block.
*/

int age = 20;
if (age >= 18) {
    System.out.println("You are a teenager");
}

int num = 19;
if (num % 2 == 0) {
    System.out.println("Number is even.");

}
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number ");
int B = sc.nextInt();
if (B % 2 == 0) {
System.out.println("Number is even.");

}

}