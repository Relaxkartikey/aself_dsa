void main () {

    int n = 5;
    for (int i = 1; i <= n; i++) {

        for  (int j = 1; j <= n - i + 1; j++) {
            System.out.print("* ");

        }

        System.out.println();

    }


}



/*
Pattern 05

Rows = N
Columns = N - Row + 1
Print = *

Inner Loop:

col <= n - row + 1
*/