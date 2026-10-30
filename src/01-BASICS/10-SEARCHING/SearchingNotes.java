
/*
========================================
        BASIC SEARCHING — NOTES
========================================

1. WHAT IS SEARCHING?
   Searching means finding a target element
   inside an array.

2. LINEAR SEARCH
   - Checks elements one by one.
   - Starts from index 0.
   - Works on sorted and unsorted arrays.
   - Stops when the target is found.

3. BASIC SYNTAX

   for (int i = 0; i < arr.length; i++) {
       if (arr[i] == target) {
           System.out.println(i);
           break;
       }
   }

4. IMPORTANT VARIABLES
   arr     = array to search
   target  = element to find
   i       = current index
   index   = stores the found index

5. NOT FOUND HANDLING

   int index = -1;

   If found:
       index = i;

   If index == -1:
       element was not found.

6. WHY USE -1?
   Valid array indexes start at 0.
   Therefore, -1 represents "not found".

7. WHY USE break?
   Stops the loop once the target is found.
   No need to check remaining elements.

8. TIME COMPLEXITY
   Best case:  O(1)      — first element matches
   Worst case: O(n)      — last element or not found
   Space:      O(1)      — uses constant extra space

9. EXAMPLE

   int[] arr = {15, 8, 25, 42, 10};
   int target = 42;

   Result: Found at index 3

10. REMEMBER
    - arr.length = total number of elements
    - Last index = arr.length - 1
    - Use == to compare primitive int values
    - Linear Search works without sorting the array

========================================
*/
