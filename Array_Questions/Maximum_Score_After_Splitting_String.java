public class Maximum_Score_After_Splitting_String {
    public int maxScore(String s) {
        int n = s.length();
        int ones = 0; // Count total ones in the string

        for (int i = 0; i < n; i++)
            if (s.charAt(i) == '1')
                ones++;

        int zeros = 0; // Count zeros in the left substring
        int maxScore = 0;

        for (int i = 0; i < n - 1; i++) { // Exclude the last split
            if (s.charAt(i) == '0')
                zeros++;
            else
                ones--;
            maxScore = Math.max(maxScore, zeros + ones);
        }

        return maxScore;
    }
    public static void main(String[] args) {
        Maximum_Score_After_Splitting_String obj = new Maximum_Score_After_Splitting_String();
        String s = "011101";
        System.out.println("Maximum Score: " + obj.maxScore(s));
    }
}
