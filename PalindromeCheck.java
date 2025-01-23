public class PalindromeCheck {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Removing spaces and converting to lowercase for case-insensitive comparison
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama"; // Example input
        boolean result = isPalindrome(input);
        System.out.println("Is the string a palindrome? " + result);
    }
}
