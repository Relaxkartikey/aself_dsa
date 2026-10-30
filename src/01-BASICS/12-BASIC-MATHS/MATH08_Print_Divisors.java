void main () {

    int n =12;

    System.out.print("Divisors: ");

    for (int i = 1; i <= n; i++) {

        if (n % i == 0) {

            System.out.print(i + " ");
        }
    }
}