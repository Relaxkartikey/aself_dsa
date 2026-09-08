import java.util.Scanner;

void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();  // ← FIX: flush the leftover \n

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // now reads correctly

        System.out.printf("Hello %s, you are %d years old!%n", name, age);
        sc.close();
    }
