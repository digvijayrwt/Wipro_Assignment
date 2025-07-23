import java.util.Scanner;

public class StringAssignmentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringUtility util = new StringUtility();

        String str;
        int choice;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Count vowels and consonants");
            System.out.println("2. Check if the string is a palindrome");
            System.out.println("3. Reverse the string");
            System.out.println("4. Convert to UPPERCASE and lowercase");
            System.out.println("5. Replace a word in the string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    int vowels = util.countVowels(str);
                    int consonants = util.countConsonants(str);
                    System.out.println("Vowels: " + vowels);
                    System.out.println("Consonants: " + consonants);
                    break;

                case 2:
                    boolean isPalin = util.isPalindrome(str);
                    if (isPalin)
                        System.out.println("The string is a palindrome.");
                    else
                        System.out.println("The string is not a palindrome.");
                    break;

                case 3:
                    String reversed = util.reverseString(str);
                    System.out.println("Reversed String: " + reversed);
                    break;

                case 4:
                    System.out.println("UPPERCASE: " + util.toUpperCase(str));
                    System.out.println("lowercase: " + util.toLowerCase(str));
                    break;

                case 5:
                    System.out.print("Enter word to be replaced: ");
                    String oldWord = sc.nextLine();
                    System.out.print("Enter new word: ");
                    String newWord = sc.nextLine();
                    str = util.replaceWord(str, oldWord, newWord);
                    System.out.println("Updated String: " + str);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
