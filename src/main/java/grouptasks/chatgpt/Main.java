package grouptasks.chatgpt;

public class Main {
    public static void main(String[] args) {

        // Check if a word is palindrome
        String str = "Hello";
        checkPalindrome(str);
    }

    public static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void checkPalindrome(String str) {
        String reversedStr = reverseString(str);
        if (reversedStr.equalsIgnoreCase(str)) {
            System.out.println("This word is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
    }
}
