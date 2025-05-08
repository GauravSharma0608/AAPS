public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Valid_Palindrome vp = new Valid_Palindrome();

        // Test examples
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";

        System.out.println("Is Palindrome? " + vp.isPalindrome(input1)); // true
        System.out.println("Is Palindrome? " + vp.isPalindrome(input2));
    }
}
