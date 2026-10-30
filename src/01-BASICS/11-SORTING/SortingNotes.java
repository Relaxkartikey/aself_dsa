
/*
==================================================
                BASIC SORTING NOTES
==================================================

WHAT IS SORTING?
Sorting means arranging elements in ascending
(smallest to largest) or descending order.

Example:
{3, 1, 2} -> {1, 2, 3}


==================================================
1. BUBBLE SORT
==================================================

IDEA:
Compare neighboring elements and swap them
if the left element is greater.

EXAMPLE:
Start: {3, 1, 2}

Pass 1:
Compare 3 and 1 -> swap -> {1, 3, 2}
Compare 3 and 2 -> swap -> {1, 2, 3}

Result: {1, 2, 3}

REMEMBER:
Largest element moves to the end in each pass.

Time: Best O(n) with optimization;
      Average/Worst O(n²)
Space: O(1)


==================================================
2. SELECTION SORT
==================================================

IDEA:
Find the smallest element and place it
at the beginning of the unsorted part.

EXAMPLE:
Start: {3, 1, 2}

Pass 1:
Smallest is 1 -> swap with 3 -> {1, 3, 2}

Pass 2:
Smallest remaining is 2 -> swap with 3
Result: {1, 2, 3}

REMEMBER:
Find the minimum, then swap it into position.

Time: Best/Average/Worst O(n²)
Space: O(1)


==================================================
3. INSERTION SORT
==================================================

IDEA:
Take one element and insert it into its
correct position among the elements on its left.

EXAMPLE:
Start: {3, 1, 2}

Pass 1:
Take 1, shift 3 right -> {1, 3, 2}

Pass 2:
Take 2, shift 3 right -> {1, 2, 3}

REMEMBER:
Shift bigger elements right and insert the key.

Time: Best O(n);
      Average/Worst O(n²)
Space: O(1)


==================================================
QUICK COMPARISON
==================================================

Bubble Sort:
Compares neighbors and swaps them.

Selection Sort:
Finds the smallest element and swaps it.

Insertion Sort:
Inserts each element into its correct position.


==================================================
IMPORTANT TERMS
==================================================

arr.length:
Total number of elements.

arr.length - 1:
Last valid index.

temp:
Temporarily stores a value during swapping.

key:
The element being inserted in Insertion Sort.

minIndex:
Index of the smallest element in Selection Sort.

==================================================
*/
