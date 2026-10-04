void main () {

    int[] arr = {50,30,20,45,60};
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    int avg = sum / arr.length;
    System.out.println("Average of these " + arr.length + " is " + avg);
}




/*
ARRAY 09 — AVERAGE

- Average = Sum / Number of elements.

Steps:
1. Find sum of all elements.
2. Divide sum by arr.length.

Example:
int sum = 0;

for (int i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}

double average = (double) sum / arr.length;

- Use double when the average can contain decimals.

Remember:
Average = Total Sum / Total Count
*/