import java.util.Scanner;

public class Equal_String {
    public boolean strings_Are_equal(String[] word1, String[] word2) {
        StringBuilder Str1 = new StringBuilder();
        StringBuilder Str2 = new StringBuilder();

        for (String word : word1) {
            Str1.append(word);
        }

        for (String word : word2) {
            Str2.append(word);  // ✅ Fixed incorrect append
        }

        return Str1.toString().equals(Str2.toString()); // ✅ Simplified return
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word1 (space-separated strings): ");
        String[] word1 = sc.nextLine().split(" ");  // ✅ Splitting input into array

        System.out.println("Enter word2 (space-separated strings): ");
        String[] word2 = sc.nextLine().split(" ");  // ✅ Splitting input into array

        Equal_String obj = new Equal_String();  // ✅ Fixed class instantiation
        System.out.println("Are the two string arrays equal? " + obj.strings_Are_equal(word1, word2));

        sc.close();  // ✅ Closing scanner to prevent memory leak
    }
}
