import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Reverse_Vowels_String {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while(left < right){
            while(left < right && !vowels.contains(chars[left])){
                left++;
            }
            while(left < right && !vowels.contains(chars[right])){
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Reverse_Vowels_String obj = new Reverse_Vowels_String();
        System.out.println(obj.reverseVowels("hello"));      // holle
        System.out.println(obj.reverseVowels("leetcode"));
    }
}
