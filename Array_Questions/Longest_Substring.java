import java.util.Scanner;

public class Longest_Substring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)]) {
                    break;
                }
                visited[s.charAt(j)] = true;
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();

        Longest_Substring obj = new Longest_Substring();
        int result = obj.lengthOfLongestSubstring(s);

        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}

