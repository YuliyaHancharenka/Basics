package interviewsTasks;

public class PalindromeTask {

    public static void main(String[] args) {
        String s = "acdedca";
        boolean isPalindrome = isPalindrome(s);
        System.out.print(s + " is " + (isPalindrome ? "palindrome" : "not palindrome"));
    }

    private static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
