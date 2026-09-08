void main() {

    /*
Nested Loops

Syntax:

for(...){

    for(...){
        // Code
    }

}

Meaning:

Outer Loop
↓

Inner Loop completes all its iterations

↓

Outer Loop moves to next iteration

↓

Inner Loop starts again

Note:
- Loop inside another loop.
- Used for patterns, tables, matrices, and grids.
*/

    for (int i=1; i<=5; i++) {

        for (int j=1; j<=5; j++) {
            System.out.print(j + " ");
        }

        System.out.println();
    }


}