/*
 SRCH01 — LINEAR SEARCH

 Check each array element one by one.
 Stop when the target is found.
*/


void main() {

    int[] arr = {10, 20, 30, 40, 50};

    int target = 30;

    for (int i= 0; i<arr.length; i++) {

        if (arr[i] == target) {
            System.out.println("Founde at Index: " + i);
            break;
        }

    }
}