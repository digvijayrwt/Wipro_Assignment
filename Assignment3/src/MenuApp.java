import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations mathOps = new MathOperations();
        int choice;

        do {
            System.out.println("\n********** MATH MENU **********");
            System.out.println("1. Print Table");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int num;
            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    num = sc.nextInt();
                    mathOps.printTable(num);
                    break;
                case 2:
                    System.out.print("Enter number: ");
                    num = sc.nextInt();
                    mathOps.calculateFactorial(num);
                    break;
                case 3:
                    System.out.print("Enter number: ");
                    num = sc.nextInt();
                    mathOps.checkPrime(num);
                    break;
                case 4:
                    System.out.print("Enter number of terms: ");
                    num = sc.nextInt();
                    mathOps.printFibonacci(num);
                    break;
                case 5:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        } while (choice != 5);

        sc.close();
    }
}