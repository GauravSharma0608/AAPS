public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String pref = strs[0];
        int prefLen = pref.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
                prefLen--;
                if (prefLen == 0) {
                    return "";
                }
                pref = pref.substring(0, prefLen);
            }
        }

        return pref;
    }
    public static void main(String[] args) {
        Longest_Common_Prefix obj = new Longest_Common_Prefix();
        String[] strs = {"flower", "flow", "flight"};
        String result = obj.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
