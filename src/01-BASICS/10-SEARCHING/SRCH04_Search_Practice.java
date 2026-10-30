/*
 SRCH04 — LINEAR SEARCH COMPLETE

 1. Visit each element using a loop.
 2. Compare it with the target.
 3. Store the index when found.
 4. Stop searching using break.
 5. If index remains -1, the target wasn't found.
*/


void main() {

    int[] arr = {15,8,25,42,10};
    int target = 41;
    int index = -1;


    for (int i = 0; i < arr.length; i++) {

        if (arr[i] == target) {
            index = i;
            break;
        }
    }

    if (index != -1) {
        System.out.println("Found: " + target);
        System.out.println("Index: " + index);
    } else {
        System.out.println("Element not found");
    }

}