
/*
 SRCH02 — SEARCH INDEX

 1. Start index at -1 (not found yet).
 2. Search each element.
 3. If the target matches, store its index.
 4. Print the index after the loop.
*/

void main() {


    int[] arr = {10, 20, 30, 40, 50};
    int target = 40;
    int index = -1;

    for (int i = 0; i < arr.length; i++) {

        if (arr[i] == target) {
            index = i;
            break;
        }

    }

    System.out.println("Index: " + index);


}


/* Why start with index = -1?

Because valid array indexes start at 0.
So -1 means we haven't found the element yet.

If the element isn't found, index stays -1.

 */