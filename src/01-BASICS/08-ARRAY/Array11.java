void main () {

    int[] arr = {10,20,30,40,50,60,70,80,90,100};
    int target = 10;
    int index = -1;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            index = i;
            break;
        }


        }

    if (index == -1) {
        System.out.println("Array does not exist");
    }
    else {
        System.out.println(index);
    }

}




/*
ARRAY 11 — BASIC SEARCHING

- Searching means checking whether a particular
  element exists in an array.

Steps:
1. Choose a target value.
2. Traverse the array.
3. Compare each element with target.
4. If equal → element found.
5. 'break' can stop the loop after finding it.

Example:

if (arr[i] == target) {
    found = true;
    break;
}

Remember:
target → value we are searching for.
found  → tells whether it was found.
*/