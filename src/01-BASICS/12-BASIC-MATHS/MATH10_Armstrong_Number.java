void main() {

    int n = 153;
    int o = n;

    int digits = 0;
    int temp = n;

    while (temp > 0) {
        digits++;
        temp /= 10;
    }

    int sum =0;
    temp = n;

    while (temp > 0) {
        int digit = temp % 10;

        sum = sum + (int) Math.pow(digit, digits);
        temp /= 10;
    }

    if (sum == o) {
        System.out.println(o + " is an Armstrong number");
    } else  {
        System.out.println(o + " is not an Armstrong number");
    }
}