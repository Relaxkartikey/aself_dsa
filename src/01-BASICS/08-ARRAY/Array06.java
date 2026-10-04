void main () {

    int sum = 0;
    int[] nums = {10,20,30,40,50,60,70,80,90,100};

    for(int i = 0; i < nums.length; i++) {
        sum =  sum + nums[i];

        System.out.println("Sum"+ i + ":" + sum);
    }


}



/*
ARRAY 06 — SUM OF ARRAY

- To find the sum, create a variable:
  int sum = 0;

- Traverse the array and keep adding each element.

Example:

for (int i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}

- sum stores the running total.

Remember:

sum = sum + arr[i];

means:
old sum + current array element = new sum
*/