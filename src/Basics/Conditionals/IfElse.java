void main() {

    /*
If-Else Statement

Syntax:
if(condition){
    // True Block
}else{
    // False Block
}

Note:
- Executes only one block.
- Used for two-way decision making.
*/
    System.out.println("Enter a Number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if(num >= 0){
        System.out.println("Positive number");
    }
    else {
        System.out.println("Negative number");
    }


}