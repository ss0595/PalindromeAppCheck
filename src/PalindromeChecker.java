import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input text: ");
        String input = scanner.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}