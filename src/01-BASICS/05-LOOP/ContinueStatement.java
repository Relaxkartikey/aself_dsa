void main() {

    /*
Continue Statement (skip statement)

Syntax:

continue;

Meaning:

Skip the current iteration.

↓

Go to the next iteration.

Note:
- Does NOT stop the loop.
- Only skips the current iteration.
*/

    for(int i = 1; i<=5; i++) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if(marks < 0 || marks >100) {
            System.out.println("Marks Invalid");
            continue;
        }

        System.out.println("Marks is " + marks);

    }


}