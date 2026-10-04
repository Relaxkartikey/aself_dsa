import java.util.*;

void main () {


    int[] marks2 = new int[5];

    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < marks2.length; i++){
        System.out.println("Enter marks #"+ i +": ");

        marks2[i] = sc.nextInt();
    }

    for (int i = 0; i < marks2.length; i++){
        System.out.println(marks2[i]);
    }

}


/*
ARRAY 05 — ARRAY INPUT

- We can take array values from the user using Scanner.

Steps:
1. Create Scanner.
2. Create array with required size.
3. Use a loop to take each value.
4. Store input using:

arr[i] = sc.nextInt();

Example:

int[] arr = new int[5];

for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
}

Remember:
i → tells which index to fill.
nextInt() → takes integer input.
*/
