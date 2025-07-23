public class MathOperations {

    // Method to print multiplication table
    public void printTable(int number) {
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    // Method to calculate factorial
    public void calculateFactorial(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        long fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    // Method to check if a number is prime
    public void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    // Method to print Fibonacci series
    public void printFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        int a = 0, b = 1;
        System.out.print(a + " ");
        for (int i = 1; i < terms; i++) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
