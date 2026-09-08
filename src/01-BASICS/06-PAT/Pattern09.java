void main() {


    int n1=5;
    int n2=5;

    for(int i =1; i<=n1; i++) {

        for (int s=1; s<=n1-i; s++) {
            System.out.print(" ");
        }

        for(int j=1; j<=2*i -1; j++) {
            System.out.print("*");

        }

        System.out.println();

    }

    for (int i2=1; i2<=n2; i2++) {

        for (int s=1; s<=i2-1; s++) {

            System.out.print(" ");

        }

        for (int j=1; j<=2*n2 -(2*i2 - 1); j++) {

            System.out.print("*");
        }
        System.out.println();
    }

}


/*
Pattern 09

Top:
Spaces = n - row
Stars  = 2 * row - 1

Bottom:
Spaces = row - 1
Stars  = 2 * (n - row) + 1

Concept:
Pattern 07 + Pattern 08
*/