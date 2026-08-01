void main() {
    /*
Break Statement

Syntax:

break;

Meaning:

Immediately exits the nearest loop or switch.

↓

Control moves to the first statement after the loop.

Note:
- Used to stop a loop early.
- Commonly used with if conditions.
*/
    Scanner sc = new Scanner(System.in);

    while(true) {


        System.out.print("Enter a Password: ");
        String password = sc.nextLine();

        if(password.equals("java1")){
            System.out.print("Success");
            break;
        }

        System.out.println("Wrong Pin");
    }


}