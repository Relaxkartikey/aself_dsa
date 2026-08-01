void main () {
    int n = 5;
    for(int i=1;i<=n;i++) {

        //spaces

        for(int s=1;s<=n-i;s++) {

            System.out.print(" ");

        }

        // stars

        for (int j=1;j<=2*i-1;j++) {

            System.out.print("*");

        }

        System.out.println();

    }

}



/*
Pattern 07

Rows = N

Spaces = N - Row

Stars = 2 * Row - 1

Print Order:

Spaces

↓

Stars

↓

Next Line
*/