void main () {

    int[] nums = {10,10,10,40,40,50,50,50,30};
    int count = 0;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] == 10) {
            count++;
        }
    }
    System.out.println(count);
}



/*
ARRAY 10 — COUNT / FREQUENCY

- Count = how many times a particular value appears.

Steps:
1. Start count = 0.
2. Traverse the array.
3. Compare each element with the target.
4. If equal, increase count.

Example:

int count = 0;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        count++;
    }
}

Remember:
count++ → increase count by 1.
*/