
/*
========================================
       SORT04 — SORTING REVISION
========================================

1. BUBBLE SORT
   - Compares neighboring elements.
   - Swaps them if they are in the wrong order.

2. SELECTION SORT
   - Finds the smallest element.
   - Swaps it into the correct position.

3. INSERTION SORT
   - Takes one element at a time.
   - Inserts it into the correct position.

TIME COMPLEXITY:
   Bubble Sort    -> O(n²) average/worst
   Selection Sort -> O(n²) average/worst
   Insertion Sort -> O(n²) average/worst

========================================
*/

void main() {

    int[] arr = {5, 2, 4, 1, 3};

    // Choose one sorting algorithm to practice here.

    // Print the array
    for (int n : arr) {
        System.out.print(n + " ");
    }
}
