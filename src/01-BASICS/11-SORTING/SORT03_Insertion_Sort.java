/*
========================================
        SORT03 — INSERTION SORT
========================================

WHAT IS INSERTION SORT?
- Takes one element at a time.
- Inserts it into its correct position.
- Like arranging playing cards in your hand.

EXAMPLE:
  Start:  {3, 1, 2}

  Pass 1: Take 1, move 3 right.
          {1, 3, 2}

  Pass 2: Take 2, move 3 right.
          {1, 2, 3}

IMPORTANT VARIABLES:
- i   = selects the current element.
- key = element we want to insert.
- j   = checks elements on the left.

IMPORTANT LOGIC:
- while (j >= 0 && arr[j] > key)
  Moves bigger elements one position right.

- arr[j + 1] = key
  Inserts the key into its correct position.

TIME COMPLEXITY:
- Best Case:    O(n)
- Average Case: O(n²)
- Worst Case:   O(n²)

SPACE COMPLEXITY:
- O(1) — uses constant extra space.

REMEMBER:
- Bubble Sort   → swaps neighboring elements.
- Selection Sort → finds the smallest element.
- Insertion Sort → inserts elements in the correct position.

========================================
*/

void main() {

    int[] arr = {3,1,2};

    for (int i=1; i<arr.length; i++){

        int key = arr[i];
        int j = i-1;

        while (j >= 0 && arr[j] > key){
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = key;

    }

    for (int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }


}