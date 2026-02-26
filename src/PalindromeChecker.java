import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = checkPalindrome(input);

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }

    public static boolean checkPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}