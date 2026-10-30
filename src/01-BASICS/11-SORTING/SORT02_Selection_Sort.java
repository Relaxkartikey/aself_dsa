/*
 SORT02 — SELECTION SORT

 1. Find the smallest element.
 2. Remember its index.
 3. Swap it with the first unsorted element.
*/


void main () {

    int[] arr = {3,1,2};

    for (int i=0; i<arr.length-1; i++){

        int min = i;

        for (int j=i+1; j<arr.length; j++){
            if (arr[j] < arr[min]){
                min = j;
            }
        }

        int temp = arr[min];
        arr[min] = arr[arr.length-1];
        arr[arr.length-1] = temp;

    }

    for (int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}