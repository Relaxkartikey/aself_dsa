void main() {

    /*
While Loop

Syntax:

while(condition){
    // Code
}

Note:
- Entry-controlled loop.
- Condition is checked before every iteration.
- Best when the number of iterations is unknown.
*/

    Scanner sc = new Scanner(System.in);

    int attempt = 0;
    int pin;

    while (attempt < 10) {
        System.out.print("Enter pin: ");
        pin = sc.nextInt();

        if (pin == 1234) {
            System.out.print("Access Granted");
            break;
        }

        attempt++;
        System.out.println("Wrong Pin");


    }
    if (attempt == 3) {
        System.out.println("Access Blocked");
    }


}