void main () {

    int[] arr = {10,20,30,40,50};

    int left = 0;
    int right = arr.length-1;

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");

    }
    System.out.println();

    while(left < right) {
        // swap

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;


    }

    // print rev array

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

}



/*
ARRAY 12 — REVERSE ARRAY

- Reverse means changing the order of elements.

Example:
10 20 30 40 50
↓
50 40 30 20 10

- Use two indexes:
  left  = 0
  right = arr.length - 1

- Swap left and right values.
- Move left forward and right backward.
- Stop when left >= right.

Swap:
int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;

Remember:
Two pointers → left + right
Swap → move both toward the middle.
*/