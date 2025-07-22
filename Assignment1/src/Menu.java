import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continueMenu;

        do {
            System.out.println("********** MENU **********");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Table
                    System.out.print("Enter the number: ");
                    int tableNum = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
                    }
                    break;

                case 2: // Factorial
                    System.out.print("Enter the number: ");
                    int factNum = sc.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + factNum + " is " + factorial);
                    break;

                case 3: // Prime Check
                    System.out.print("Enter the number: ");
                    int primeNum = sc.nextInt();
                    boolean isPrime = true;
                    if (primeNum <= 1) {
                        isPrime = false;
                    } else {
                        int i = 2;
                        while (i <= Math.sqrt(primeNum)) {
                            if (primeNum % i == 0) {
                                isPrime = false;
                                break;
                            }
                            i++;
                        }
                    }
                    System.out.println(primeNum + (isPrime ? " is a Prime Number." : " is not a Prime Number."));
                    break;

                case 4: // Fibonacci
                    System.out.print("Enter the number of terms: ");
                    int n = sc.nextInt();
                    int a = 0, b = 1;
                    System.out.print("Fibonacci Series: ");
                    for (int i = 1; i <= n; i++) {
                        System.out.print(a + " ");
                        int next = a + b;
                        a = b;
                        b = next;
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting program. Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Back to Menu? (Y/N): ");
            continueMenu = sc.next().charAt(0);
        } while (continueMenu == 'Y' || continueMenu == 'y');

        sc.close();
        System.out.println("Program Ended.");
    }
}
