void main () {

    int[] arr = {10,20,30,50,70,05,06};
    int min = arr[0];

    for(int i = 0; i < arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println(min);

}



/*
ARRAY 08 — MINIMUM ELEMENT

- To find the smallest element:
  1. Assume the first element is minimum.
  2. Compare remaining elements with min.
  3. If current element is smaller, update min.

Example:

int min = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
}

Remember:
min = smallest value found so far.
*/