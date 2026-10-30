/*
 SRCH03 — ELEMENT NOT FOUND

 1. Start index at -1.
 2. Search each array element.
 3. If found, store its index.
 4. After searching, check the index.
 5. If index is -1, the element was not found.
*/


void main() {

    int[] arr = {10, 20, 30, 40, 50};
    int target = 99;
    int index = -1;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            index = i;
            break;
        }
    }

    if (index == -1) {
        System.out.println("Element not found");
    } else  {
        System.out.println("Index: " + index);
    }

}