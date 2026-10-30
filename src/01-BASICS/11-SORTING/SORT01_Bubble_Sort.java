/*
 SORT01 — BUBBLE SORT

 1. Compare neighboring elements.
 2. If left > right, swap them.
 3. Repeat passes until sorted.
*/


void main() {

    int[] arr = {5,3,8,1};

    for (int i = 0; i < arr.length-1; i++) {

        for (int j = 0; j < arr.length -1 -i; j++) {

            if (arr[j] > arr[j+1]) {

                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }


            }



        }

    for (int n : arr) {

        System.out.print(n + " ");

    }

}