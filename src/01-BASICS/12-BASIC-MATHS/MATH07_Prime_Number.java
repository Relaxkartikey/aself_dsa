// Prime Number:
// A prime number is greater than 1 and has exactly two factors.
// Check divisors from 2 while i * i <= n.
// If n % i == 0, it is not prime.
// Time: O(sqrt(n)), Space: O(1).


void main() {
    int n = 7;
    boolean isPrime = true;


    if (n <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    System.out.println(isPrime ? "Prime" : "Not Prime");

}



/* easy approach count primes.

int count = 0;

for (int i = 2; i < n; i++) {
    boolean prime = true;

    for (int j = 2; j < i; j++) {
        if (i % j == 0) {
            prime = false;
            break;
        }
    }

    if (prime) {
        count++;
    }
}
 */ // there is one called Sieve of Eratosthenes.