import java.sql.SQLOutput;

void main() {



    /*
Nested If Statement

Syntax:

if(condition1){
    if(condition2){
        // Code
    }else{
        // Code
    }
}else{
    // Code
}

Note:
- An if statement inside another if statement.
- The inner if executes only if the outer if is true.
- Used when one decision depends on another.
*/

    Scanner sc = new Scanner(System.in);

    System.out.print("Did you reach on time? ");
    boolean isReached = sc.nextBoolean();

    System.out.print("Do you have an Admit Card? ");
    boolean isAdmit = sc.nextBoolean();

    System.out.print("Do you have an ID Card? ");
    boolean isID = sc.nextBoolean();

    if (isReached) {

        if (isAdmit) {
            System.out.println("Admit Card Verified.");

            if (isID) {
                System.out.println("ID Card Verified.");
                System.out.println("Allowed");
            } else {
                System.out.println("ID Card Missing.");
                System.out.println("Not Allowed");
            }

        } else {
            System.out.println("Admit Card Missing.");
            System.out.println("Not Allowed");
        }

    } else {
        System.out.println("You did not reach on time.");
        System.out.println("Not Allowed");
    }


}