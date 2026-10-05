/*
 ============================================================
                    ARRAY NOTES
 ============================================================

 1. WHAT IS AN ARRAY?
 ------------------------------------------------------------
 Array stores multiple values of the SAME data type.

 Example:
 int[] arr = {10, 20, 30, 40};

 Index:
          0   1   2   3
 arr =  [10, 20, 30, 40]

 IMPORTANT:
 - Index starts from 0.
 - arr.length gives NUMBER of elements.
 - Last index = arr.length - 1.


 2. CREATING AN ARRAY
 ------------------------------------------------------------

 Direct values:
 int[] arr = {10, 20, 30, 40};

 Empty array with fixed size:
 int[] arr = new int[5];

 This creates:

 index:  0   1   2   3   4
 value:  0   0   0   0   0

 Why 0?
 Java gives int arrays a default value of 0.


 3. ACCESSING ELEMENTS
 ------------------------------------------------------------

 System.out.println(arr[2]);

 Gives the value at index 2.

 Example:
 {10, 20, 30, 40}
           ↑
         arr[2] = 30


 4. UPDATING AN ELEMENT
 ------------------------------------------------------------

 arr[2] = 99;

 Before:
 {10, 20, 30, 40}

 After:
 {10, 20, 99, 40}


 5. TRAVERSING AN ARRAY
 ------------------------------------------------------------

 for (int i = 0; i < arr.length; i++) {
     System.out.println(arr[i]);
 }

 WHY i < arr.length?

 If length = 5:

 Valid indexes = 0,1,2,3,4

 arr[5] does NOT exist.

 So:
 i < arr.length
 means
 i < 5
 → 0 to 4


 6. TAKING ARRAY INPUT
 ------------------------------------------------------------

 Scanner sc = new Scanner(System.in);

 int[] numbers = new int[5];

 for (int i = 0; i < numbers.length; i++) {
     numbers[i] = sc.nextInt();
 }

 DOUBT:
 Why do we need BOTH new int[5] and numbers[i]?

 ANSWER:
 new int[5] → creates 5 empty spaces.

 numbers[i] = sc.nextInt()
 → takes input and stores it in the current space.

 Example:
 Input: 10 20 30

 numbers becomes:
 [10, 20, 30, 0, 0]


 7. SUM OF ARRAY
 ------------------------------------------------------------

 int sum = 0;

 for (int i = 0; i < arr.length; i++) {
     sum = sum + arr[i];
 }

 IMPORTANT:
 sum stores the running total.

 Example:
 0 → 10 → 30 → 60


 8. MAXIMUM ELEMENT
 ------------------------------------------------------------

 int max = arr[0];

 for (int i = 1; i < arr.length; i++) {
     if (arr[i] > max) {
         max = arr[i];
     }
 }

 WHY max = arr[0]?

 We need an actual array value to compare with.

 We start from index 1 because index 0 is already
 being used as the initial maximum.


 9. MINIMUM ELEMENT
 ------------------------------------------------------------

 Same idea as maximum:

 int min = arr[0];

 for (int i = 1; i < arr.length; i++) {
     if (arr[i] < min) {
         min = arr[i];
     }
 }


 10. AVERAGE
 ------------------------------------------------------------

 Average = Sum / Number of elements

 int sum = 0;

 for (int i = 0; i < arr.length; i++) {
     sum += arr[i];
 }

 double average = (double) sum / arr.length;

 DOUBT:
 Why use (double)?

 int / int gives an integer result.

 Example:
 5 / 2 = 2

 But:
 (double) 5 / 2 = 2.5


 11. COUNT / FREQUENCY
 ------------------------------------------------------------

 To count how many times a value appears:

 int count = 0;
 int target = 20;

 for (int i = 0; i < arr.length; i++) {
     if (arr[i] == target) {
         count++;
     }
 }

 count = number of occurrences of target.


 12. LINEAR SEARCH
 ------------------------------------------------------------

 Search for a value one-by-one.

 int target = 40;
 int index = -1;

 for (int i = 0; i < arr.length; i++) {

     if (arr[i] == target) {
         index = i;
         break;
     }
 }

 WHY index = -1?

 Valid array indexes start from 0.

 So -1 can represent:
 "Element was NOT found."

 break stops searching once we find the element.


 13. REVERSE AN ARRAY
 ------------------------------------------------------------

 Use TWO POINTERS:

 int left = 0;
 int right = arr.length - 1;

 while (left < right) {

     int temp = arr[left];
     arr[left] = arr[right];
     arr[right] = temp;

     left++;
     right--;
 }

 Example:

 [10, 20, 30, 40, 50]
  ↑               ↑
 left            right

 Swap:

 [50, 20, 30, 40, 10]

 Move pointers inward:

    ↑           ↑
   left       right

 Continue until they meet.

 IMPORTANT DOUBT:
 Why not print inside the while loop?

 Because while is performing the reversal.
 Print AFTER reversal is complete.

 for (int i = 0; i < arr.length; i++) {
     System.out.println(arr[i]);
 }


 14. COPYING AN ARRAY
 ------------------------------------------------------------

 int[] copy = new int[arr.length];

 for (int i = 0; i < arr.length; i++) {
     copy[i] = arr[i];
 }

 IMPORTANT:
 copy[i] = arr[i]
 means:

 Take value from arr
        ↓
 Put it into copy

 Example:

 arr  → [10, 20, 30]
 copy → [10, 20, 30]


 15. SECOND LARGEST
 ------------------------------------------------------------

 Basic approach:

 int max = arr[0];
 int secondMax = arr[0];

 for (int i = 1; i < arr.length; i++) {

     if (arr[i] > max) {

         secondMax = max;
         max = arr[i];
     }
 }

 WHY secondMax = max?

 Suppose:

 max = 70
 secondMax = 50

 New value = 90

 90 is the new maximum.

 Old max (70) becomes second maximum:

 secondMax = 70
 max = 90

 IMPORTANT DOUBT:
 Why not use arr[i - 1]?

 Because the previous INDEX is not necessarily
 the second-largest VALUE.

 Example:
 [10, 80, 20, 50]

 When 80 is found:
 arr[i - 1] = 10

 But second largest is 50.

 Therefore:
 secondMax = max
 is the correct idea.


 16. COMMON ARRAY RULES
 ------------------------------------------------------------

 Remember:

 arr.length
 → number of elements

 arr.length - 1
 → last valid index

 i < arr.length
 → safe traversal

 arr[i]
 → value at current index

 i
 → current position/index

 break
 → stop loop immediately

 temp
 → commonly used to swap two values


 17. BASIC ARRAY MINDSET
 ------------------------------------------------------------

 Most beginner array problems use:

 1. Traversal
 2. Condition
 3. Variable to store answer
 4. Sometimes two pointers
 5. Sometimes swapping

 Example:

 "Find maximum"
 → traverse + condition + max variable

 "Count number"
 → traverse + condition + count variable

 "Search"
 → traverse + condition + index variable

 "Reverse"
 → two pointers + swap

 "Second largest"
 → traverse + max + secondMax


 ============================================================
 NEXT:
 Basic Arrays → Strings → Searching → Sorting
 ============================================================
*/