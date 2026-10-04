void main () {

    int[] arr = {10,20,30,50,70,05,06};
    int max = arr[0];

    for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    System.out.println(max);

}



/*
ARRAY 07 — MAXIMUM ELEMENT

- To find the largest element:
  1. Assume the first element is maximum.
  2. Compare every remaining element with max.
  3. If current element is greater, update max.

Example:
int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}

Remember:
max stores the largest value found so far.
*/