void main () {
    int n = 5;
    for (int i = 1; i <= n; i++) {

        for  (int s = 1; s <=i-1; s++) {
            System.out.print(" ");

        }
        for (int j = 1; j <=2*(n-i) + 1; j++) {

            System.out.print("*");
        }

        System.out.println();

    }

}


/*
Pattern 08

Rows = N

Spaces = Row - 1

Stars = 2 × (N - Row) + 1

Print Order:

Spaces

↓

Stars

↓

Next Line
*/