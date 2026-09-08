import java.util.Scanner;   // ← must import at the top

void main() {
        Scanner sc = new Scanner(System.in);  // create Scanner

        System.out.print("Enter your name: ");
        String name = sc.nextLine();          // reads a full line of text

        System.out.print("Enter your age: ");
        int age = sc.nextInt();               // reads an integer

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        sc.close();                           // good habit: close scanner
    }