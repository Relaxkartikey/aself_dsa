void main() {

    /*
Do-While Loop

Syntax:

do{
    // Code
}while(condition);

Meaning:

Execute first.

↓

Check the condition.

↓

If it's true → repeat.

↓

If it's false → stop.

Note:
- Executes at least once.
- Condition is checked after the loop body.
- Best when the code must run at least one time (e.g., ATM menu, game menu, calculator menu).

FOR
"I know how many times."

WHILE
"Check first, then execute."

DO-WHILE
"Execute first, then check."

*/


    Scanner sc = new Scanner(System.in);
    int choice;

    do {
        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        System.out.println("Choice: ");
        choice = sc.nextInt();

    } while (choice != 3);

    System.out.println("Thank you");

}