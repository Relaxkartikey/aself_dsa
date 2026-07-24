void main() {
    /*
Else-If Ladder

Syntax:

if(condition1){
    // Code
}
else if(condition2){
    // Code
}
else if(condition3){
    // Code
}
else{
    // Default Code
}

Note:
- Conditions are checked from top to bottom.
- As soon as one condition is true, its block executes.
- Remaining conditions are skipped.
- The else block runs only if no condition is true.


if --- else-if x100000..... --- else

*/
    Scanner sc = new Scanner(System.in);
    int Marks = sc.nextInt();

    if (Marks >= 80) {
        System.out.println("Grade is A+");
    }

    else if  (Marks<80 && Marks>60) {
        System.out.println("Grade is B+");
    }
    else if  (Marks<60 && Marks>400) {
        System.out.println("Grade is C+ (Just Pass)");
    }
    else {
        System.out.println("Fail");
    }


}