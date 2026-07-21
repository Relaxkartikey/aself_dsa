import java.util.Scanner;

void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        // Output using printf for clean formatting
        System.out.println("\n--- Student Info ---");
        System.out.printf("Name : %s%n", name);
        System.out.printf("Age  : %d years%n", age);
        System.out.printf("CGPA : %.2f%n", cgpa);

        sc.close();
    }